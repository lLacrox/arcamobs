package net.lacrox.arcamobs.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ArcamobsModelProvider extends FabricModelProvider {
    public ArcamobsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYCEHOLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BADGER_SETT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRD_NEST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SNAIL_SHELL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUSSEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEASHELL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OSTRICH_EGG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUCKWEED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRDHOUSE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COCONUT);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.COCONUT_HALF, Models.GENERATED);
    itemModelGenerator.register(ModItems.SNAIL_SHELL, Models.GENERATED);
    itemModelGenerator.register(ModItems.SNAIL_IN_A_BOTTLE, Models.GENERATED);
    itemModelGenerator.register(ModItems.DESERT_RAIN_FROG_IN_A_BOWL, Models.GENERATED);
    itemModelGenerator.register(ModItems.GLOWBUG_IN_A_BOTTLE, Models.GENERATED);
    itemModelGenerator.register(ModItems.MYCE_IN_A_BOWL, Models.GENERATED);
    itemModelGenerator.register(ModItems.MANTIS_SHRIMP_IN_A_BUCKET, Models.GENERATED);
    itemModelGenerator.register(ModItems.SLUG_IN_A_BOTTLE, Models.GENERATED);
    itemModelGenerator.register(ModItems.LIONFISH_IN_A_BUCKET, Models.GENERATED);
    itemModelGenerator.register(ModItems.JELLYFISH_IN_A_BUCKET, Models.GENERATED);
    itemModelGenerator.register(ModItems.STOAT, Models.HANDHELD);
    itemModelGenerator.register(ModItems.OWL_HARNESS_HORNED, Models.HANDHELD);
    itemModelGenerator.register(ModItems.OWL_HARNESS_SNOW, Models.HANDHELD);
    itemModelGenerator.register(ModItems.RAW_LIONFISH, Models.GENERATED);
    itemModelGenerator.register(ModItems.COOKED_LIONFISH, Models.GENERATED);
    itemModelGenerator.register(ModItems.RAW_GENERAL_FISH, Models.GENERATED);
    itemModelGenerator.register(ModItems.COOKED_FISH, Models.GENERATED);
    itemModelGenerator.register(ModItems.RAW_DUCK, Models.GENERATED);
    itemModelGenerator.register(ModItems.COOKED_DUCK, Models.GENERATED);
    itemModelGenerator.register(ModItems.COCONUT_CRAB_LEG, Models.GENERATED);
    itemModelGenerator.register(ModItems.COOKED_COCONUT_CRAB_LEG, Models.GENERATED);
    itemModelGenerator.register(ModItems.MANTIS_SHRIMP_CLAW, Models.HANDHELD);
    itemModelGenerator.register(ModItems.BISON_MILK, Models.GENERATED);
    itemModelGenerator.register(ModItems.DUCK_EGG, Models.GENERATED);
    itemModelGenerator.register(ModBlocks.OSTRICH_EGG.asItem(), Models.GENERATED);
    itemModelGenerator.register(ModItems.TRUFFLE, Models.GENERATED);
    itemModelGenerator.register(ModItems.YAK_MILK, Models.GENERATED);
    itemModelGenerator.register(ModItems.PIGEON_MAIL, Models.GENERATED);
    itemModelGenerator.register(ModItems.OWL_HARNESS, Models.GENERATED);
    itemModelGenerator.register(ModItems.ANTLER, Models.GENERATED);
    itemModelGenerator.register(ModItems.RAW_VENISON, Models.GENERATED);
    itemModelGenerator.register(ModItems.COOKED_VENISON, Models.GENERATED);
    itemModelGenerator.register(ModItems.MUSSEL, Models.GENERATED);
    itemModelGenerator.register(ModItems.SEASHELL, Models.GENERATED);
    itemModelGenerator.register(ModItems.OTTER_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    itemModelGenerator.register(ModItems.THORNY_DEVIL_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    itemModelGenerator.register(ModItems.DESERT_RAIN_FROG_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    itemModelGenerator.register(ModItems.BOAR_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    }
}
