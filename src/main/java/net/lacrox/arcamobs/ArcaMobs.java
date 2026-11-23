package net.lacrox.arcamobs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lacrox.arcamobs.block.ModBlocks;
import net.lacrox.arcamobs.block.blocks.entity.ModBlockEntities;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.entity.custom.*;
import net.lacrox.arcamobs.item.ModItemGroups;
import net.lacrox.arcamobs.item.ModItems;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaMobs implements ModInitializer {
	public static final String MOD_ID = "arcamobs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        // Items
		ModItems.registerModItems();

		// Blocks
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerModBlockEntities();

		// Groups
		ModItemGroups.registerModItemGroups();

		//Mob Register
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.OTTER, OtterEntity.createAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.DESERTRAINFROG, DesertRainFrogEntity.createAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.BOAR, BoarEntity.createAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.THORNYDEVIL, ThornyDevilEntity.createAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.LIONFISH, FishEntity.createFishAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.MANTISSHRIMP, MantisShrimpEntity.createAttributes());
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
