package net.lacrox.arcamobs.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lacrox.arcamobs.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ArcamobsBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ArcamobsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDropWithSilkTouch(ModBlocks.MYCEHOLE);
        addDropWithSilkTouch(ModBlocks.BADGER_SETT);
        addDrop(ModBlocks.SNAIL_SHELL);
        addDropWithSilkTouch(ModBlocks.BIRD_NEST);
        addDrop(ModBlocks.DUCKWEED);
        addDrop(ModBlocks.OSTRICH_EGG);
    }
}