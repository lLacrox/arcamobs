package net.lacrox.arcamobs.entity.client.boar;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.BoarEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BoarRenderer extends MobEntityRenderer<BoarEntity, BoarModel<BoarEntity>> {

    public BoarRenderer(EntityRendererFactory.Context context) {
        super(context, new BoarModel<>(context.getPart(BoarModel.BOAR)), 0.8f);
    }

    @Override
    public Identifier getTexture(BoarEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/boar/boar.png");
    }

    @Override
    public void render(BoarEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.6f, 0.6f, 0.6f);
        } else {
            matrixStack.scale(1.1f, 1.1f, 1.1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}

