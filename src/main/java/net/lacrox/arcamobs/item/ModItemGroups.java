package net.lacrox.arcamobs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ARCAMOBS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArcaMobs.MOD_ID, "arcamobs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SNAIL_SHELL))
                    .displayName(Text.translatable("itemGroup.arcamobs.arcamobs_group"))
                    .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.SNAIL_SHELL);
                    entries.add(ModItems.SNAIL_IN_A_BOTTLE);
                    entries.add(ModItems.SLUG_IN_A_BOTTLE);
                    entries.add(ModItems.ANTLER);
                    entries.add(ModItems.RAW_VENISON);
                    entries.add(ModItems.COOKED_VENISON);
                    entries.add(ModItems.COCONUT_CRAB_LEG);
                    entries.add(ModItems.COOKED_COCONUT_CRAB_LEG);
                    entries.add(ModBlocks.COCONUT);
                    entries.add(ModItems.COCONUT_HALF);
                    entries.add(ModItems.BISON_MILK);
                    entries.add(ModItems.YAK_MILK);
                    entries.add(ModItems.TRUFFLE);
                    entries.add(ModItems.DUCK_EGG);
                    entries.add(ModItems.RAW_DUCK);
                    entries.add(ModItems.COOKED_DUCK);
                    entries.add(ModBlocks.OSTRICH_EGG.asItem());
                    entries.add(ModItems.OSTRICH_FEATHER);
                    entries.add(ModBlocks.BIRD_NEST);
                    entries.add(ModBlocks.BIRDHOUSE);
                    entries.add(ModItems.OWL_HARNESS);
                    entries.add(ModItems.DESERT_RAIN_FROG_IN_A_BOWL);
                    entries.add(ModItems.MYCE_IN_A_BOWL);
                    entries.add(ModBlocks.MYCEHOLE);
                    entries.add(ModItems.LIONFISH_IN_A_BUCKET);
                    entries.add(ModItems.RAW_LIONFISH);
                    entries.add(ModItems.COOKED_LIONFISH);
                    entries.add(ModItems.MANTIS_SHRIMP_CLAW);
                    entries.add(ModItems.MANTIS_SHRIMP_IN_A_BUCKET);
                    entries.add(ModBlocks.SEASHELL);
                    entries.add(ModBlocks.MUSSEL);
                    entries.add(ModItems.CHUM_COCKTAIL);
                    entries.add(ModBlocks.BADGER_SETT);
                    entries.add(ModBlocks.TERRARIUM);
                    }).build());
    public static final ItemGroup ARCAMOBS_EGG_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArcaMobs.MOD_ID, "arcamobs_spawn_eggs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DESERT_RAIN_FROG_SPAWN_EGG))
                    .displayName(Text.translatable("itemGroup.arcamobs.arcamobs_egg_group"))
                    .entries((displayContext, entries) -> {
                    entries.add(ModItems.DESERT_RAIN_FROG_SPAWN_EGG);
                    entries.add(ModItems.OTTER_SPAWN_EGG);
                    entries.add(ModItems.BOAR_SPAWN_EGG);
                    entries.add(ModItems.THORNY_DEVIL_SPAWN_EGG);
                    entries.add(ModItems.LIONFISH_SPAWN_EGG);
                    entries.add(ModItems.MANTIS_SHRIMP_SPAWN_EGG);
                    }).build());

    public static void registerModItemGroups() {
        ArcaMobs.LOGGER.info("Sorting the animals");
    }
}
