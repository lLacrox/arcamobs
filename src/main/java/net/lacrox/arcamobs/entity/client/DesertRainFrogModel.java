package net.lacrox.arcamobs.entity.client;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.DesertRainFrogEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DesertRainFrogModel<T extends DesertRainFrogEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer DESERTRAINFROG = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "desertrainfrog"), "main");

    private final ModelPart desertrainfrog;

    public DesertRainFrogModel(ModelPart root) {
        this.desertrainfrog = root.getChild("desertrainfrog");;
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData desertrainfrog = modelPartData.addChild("desertrainfrog", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 23.0F, 0.0F));

        ModelPartData body = desertrainfrog.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData mouth = body.addChild("mouth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.0F, -3.0F));

        ModelPartData cube_r1 = mouth.addChild("cube_r1", ModelPartBuilder.create().uv(1, 13).cuboid(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        ModelPartData right_leg = desertrainfrog.addChild("right_leg", ModelPartBuilder.create().uv(0, 22).mirrored().cuboid(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(9, 12).cuboid(-2.0F, 1.975F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, -1.5F));

        ModelPartData left_leg = desertrainfrog.addChild("left_leg", ModelPartBuilder.create().uv(0, 22).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(9, 15).cuboid(-1.0F, 1.975F, -2.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, -1.5F));

        ModelPartData right_hind = desertrainfrog.addChild("right_hind", ModelPartBuilder.create().uv(0, 17).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
                .uv(9, 15).cuboid(-3.0F, 1.975F, -3.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, 3.0F));

        ModelPartData left_hind = desertrainfrog.addChild("left_hind", ModelPartBuilder.create().uv(0, 17).cuboid(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(9, 12).cuboid(0.0F, 1.975F, -3.0F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, 3.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(DesertRainFrogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.animateMovement(DesertRainFrogAnimations.ANIM_DESERT_RAIN_FROG_WALK, limbSwing, limbSwingAmount, 10f, 16f);
        this.updateAnimation(entity.idleAnimationState, DesertRainFrogAnimations.ANIM_DESERT_RAIN_FROG_IDLE, ageInTicks, 1f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        desertrainfrog.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return desertrainfrog;
    }
}
