package net.lacrox.arcamobs.list;

import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModEntityTypeTags implements EntityTypeTags {
   public static final TagKey<EntityType<?>> LIONFISH_CHILL = ModEntityTypeTags.of("lionfish_chill");

    private static TagKey<EntityType<?>> of(String id) {
        return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.ofVanilla(id));
    }
}