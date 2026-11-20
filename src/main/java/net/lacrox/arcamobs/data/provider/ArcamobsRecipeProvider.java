package net.lacrox.arcamobs.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class ArcamobsRecipeProvider extends FabricRecipeProvider {

    public ArcamobsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OWL_HARNESS)
                .input('#', Items.LEATHER)
                .input('T', Items.TRIPWIRE_HOOK)
                .input('L', Items.LEAD)
                .pattern("###")
                .pattern(" TL")
                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(ModItems.OWL_HARNESS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.BIRDHOUSE)
                .input('_', ItemTags.WOODEN_SLABS)
                .input('O', ItemTags.WOODEN_STAIRS)
                .input('/', Items.STICK)
                .input('S', ItemTags.LOGS)
                .pattern(" _ ")
                .pattern("O/O")
                .pattern("SSS")
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModBlocks.BIRDHOUSE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PIGEON_MAIL)
                .input(Items.PAPER)
                .input(Items.FEATHER)
                .input(Items.INK_SAC)
                .input(Items.STRING)
                .criterion(hasItem(Items.INK_SAC), conditionsFromItem(ModItems.PIGEON_MAIL))
                .offerTo(exporter);

        RecipeProvider.offerSmelting(exporter,
                Collections.singletonList(ModItems.RAW_VENISON),
                RecipeCategory.FOOD,
                ModItems.COOKED_VENISON,
                0.2F,
                100,
        "Meat");

        RecipeProvider.offerSmelting(exporter,
                Collections.singletonList(ModItems.RAW_DUCK),
                RecipeCategory.FOOD,
                ModItems.COOKED_DUCK,
                0.2F,
                100,
                "Meat");

        RecipeProvider.offerSmelting(exporter,
                Collections.singletonList(ModItems.RAW_GENERAL_FISH),
                RecipeCategory.FOOD,
                ModItems.COOKED_FISH,
                0.2F,
                100,
                "Meat");

        RecipeProvider.offerSmelting(exporter,
                Collections.singletonList(ModItems.COCONUT_CRAB_LEG),
                RecipeCategory.FOOD,
                ModItems.COOKED_COCONUT_CRAB_LEG,
                0.2F,
                100,
                "Meat");

        RecipeProvider.offerSmelting(exporter,
                Collections.singletonList(ModItems.RAW_LIONFISH),
                RecipeCategory.FOOD,
                ModItems.COOKED_LIONFISH,
                0.2F,
                100,
                "Meat");
    }
}
