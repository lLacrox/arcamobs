package net.lacrox.arcamobs.entity;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.entity.custom.BoarEntity;
import net.lacrox.arcamobs.entity.custom.DesertRainFrogEntity;
import net.lacrox.arcamobs.entity.custom.OtterEntity;
import net.lacrox.arcamobs.entity.custom.ThornyDevilEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<OtterEntity> OTTER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ArcaMobs.MOD_ID, "otter"),
            EntityType.Builder.create(OtterEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.8f, 0.65f).build());

    public static final EntityType<DesertRainFrogEntity> DESERTRAINFROG = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ArcaMobs.MOD_ID, "desertrainfrog"),
            EntityType.Builder.create(DesertRainFrogEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.45f, 0.45f).build());

    public static final EntityType<BoarEntity> BOAR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ArcaMobs.MOD_ID, "boar"),
            EntityType.Builder.create(BoarEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.1f, 1f).build());

    public static final EntityType<ThornyDevilEntity> THORNYDEVIL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ArcaMobs.MOD_ID, "thornydevil"),
            EntityType.Builder.create(ThornyDevilEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.8f, 0.5f).build());

    public static void registerModEntities() {
        ArcaMobs.LOGGER.info("Spawning Wildlife");
    }
}
