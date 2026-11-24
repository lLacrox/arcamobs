package net.lacrox.arcamobs.item;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.list.FoodList;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;

public class ModItems {

    // Mob Drops
    public static final Item SNAIL_SHELL = register("snail_shell", new Item(new Item.Settings()));
    public static final Item RAW_VENISON = register("raw_venison", new Item(new Item.Settings().food(FoodList.RAW_VENISON)));
    public static final Item RAW_GENERAL_FISH = register("raw_general_fish", new Item(new Item.Settings().food(FoodList.RAW_GENERAL_FISH)));
    public static final Item RAW_LIONFISH = register("raw_lionfish", new Item(new Item.Settings().food(FoodList.RAW_LIONFISH)));
    public static final Item RAW_DUCK = register("raw_duck", new Item(new Item.Settings().food(FoodList.RAW_DUCK)));
    public static final Item COCONUT_CRAB_LEG = register("coconut_crab_leg", new Item(new Item.Settings().food(FoodList.COCONUT_CRAB_LEG)));
    public static final Item MANTIS_SHRIMP_CLAW = register("mantis_shrimp_claw", new Item(new Item.Settings()));
    public static final Item ANTLER = register("antler", new Item(new Item.Settings()));

    // Buckets, Bowls and Bottles
    public static final Item SNAIL_IN_A_BOTTLE = register("snail_in_a_bottle", new EntityBucketItem(
            EntityType.AXOLOTL, Fluids.EMPTY, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item DESERT_RAIN_FROG_IN_A_BOWL = register("desert_rain_frog_in_a_bowl", new EntityBucketItem(
            ModEntities.DESERTRAINFROG, Fluids.EMPTY, SoundEvents.BLOCK_HONEY_BLOCK_PLACE,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item GLOWBUG_IN_A_BOTTLE = register("glowbug_in_a_bottle", new EntityBucketItem(
            EntityType.AXOLOTL, Fluids.EMPTY, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item MYCE_IN_A_BOWL = register("myce_in_a_bowl", new EntityBucketItem(
            EntityType.AXOLOTL, Fluids.EMPTY, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item MANTIS_SHRIMP_IN_A_BUCKET = register("mantis_shrimp_in_a_bucket", new EntityBucketItem(
            ModEntities.MANTISSHRIMP, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item SLUG_IN_A_BOTTLE = register("slug_in_a_bottle", new EntityBucketItem(
            EntityType.AXOLOTL, Fluids.EMPTY, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item LIONFISH_IN_A_BUCKET = register("lionfish_in_a_bucket", new EntityBucketItem(
            ModEntities.LIONFISH, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));
    public static final Item JELLYFISH_IN_A_BUCKET = register("jellyfish_in_a_bucket", new EntityBucketItem(
            EntityType.AXOLOTL, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL,
            new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)));

    // Holders
    public static final Item STOAT = register("stoat", new Item(new Item.Settings()));
    public static final Item OWL_HARNESS_HORNED = register("owl_harness_horned", new Item(new Item.Settings()));
    public static final Item OWL_HARNESS_SNOW = register("owl_harness_snow", new Item(new Item.Settings()));
    public static final Item OWL_HARNESS = register("owl_harness", new Item(new Item.Settings()));

    // Food
    public static final Item COOKED_LIONFISH = register("cooked_lionfish", new Item(new Item.Settings().food(FoodList.COOKED_LIONFISH)));
    public static final Item COOKED_FISH = register("cooked_fish", new Item(new Item.Settings().food(FoodList.COOKED_FISH)));
    public static final Item COOKED_DUCK = register("cooked_duck", new Item(new Item.Settings().food(FoodList.COOKED_DUCK)));
    public static final Item COOKED_COCONUT_CRAB_LEG = register( "cooked_coconut_crab_leg", new Item(new Item.Settings().food(FoodList.COOKED_COCONUT_CRAB_LEG)));
    public static final Item BISON_MILK = register("bison_milk", new MilkBucketItem(new Item.Settings().maxCount(1)));
    public static final Item DUCK_EGG = register("duck_egg", new Item(new Item.Settings().maxCount(16)));
    public static final Item TRUFFLE = register("truffle", new Item(new Item.Settings().food(FoodList.TRUFFLE)));
    public static final Item YAK_MILK = register("yak_milk", new MilkBucketItem(new Item.Settings().maxCount(1)));
    public static final Item COOKED_VENISON = register("cooked_venison", new Item(new Item.Settings().food(FoodList.COOKED_VENISON)));
    public static final Item COCONUT_HALF = register("coconut_half", new Item(new Item.Settings().food(FoodList.COCONUT_HALF)));

    // Blocks
    public static final Item MUSSEL = register("mussel", new Item(new Item.Settings()));
    public static final Item SEASHELL = register("seashell", new Item(new Item.Settings()));

    // Spawn Eggs
    public static final Item OTTER_SPAWN_EGG = register("otter_spawn_egg", new SpawnEggItem(ModEntities.OTTER, 0x91634E, 0xFFEBDB, new Item.Settings()));
    public static final Item THORNY_DEVIL_SPAWN_EGG = register("thorny_devil_spawn_egg", new SpawnEggItem(ModEntities.THORNYDEVIL, 0xD8BA9C, 0x773432, new Item.Settings()));
    public static final Item DESERT_RAIN_FROG_SPAWN_EGG = register("desert_rain_frog_spawn_egg", new SpawnEggItem(ModEntities.DESERTRAINFROG, 0xE0D7C9, 0xBAA298, new Item.Settings()));
    public static final Item BOAR_SPAWN_EGG = register("boar_spawn_egg", new SpawnEggItem(ModEntities.BOAR, 0x422C26, 0x251311, new Item.Settings()));
    public static final Item LIONFISH_SPAWN_EGG = register("lionfish_spawn_egg", new SpawnEggItem(ModEntities.LIONFISH, 0xE0D0C0, 0xC96830, new Item.Settings()));
    public static final Item MANTIS_SHRIMP_SPAWN_EGG = register("mantis_shrimp_spawn_egg", new SpawnEggItem(ModEntities.MANTISSHRIMP, 0x73D639, 0x06427F, new Item.Settings()));

    // Miscellaneous
    public static final Item PIGEON_MAIL = register("pigeon_mail", new Item(new Item.Settings()));
    public static final Item CHUM_COCKTAIL = register("chum_cocktail", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ArcaMobs.id(name), item);
    }

    public static void registerModItems() {
        ArcaMobs.LOGGER.info("Milking Yaks");
    }
}
