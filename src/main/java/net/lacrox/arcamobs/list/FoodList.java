package net.lacrox.arcamobs.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent COCONUT_HALF = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2F).build();
    public static final FoodComponent RAW_VENISON = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent COOKED_VENISON = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final FoodComponent RAW_LIONFISH = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();
    public static final FoodComponent COOKED_LIONFISH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build();
    public static final FoodComponent RAW_GENERAL_FISH = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent COOKED_FISH = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodComponent RAW_DUCK = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent COOKED_DUCK = new FoodComponent.Builder().nutrition(7).saturationModifier(0.9F).build();
    public static final FoodComponent COCONUT_CRAB_LEG = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build();
    public static final FoodComponent COOKED_COCONUT_CRAB_LEG = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build();
    public static final FoodComponent TRUFFLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
}
