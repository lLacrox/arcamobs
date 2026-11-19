package net.lacrox.arcamobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.entity.client.DesertRainFrogModel;
import net.lacrox.arcamobs.entity.client.DesertRainFrogRenderer;
import net.lacrox.arcamobs.entity.client.OtterModel;
import net.lacrox.arcamobs.entity.client.OtterRenderer;

public class ArcaMobsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(OtterModel.OTTER, OtterModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.OTTER, OtterRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(DesertRainFrogModel.DESERTRAINFROG, DesertRainFrogModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DESERTRAINFROG, DesertRainFrogRenderer::new);
    }
}
