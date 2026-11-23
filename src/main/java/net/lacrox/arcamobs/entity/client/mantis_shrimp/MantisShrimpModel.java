package net.lacrox.arcamobs.entity.client.mantis_shrimp;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.MantisShrimpEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class MantisShrimpModel<T extends MantisShrimpEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer MANTISSHRIMP = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "mantisshrimp"), "main");

    private final ModelPart mantis_shrimp;
    private final ModelPart head;

    public MantisShrimpModel(ModelPart root) {
        this.mantis_shrimp = root.getChild("mantis_shrimp");
        this.head = this.mantis_shrimp.getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData mantis_shrimp = modelPartData.addChild("mantis_shrimp", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = mantis_shrimp.addChild("body", ModelPartBuilder.create().uv(0, 19).cuboid(-4.0F, -2.5F, -1.0F, 8.0F, 6.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.5F, -3.0F));

        ModelPartData legBackRight = body.addChild("legBackRight", ModelPartBuilder.create().uv(34, 18).cuboid(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 3.0F, -0.5F));

        ModelPartData legBackLeft = body.addChild("legBackLeft", ModelPartBuilder.create().uv(34, 18).cuboid(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 3.0F, -0.5F));

        ModelPartData secondaryLegs = body.addChild("secondaryLegs", ModelPartBuilder.create().uv(42, 25).cuboid(-3.5F, -1.0F, 1.0F, 7.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.5F, 1.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(0, 38).cuboid(-6.0F, 0.0F, -1.0F, 12.0F, 4.0F, 8.0F, new Dilation(0.0F))
                .uv(40, 40).cuboid(-6.0F, 0.0F, -1.0F, 12.0F, 3.0F, 8.0F, new Dilation(-0.35F)), ModelTransform.pivot(0.0F, -1.5F, 12.0F));

        ModelPartData head = mantis_shrimp.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -10.0F, -7.0F, 10.0F, 12.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, -3.0F));

        ModelPartData eyeStalkRight = head.addChild("eyeStalkRight", ModelPartBuilder.create().uv(35, 0).mirrored().cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -9.5F, -3.5F));

        ModelPartData eyeStalkLeft = head.addChild("eyeStalkLeft", ModelPartBuilder.create().uv(35, 0).cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -9.5F, -3.5F));

        ModelPartData legFrontRight = head.addChild("legFrontRight", ModelPartBuilder.create().uv(30, 18).cuboid(0.0F, -0.5F, -1.5F, 0.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 1.5F, -2.5F));

        ModelPartData legFrontLeft = head.addChild("legFrontLeft", ModelPartBuilder.create().uv(30, 18).cuboid(0.0F, -0.5F, -1.5F, 0.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 1.5F, -2.5F));

        ModelPartData armRight = head.addChild("armRight", ModelPartBuilder.create().uv(34, 7).mirrored().cuboid(-1.5F, -6.0F, -4.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-3.0F, -1.0F, -7.0F));

        ModelPartData beaterRight = armRight.addChild("beaterRight", ModelPartBuilder.create().uv(48, 3).mirrored().cuboid(-2.5F, -1.0F, -5.0F, 5.0F, 11.0F, 5.0F, new Dilation(0.0F)).mirrored(false)
                .uv(75, 22).cuboid(-2.5F, -1.0F, -5.0F, 5.0F, 11.0F, 5.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -5.5F, -1.0F));

        ModelPartData armLeft = head.addChild("armLeft", ModelPartBuilder.create().uv(34, 7).cuboid(-1.5F, -6.0F, -4.0F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -1.0F, -7.0F));

        ModelPartData beaterLeft = armLeft.addChild("beaterLeft", ModelPartBuilder.create().uv(48, 3).cuboid(-2.5F, -1.0F, -5.0F, 5.0F, 11.0F, 5.0F, new Dilation(0.0F))
                .uv(75, 22).cuboid(-2.5F, -1.0F, -5.0F, 5.0F, 11.0F, 5.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -5.5F, -1.0F));

        ModelPartData antennaeRight = head.addChild("antennaeRight", ModelPartBuilder.create().uv(56, 0).mirrored().cuboid(-6.0F, 0.0F, -11.75F, 7.0F, 0.0F, 12.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.0F, -9.5F, -7.0F));

        ModelPartData antennaeLeft = head.addChild("antennaeLeft", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -11.75F, 7.0F, 0.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -9.5F, -7.0F));

        ModelPartData antennalScaleRight = head.addChild("antennalScaleRight", ModelPartBuilder.create().uv(68, 14).mirrored().cuboid(-10.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-4.0F, -8.4F, -7.1F));

        ModelPartData antennalScaleLeft = head.addChild("antennalScaleLeft", ModelPartBuilder.create().uv(68, 14).cuboid(0.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -8.4F, -7.1F));
        return TexturedModelData.of(modelData, 96, 64);
    }
    @Override
    public void setAngles(MantisShrimpEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(MantisShrimpAnimations.ANIM_MANTIS_SHRIMP_SWIM, limbSwing, limbSwingAmount, 1.5f, 1.5f);
        this.updateAnimation(entity.idleAnimationState, MantisShrimpAnimations.ANIM_MANTIS_SHRIMP_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        mantis_shrimp.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return mantis_shrimp;
    }
}
