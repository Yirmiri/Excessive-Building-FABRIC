package net.yirmiri.excessive_building.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.OptionalInt;

public class EBConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = registerKey("ancient_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_TREE = registerKey("willow_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_TREE = registerKey("red_maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_MAPLE_TREE = registerKey("orange_maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_MAPLE_TREE = registerKey("yellow_maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLDEN_BIRCH_TREE = registerKey("golden_birch_tree");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, ANCIENT_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBBlocks.ANCIENT_LOG),
                new StraightTrunkPlacer(7, 1, 0),
                BlockStateProvider.of(EBBlocks.ANCIENT_LEAVES.getDefaultState()),
                new CherryFoliagePlacer(ConstantIntProvider.create(4),
                ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, WILLOW_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBBlocks.WILLOW_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(Blocks.OAK_LEAVES.getDefaultState()),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(ImmutableList.of(new LeavesVineTreeDecorator(0.25F))).build());

        register(context, RED_MAPLE_TREE, Feature.TREE, redMaple().build());
        register(context, ORANGE_MAPLE_TREE, Feature.TREE, orangeMaple().build());
        register(context, YELLOW_MAPLE_TREE, Feature.TREE, yellowMaple().build());
        register(context, GOLDEN_BIRCH_TREE, Feature.TREE, goldenBirch().build());
    }

    private static TreeFeatureConfig.Builder redMaple() {
        return (new TreeFeatureConfig.Builder(BlockStateProvider.of(EBBlocks.MAPLE_LOG), new LargeOakTrunkPlacer(3, 11, 0), BlockStateProvider.of(EBBlocks.RED_MAPLE_LEAVES), new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeFeatureConfig.Builder orangeMaple() {
        return (new TreeFeatureConfig.Builder(BlockStateProvider.of(EBBlocks.MAPLE_LOG), new LargeOakTrunkPlacer(3, 11, 0), BlockStateProvider.of(EBBlocks.ORANGE_MAPLE_LEAVES), new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeFeatureConfig.Builder yellowMaple() {
        return (new TreeFeatureConfig.Builder(BlockStateProvider.of(EBBlocks.MAPLE_LOG), new LargeOakTrunkPlacer(3, 11, 0), BlockStateProvider.of(EBBlocks.YELLOW_MAPLE_LEAVES), new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
    }

    private static TreeFeatureConfig.Builder goldenBirch() {
        return builder(Blocks.BIRCH_LOG, Blocks.BIRCH_LEAVES, 5, 2, 10, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ExcessiveBuilding.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
        RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
