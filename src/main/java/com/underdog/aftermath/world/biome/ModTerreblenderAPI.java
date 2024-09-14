package com.underdog.aftermath.world.biome;

import com.underdog.aftermath.Aftermath;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerreblenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Aftermath.MOD_ID, "overworld")));
        //ModOverworldBiomeRegistry.registerPlainsBiome(BiomeKeys.TAIGA, 1);
        //ModOverworldBiomeRegistry.registerForestBiome(BiomeKeys.DARK_FOREST, 1);
    }
}