package net.lacrox.arcamobs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.lacrox.arcamobs.data.provider.*;

public class ArcaMobsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ArcamobsModelProvider::new);
		pack.addProvider(ArcamobsBlockLootTableProvider::new);
		pack.addProvider(ArcamobsBlockTagProvider::new);
		pack.addProvider(ArcamobsItemTagProvider::new);
		pack.addProvider(ArcamobsEntityTagProvider::new);
		pack.addProvider(ArcamobsRecipeProvider::new);
	}
}
