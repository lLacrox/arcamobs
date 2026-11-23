package net.lacrox.arcamobs.block;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.block.blocks.DuckweedBlock;
import net.lacrox.arcamobs.block.blocks.MyceholeBlock;
import net.lacrox.arcamobs.block.blocks.OstrichEggBlock;
import net.lacrox.arcamobs.block.blocks.SeashellBlock;
import net.lacrox.arcamobs.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {
    public static final MyceholeBlock MYCEHOLE = registerWithItem("mycehole", new MyceholeBlock(AbstractBlock.Settings.create()));
    public static final Block BADGER_SETT = registerWithItem("badger_sett", new Block(AbstractBlock.Settings.copy(Blocks.MUDDY_MANGROVE_ROOTS)));
    public static final Block MUSSEL = registerWithItem("mussel", new Block(AbstractBlock.Settings.create()
            .breakInstantly()
            .sounds(BlockSoundGroup.CORAL)
            .pistonBehavior(PistonBehavior.DESTROY)
    ));
    public static final Block SEASHELL = registerWithItem("seashell", new SeashellBlock(AbstractBlock.Settings.create()
            .breakInstantly()
            .sounds(BlockSoundGroup.CORAL)
            .pistonBehavior(PistonBehavior.DESTROY)
    ));
    public static final Block SNAIL_SHELL = registerWithItem("snail_shell", new Block(AbstractBlock.Settings.create()
            .breakInstantly()
            .sounds(BlockSoundGroup.CORAL)
            .pistonBehavior(PistonBehavior.DESTROY)
    ));
    public static final Block BIRD_NEST = registerWithItem("bird_nest", new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.HANGING_ROOTS)
                    .pistonBehavior(PistonBehavior.DESTROY)
    ));
    public static final Block OSTRICH_EGG = registerWithItem("ostrich_egg", new OstrichEggBlock(AbstractBlock.Settings.copy(Blocks.SNIFFER_EGG)), new Item.Settings().maxCount(8));
    public static final Block DUCKWEED = register("duckweed", new DuckweedBlock(AbstractBlock.Settings.create()
                .breakInstantly()
                .nonOpaque()
                .mapColor(MapColor.GREEN)
                .sounds(BlockSoundGroup.LILY_PAD)
                .pistonBehavior(PistonBehavior.DESTROY)
                .noCollision()
    ));
    public static final Block COCONUT = registerWithItem("coconut", new Block(AbstractBlock.Settings.copy(Blocks.MELON)));
    public static final Block BIRDHOUSE = registerWithItem("birdhouse", new Block(AbstractBlock.Settings.copy(Blocks.BEEHIVE)));
    public static final Block TERRARIUM = registerWithItem("terrarium", new Block(AbstractBlock.Settings.copy(Blocks.GLASS)));




    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, ArcaMobs.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void registerModBlocks() {
        ArcaMobs.LOGGER.info("Building Nests");
    }

}

