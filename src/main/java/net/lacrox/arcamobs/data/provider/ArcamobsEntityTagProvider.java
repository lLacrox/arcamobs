package net.lacrox.arcamobs.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.list.ModEntityTypeTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ArcamobsEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ArcamobsEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModEntityTypeTags.LIONFISH_CHILL)
                .add(ModEntities.LIONFISH);
    }
}
