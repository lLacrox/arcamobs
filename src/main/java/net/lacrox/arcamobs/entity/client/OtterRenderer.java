package net.lacrox.arcamobs.entity.client;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.OtterEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class OtterRenderer extends MobEntityRenderer<OtterEntity, OtterModel<OtterEntity>> {

    public OtterRenderer(EntityRendererFactory.Context context) {
        super(context, new OtterModel<>(context.getPart(OtterModel.OTTER)), 0.5f);
    }

    @Override
    public Identifier getTexture(OtterEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/otter/otter.png");
    }

    @Override
    public void render(OtterEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.75f, 0.75f, 0.75f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
