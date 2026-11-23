package net.lacrox.arcamobs.entity.client.lionfish;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.LionfishEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class LionfishModel<T extends LionfishEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer LIONFISH = new EntityModelLayer(Identifier.of(ArcaMobs.MOD_ID, "lionfish"), "main");

    private final ModelPart lionfish;

    public LionfishModel(ModelPart root) {
        this.lionfish = root.getChild("lionfish");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData lionfish = modelPartData.addChild("lionfish", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.0F, -2.5F));

        ModelPartData head = lionfish.addChild("head", ModelPartBuilder.create().uv(40, 14).cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bodySpine1 = lionfish.addChild("bodySpine1", ModelPartBuilder.create().uv(10, 43).cuboid(-1.0F, -3.0F, 0.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData finTop = bodySpine1.addChild("finTop", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, -1.5F, 0.0F, 8.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 1.5F));

        ModelPartData finBottom = bodySpine1.addChild("finBottom", ModelPartBuilder.create().uv(0, 20).cuboid(0.0F, 0.0F, -1.5F, 0.0F, 8.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 0.5F));

        ModelPartData bodySpine2 = bodySpine1.addChild("bodySpine2", ModelPartBuilder.create().uv(0, 43).cuboid(-1.0F, -3.0F, 0.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 3.0F));

        ModelPartData tail = bodySpine2.addChild("tail", ModelPartBuilder.create().uv(40, 0).cuboid(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 3.0F));

        ModelPartData finLeft = bodySpine1.addChild("finLeft", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 0.0F, 1.5F));

        ModelPartData cube_r1 = finLeft.addChild("cube_r1", ModelPartBuilder.create().uv(20, 0).cuboid(0.0F, -6.0F, 0.0F, 0.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        ModelPartData finRight = bodySpine1.addChild("finRight", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 0.0F, 1.5F));

        ModelPartData cube_r2 = finRight.addChild("cube_r2", ModelPartBuilder.create().uv(20, 20).cuboid(0.0F, -6.0F, 0.0F, 0.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(LionfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        if (entity.isTouchingWater()) {
            this.animateMovement(LionfishAnimations.ANIM_LIONFISH_WALK, limbSwing, limbSwingAmount, 10f, 16f);
        } else {
            this.animateMovement(LionfishAnimations.ANIM_LIONFISH_LAND, limbSwing, limbSwingAmount, 10f, 16f);
        }
        this.updateAnimation(entity.idleAnimationState, LionfishAnimations.ANIM_LIONFISH_IDLE, ageInTicks, 1f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        lionfish.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return lionfish;
    }
}
