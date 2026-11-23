package net.lacrox.arcamobs.entity.client.lionfish;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.LionfishEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class LionfishRenderer extends MobEntityRenderer<LionfishEntity, LionfishModel<LionfishEntity>> {

    public LionfishRenderer(EntityRendererFactory.Context context) {
        super(context, new LionfishModel<>(context.getPart(LionfishModel.LIONFISH)), 0.35f);
    }

    @Override
    public Identifier getTexture(LionfishEntity entity) {
        return Identifier.of(ArcaMobs.MOD_ID, "textures/entity/lionfish/lionfish.png");
    }

    @Override
    public void render(LionfishEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
