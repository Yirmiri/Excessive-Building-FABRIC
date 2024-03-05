package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.yirmiri.excessive_building.init.EBBlocks;
import net.yirmiri.excessive_building.init.EBParticlesTypes;
import net.yirmiri.excessive_building.particle.FallingLeafParticle;

public class ExcessiveBuildingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //TRANSLUCENT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.FIERY_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.FIERY_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AMETHYST_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AMETHYST_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.PRISMARINE_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.PRISMARINE_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RAINBOW_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RAINBOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

        //CUTOUT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.FIERY_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.KYANITE_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.UNLIT_ANCIENT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_FENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_FENCE_GATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_PRESSURE_PLATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_ANCIENT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.BAMBOO_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.CHERRY_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RED_MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ORANGE_MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.YELLOW_MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_FENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_FENCE_GATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MAPLE_PRESSURE_PLATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_RED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ORANGE_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_ORANGE_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.YELLOW_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_YELLOW_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_FENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_FENCE_GATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_PRESSURE_PLATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());

        //CUTOUT MIPPED
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.EXPOSED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WEATHERED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.OXIDIZED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WAXED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WAXED_EXPOSED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WAXED_WEATHERED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WAXED_OXIDIZED_COPPER_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GOLD_GRATE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.IRON_GRATE, RenderLayer.getCutoutMipped());

        //PARTICLES
        ParticleFactoryRegistry.getInstance().register(EBParticlesTypes.ANCIENT_PARTICLE, FallingLeafParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(EBParticlesTypes.ORANGE_MAPLE_PARTICLE, FallingLeafParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(EBParticlesTypes.YELLOW_MAPLE_PARTICLE, FallingLeafParticle.Factory::new);
    }
}
