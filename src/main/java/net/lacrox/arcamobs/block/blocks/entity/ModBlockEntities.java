package net.lacrox.arcamobs.block.blocks.entity;

import net.lacrox.arcamobs.ArcaMobs;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.block.blocks.entity.custom.MyceholeBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<MyceholeBlockEntity> MYCEHOLE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ArcaMobs.MOD_ID, "mycehole_be"),
                    BlockEntityType.Builder.create(MyceholeBlockEntity::new, ModBlocks.MYCEHOLE).build());

    public static void registerModBlockEntities() {
        ArcaMobs.LOGGER.info("Filling up the nests");
    }
}
