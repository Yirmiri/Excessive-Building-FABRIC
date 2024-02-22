package net.yirmiri.excessive_building.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.init.EBBlocks;

public class EBConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = registerKey("ancient_tree");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, ANCIENT_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBBlocks.ANCIENT_LOG),
                new StraightTrunkPlacer(7, 1, 0),
                BlockStateProvider.of(EBBlocks.ANCIENT_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4),
                ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ExcessiveBuilding.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
        RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
