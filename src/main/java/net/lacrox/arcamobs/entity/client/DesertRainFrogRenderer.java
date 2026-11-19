package net.lacrox.arcamobs.entity.client;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.DesertRainFrogEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DesertRainFrogRenderer extends MobEntityRenderer<DesertRainFrogEntity, DesertRainFrogModel<DesertRainFrogEntity>> {

    public DesertRainFrogRenderer(EntityRendererFactory.Context context) {
        super(context, new DesertRainFrogModel<>(context.getPart(DesertRainFrogModel.DESERTRAINFROG)), 0.35f);
    }

    @Override
    public Identifier getTexture(DesertRainFrogEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/desert_rain_frog/desert_rain_frog.png");
    }

    @Override
    public void render(DesertRainFrogEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.75f, 0.75f, 0.75f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}