package net.loxec.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.loxec.tutorialmod.block.ModBlocks;
import net.loxec.tutorialmod.item.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
