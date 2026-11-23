package net.lacrox.arcamobs.list;

import net.lacrox.arcamobs.ArcaMobs;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks{
        public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL = TagKey.of(RegistryKeys.BLOCK, ArcaMobs.id("incorrect_for_example_tool"));
    }
    public static class Items{
        public static final TagKey<Item> BEAR_FOOD = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("bear_food"));
        public static final TagKey<Item> SNAIL_FOOD = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("snail_food"));
        public static final TagKey<Item> SLUG_FOOD = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("slug_food"));
        public static final TagKey<Item> OSTRICH_FOOD = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("ostrich_food"));
        public static final TagKey<Item> RAW_MEAT = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("raw_meat"));
        public static final TagKey<Item> RAW_FISH = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("raw_fish"));
        public static final TagKey<Item> SEASHELLS = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("seashells"));
        public static final TagKey<Item> MUSHROOMS = TagKey.of(RegistryKeys.ITEM, ArcaMobs.id("mushrooms"));
    }
}
