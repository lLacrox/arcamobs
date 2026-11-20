package net.lacrox.arcamobs.entity.client.boar;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.BoarEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class BoarModel<T extends BoarEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer BOAR = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "boar"), "main");

    private final ModelPart boar;
    private final ModelPart head;

    public BoarModel(ModelPart root) {
        this.boar = root.getChild("boar");
        this.head = this.boar.getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData boar = modelPartData.addChild("boar", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = boar.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -3.0F, -5.0F, 7.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -14.0F, -11.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(26, 23).cuboid(0.0F, -5.0F, -4.0F, 0.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 4.0F, -5.0F, 0.7854F, 0.3927F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(26, 23).cuboid(0.0F, -5.0F, -4.0F, 0.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 4.0F, -5.0F, 0.7854F, -0.3927F, 0.0F));

        ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(0, 23).cuboid(-2.5F, -4.0F, -4.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.25F))
                .uv(0, 15).cuboid(-2.5F, -4.0F, -4.0F, 5.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, -5.0F));

        ModelPartData earRight = head.addChild("earRight", ModelPartBuilder.create().uv(55, 8).cuboid(-1.0F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -2.0F, -2.5F));

        ModelPartData earLeft = head.addChild("earLeft", ModelPartBuilder.create().uv(55, 8).mirrored().cuboid(-2.0F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -2.0F, -2.5F));

        ModelPartData body = boar.addChild("body", ModelPartBuilder.create().uv(24, 4).cuboid(-4.5F, -6.0F, -11.0F, 9.0F, 12.0F, 11.0F, new Dilation(0.0F))
                .uv(28, 27).cuboid(-3.5F, -5.0F, 0.0F, 7.0F, 9.0F, 9.0F, new Dilation(0.0F))
                .uv(0, 54).cuboid(-3.5F, 4.0F, 0.0F, 7.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(29, 46).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F))
                .uv(21, -4).cuboid(0.0F, -0.5F, 4.0F, 0.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 9.0F));

        ModelPartData legRight = boar.addChild("legRight", ModelPartBuilder.create().uv(0, 32).mirrored().cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 9.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -8.0F, -6.5F));

        ModelPartData legLeft = boar.addChild("legLeft", ModelPartBuilder.create().uv(0, 32).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 9.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -8.0F, -6.5F));

        ModelPartData hindLegRight = boar.addChild("hindLegRight", ModelPartBuilder.create().uv(0, 44).mirrored().cuboid(-1.5F, -1.0F, -3.5F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)).mirrored(false)
                .uv(16, 46).mirrored().cuboid(-1.5F, 4.0F, -1.5F, 3.0F, 5.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -9.0F, 6.5F));

        ModelPartData hindLegLeft = boar.addChild("hindLegLeft", ModelPartBuilder.create().uv(0, 44).cuboid(-1.5F, -1.0F, -3.5F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(16, 46).cuboid(-1.5F, 4.0F, -1.5F, 3.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -9.0F, 6.5F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(BoarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(BoarAnimations.ANIM_BOAR_WALK, limbSwing, limbSwingAmount, 3f, 3f);
        this.updateAnimation(entity.idleAnimationState, BoarAnimations.ANIM_BOAR_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int colour) {
        boar.render(matrices, vertexConsumer, light, overlay, colour);
    }

    @Override
    public ModelPart getPart() {
        return boar;
    }
}
