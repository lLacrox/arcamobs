package net.lacrox.arcamobs.entity.client.mantis_shrimp;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.MantisShrimpEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MantisShrimpRenderer extends MobEntityRenderer<MantisShrimpEntity, MantisShrimpModel<MantisShrimpEntity>> {

    public MantisShrimpRenderer(EntityRendererFactory.Context context) {
        super(context, new MantisShrimpModel<>(context.getPart(MantisShrimpModel.MANTISSHRIMP)), 0.65f);
    }

    @Override
    public Identifier getTexture(MantisShrimpEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/mantis_shrimp/mantis_shrimp.png");
    }

    @Override
    public void render(MantisShrimpEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(0.9f, 0.9f, 0.9f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
