/*package com.underdog.aftermath.world.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.collection.Weighted;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import terrablender.core.TerraBlender;

import java.util.ArrayList;
import java.util.List;

public class ModOverworldBiomeRegistry {
    public ModOverworldBiomeRegistry() {
    }

    private static final List<Weighted.Present<RegistryKey<Biome>>> forestReplacableBiomes = new ArrayList();
    private static final List<Weighted.Present<RegistryKey<Biome>>> plainsReplacableBiomes = new ArrayList();

    public static void registerForestBiome(RegistryKey<Biome> biome, int weight) {
        forestReplacableBiomes.add(Weighted.of(biome, weight));
    }
    public static void registerPlainsBiome(RegistryKey<Biome> biome, int weight) {
        plainsReplacableBiomes.add(Weighted.of(biome, weight));
    }

    public static List<Weighted.Present<RegistryKey<Biome>>> getForestReplacableBiomes() {
        return ImmutableList.copyOf(forestReplacableBiomes);
    }
    public static List<Weighted.Present<RegistryKey<Biome>>> getPlainsReplacableBiomes() {
        return ImmutableList.copyOf(plainsReplacableBiomes);
    }

    static {
        registerForestBiome(BiomeKeys.FOREST, TerraBlender.CONFIG.vanillaOverworldRegionWeight);
        registerPlainsBiome(BiomeKeys.PLAINS, TerraBlender.CONFIG.vanillaOverworldRegionWeight);
    }
}
*/