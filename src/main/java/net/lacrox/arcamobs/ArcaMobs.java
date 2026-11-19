package net.lacrox.arcamobs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.lacrox.arcamobs.entity.ModEntities;
import net.lacrox.arcamobs.entity.custom.DesertRainFrogEntity;
import net.lacrox.arcamobs.entity.custom.OtterEntity;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaMobs implements ModInitializer {
	public static final String MOD_ID = "arcamobs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.OTTER, OtterEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DESERTRAINFROG, DesertRainFrogEntity.createAttributes());
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
