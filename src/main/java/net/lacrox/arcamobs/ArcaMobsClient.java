package net.lacrox.arcamobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.entity.client.boar.BoarModel;
import net.lacrox.arcamobs.entity.client.boar.BoarRenderer;
import net.lacrox.arcamobs.entity.client.desert_rain_frog.DesertRainFrogModel;
import net.lacrox.arcamobs.entity.client.desert_rain_frog.DesertRainFrogRenderer;
import net.lacrox.arcamobs.entity.client.lionfish.LionfishModel;
import net.lacrox.arcamobs.entity.client.lionfish.LionfishRenderer;
import net.lacrox.arcamobs.entity.client.otter.OtterModel;
import net.lacrox.arcamobs.entity.client.otter.OtterRenderer;
import net.lacrox.arcamobs.entity.client.thorny_devil.ThornyDevilModel;
import net.lacrox.arcamobs.entity.client.thorny_devil.ThornyDevilRenderer;
import net.minecraft.client.render.RenderLayer;

public class ArcaMobsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //Blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DUCKWEED, RenderLayer.getCutout());

        //Entities
        EntityModelLayerRegistry.registerModelLayer(OtterModel.OTTER, OtterModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.OTTER, OtterRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(DesertRainFrogModel.DESERTRAINFROG, DesertRainFrogModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DESERTRAINFROG, DesertRainFrogRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(BoarModel.BOAR, BoarModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BOAR, BoarRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ThornyDevilModel.THORNYDEVIL, ThornyDevilModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.THORNYDEVIL, ThornyDevilRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(LionfishModel.LIONFISH, LionfishModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.LIONFISH, LionfishRenderer::new);

    }
}
