package com.underdog.aftermath.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModOverworldRegion extends Region {
    public ModOverworldRegion(Identifier name) {
        super(name, RegionType.OVERWORLD, 99999999);
    }
    
    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.MANGROVE_SWAMP, BiomeKeys.SWAMP);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.JUNGLE);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.CHERRY_GROVE, BiomeKeys.FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.COLD_OCEAN, BiomeKeys.OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FROZEN_OCEAN, BiomeKeys.OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.DEEP_OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.DEEP_OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.DEEP_FROZEN_OCEAN, BiomeKeys.DEEP_OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.DEEP_DARK, BiomeKeys.DRIPSTONE_CAVES);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FROZEN_RIVER, BiomeKeys.RIVER);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FROZEN_PEAKS, BiomeKeys.WOODED_BADLANDS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.GROVE, BiomeKeys.BADLANDS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.ICE_SPIKES, BiomeKeys.PLAINS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.WARM_OCEAN, BiomeKeys.OCEAN);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.BIRCH_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_BEACH, BiomeKeys.BEACH);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_PLAINS, BiomeKeys.PLAINS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_SLOPES, BiomeKeys.DESERT);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_TAIGA, BiomeKeys.SWAMP);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SPARSE_JUNGLE, BiomeKeys.JUNGLE);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.TAIGA, BiomeKeys.BIRCH_FOREST);
        });
    }
}