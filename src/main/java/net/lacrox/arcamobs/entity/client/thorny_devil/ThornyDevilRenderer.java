package net.lacrox.arcamobs.entity.client.thorny_devil;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.ThornyDevilEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ThornyDevilRenderer extends MobEntityRenderer<ThornyDevilEntity, ThornyDevilModel<ThornyDevilEntity>> {

    public ThornyDevilRenderer(EntityRendererFactory.Context context) {
        super(context, new ThornyDevilModel<>(context.getPart(ThornyDevilModel.THORNYDEVIL)), 0.5f);
    }

    @Override
    public Identifier getTexture(ThornyDevilEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/thorny_devil/thorny_devil.png");
    }

    @Override
    public void render(ThornyDevilEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.75f, 0.75f, 0.75f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
