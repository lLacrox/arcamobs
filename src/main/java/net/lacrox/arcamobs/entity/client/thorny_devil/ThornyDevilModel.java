package net.lacrox.arcamobs.entity.client.thorny_devil;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.ThornyDevilEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class ThornyDevilModel<T extends ThornyDevilEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer THORNYDEVIL = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "thornydevil"), "main");

    private final ModelPart thorny_devil;
    private final ModelPart head;

    public ThornyDevilModel(ModelPart root) {
        this.thorny_devil = root.getChild("thorny_devil");
        this.head = this.thorny_devil.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData thorny_devil = modelPartData.addChild("thorny_devil", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.5F, 0.0F));

        ModelPartData head = thorny_devil.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -2.0F, -6.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F))
                .uv(22, 0).cuboid(-2.5F, -5.0F, -6.0F, 5.0F, 3.0F, 6.0F, new Dilation(0.0F))
                .uv(45, -6).cuboid(0.0F, -5.0F, -6.0F, 0.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, -4.0F));

        ModelPartData falseHead = head.addChild("falseHead", ModelPartBuilder.create().uv(52, 24).cuboid(-1.0F, -2.3827F, -0.0761F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(61, 26).cuboid(0.0F, -4.3827F, 0.4239F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -1.5F, -0.3927F, 0.0F, 0.0F));

        ModelPartData cube_r1 = falseHead.addChild("cube_r1", ModelPartBuilder.create().uv(61, 26).cuboid(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.3827F, 0.9239F, 0.0F, 1.5708F, 0.0F));

        ModelPartData body = thorny_devil.addChild("body", ModelPartBuilder.create().uv(0, 9).cuboid(-3.5F, -2.0F, -4.0F, 7.0F, 4.0F, 8.0F, new Dilation(0.0F))
                .uv(30, 11).cuboid(-3.5F, -4.0F, -4.0F, 7.0F, 2.0F, 8.0F, new Dilation(0.0F))
                .uv(45, -4).cuboid(0.0F, -4.0F, -4.0F, 0.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

        ModelPartData tail1 = body.addChild("tail1", ModelPartBuilder.create().uv(0, 21).cuboid(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(16, 23).cuboid(-1.5F, -2.5F, 0.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F))
                .uv(45, 2).cuboid(0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 4.0F));

        ModelPartData tail2 = tail1.addChild("tail2", ModelPartBuilder.create().uv(32, 18).cuboid(0.0F, -3.5F, 0.0F, 0.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 5.0F));

        ModelPartData rightFrontArm = thorny_devil.addChild("rightFrontArm", ModelPartBuilder.create(), ModelTransform.of(-3.0F, -2.0F, -2.5F, 0.0F, 0.0F, 1.5708F));

        ModelPartData cube_r2 = rightFrontArm.addChild("cube_r2", ModelPartBuilder.create().uv(45, 25).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData leftFrontArm = thorny_devil.addChild("leftFrontArm", ModelPartBuilder.create(), ModelTransform.of(3.0F, -2.0F, -2.5F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r3 = leftFrontArm.addChild("cube_r3", ModelPartBuilder.create().uv(45, 25).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        ModelPartData rightBackArm = thorny_devil.addChild("rightBackArm", ModelPartBuilder.create(), ModelTransform.of(-3.0F, -2.0F, 2.5F, 0.0F, 0.0F, 1.5708F));

        ModelPartData cube_r4 = rightBackArm.addChild("cube_r4", ModelPartBuilder.create().uv(45, 25).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData leftBackArm = thorny_devil.addChild("leftBackArm", ModelPartBuilder.create(), ModelTransform.of(3.0F, -2.0F, 2.5F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r5 = leftBackArm.addChild("cube_r5", ModelPartBuilder.create().uv(45, 25).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }
    @Override
    public void setAngles(ThornyDevilEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(ThornyDevilAnimations.ANIM_THORNY_DEVIL_WALK, limbSwing, limbSwingAmount, 10f, 16f);
        this.updateAnimation(entity.idleAnimationState, ThornyDevilAnimations.ANIM_THORNY_DEVIL_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        thorny_devil.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return thorny_devil;
    }
}