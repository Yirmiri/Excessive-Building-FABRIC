package net.yirmiri.excessive_building.worldgen.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.EBConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class GoldenBirchSaplingGenerator extends SaplingGenerator {
    @Nullable @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return EBConfiguredFeatures.GOLDEN_BIRCH_TREE;
    }
}
