package net.lacrox.arcamobs.entity.client.otter;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.OtterEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class OtterModel<T extends OtterEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer OTTER = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "otter"), "main");

    private final ModelPart otter;
    private final ModelPart head;

    public OtterModel(ModelPart root) {
        this.otter = root.getChild("otter");
        this.head = this.otter.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData otter = modelPartData.addChild("otter", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.5F, 0.0F));

        ModelPartData head = otter.addChild("head", ModelPartBuilder.create().uv(28, 20).cuboid(-3.0F, -3.0F, -6.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.75F, -7.5F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(26, 35).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -1.0F, -3.0F, 0.0F, 0.3927F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(24, 35).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.0F, -3.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(36, 32).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, -6.0F));

        ModelPartData body = otter.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -9.0F, -7.5F, 5.0F, 5.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData backLegL = otter.addChild("backLegL", ModelPartBuilder.create().uv(28, 32).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(36, 35).cuboid(-1.0F, 4.0F, -2.0F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.75F, -4.525F, 6.25F));

        ModelPartData backLegR = otter.addChild("backLegR", ModelPartBuilder.create().uv(0, 35).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(36, 38).mirrored().cuboid(-1.0F, 4.0F, -2.0F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.75F, -4.525F, 6.25F));

        ModelPartData frontLegR = otter.addChild("frontLegR", ModelPartBuilder.create().uv(16, 35).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.75F, -4.5F, -6.0F));

        ModelPartData frontLegL = otter.addChild("frontLegL", ModelPartBuilder.create().uv(8, 35).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.75F, -4.5F, -6.0F));

        ModelPartData tail = otter.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.5F, 7.5F));

        ModelPartData cube_r3 = tail.addChild("cube_r3", ModelPartBuilder.create().uv(0, 20).cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(OtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(OtterAnimations.ANIM_OTTER_WALK, limbSwing, limbSwingAmount, 3f, 3f);
        this.updateAnimation(entity.idleAnimationState, OtterAnimations.ANIM_OTTER_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        otter.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return otter;
    }
}
