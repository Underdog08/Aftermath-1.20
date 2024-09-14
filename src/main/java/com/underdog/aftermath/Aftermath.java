package com.underdog.aftermath;

//import com.underdog.aftermath.world.biome.ModBiomesModifier;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aftermath implements ModInitializer {
	public static final String MOD_ID = "aftermath";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//ModBiomesModifier.modifyBiomes();
	}
}