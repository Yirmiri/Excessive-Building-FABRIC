package net.yirmiri.excessive_building.init;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.yirmiri.excessive_building.init.EBBlocks;

public class EBFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //logs 5, 5 | planks 5, 20 | leaves 30, 60 | shelves 20, 30 | wool 60, 30 | carpets 20, 60

        registry.add(EBBlocks.RAINBOW_WOOL, 60, 30);
        registry.add(EBBlocks.RAINBOW_CARPET, 20, 60);

        registry.add(EBBlocks.EMPTY_SHELF, 20, 30);
        registry.add(EBBlocks.EMPTY_POTION_SHELF, 20, 30);
        registry.add(EBBlocks.WATER_POTION_SHELF, 20, 30);
        registry.add(EBBlocks.POTION_SHELF, 20, 30);
        registry.add(EBBlocks.ALCHEMIST_SHELF, 20, 30);
        registry.add(EBBlocks.BRICKSHELF, 20, 30);
        registry.add(EBBlocks.NETHER_BRICKSHELF, 20, 30);

        registry.add(EBBlocks.CHISELED_OAK, 5, 20);
        registry.add(EBBlocks.OAK_MOSAIC, 5, 20);
        registry.add(EBBlocks.OAK_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.OAK_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.OAK_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_SPRUCE, 5, 20);
        registry.add(EBBlocks.SPRUCE_MOSAIC, 5, 20);
        registry.add(EBBlocks.SPRUCE_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.SPRUCE_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.SPRUCE_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_BIRCH, 5, 20);
        registry.add(EBBlocks.BIRCH_MOSAIC, 5, 20);
        registry.add(EBBlocks.BIRCH_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.BIRCH_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.BIRCH_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_JUNGLE, 5, 20);
        registry.add(EBBlocks.JUNGLE_MOSAIC, 5, 20);
        registry.add(EBBlocks.JUNGLE_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.JUNGLE_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.JUNGLE_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_ACACIA, 5, 20);
        registry.add(EBBlocks.ACACIA_MOSAIC, 5, 20);
        registry.add(EBBlocks.ACACIA_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.ACACIA_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.ACACIA_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_DARK_OAK, 5, 20);
        registry.add(EBBlocks.DARK_OAK_MOSAIC, 5, 20);
        registry.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.DARK_OAK_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.DARK_OAK_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_CHERRY, 5, 20);
        registry.add(EBBlocks.CHERRY_MOSAIC, 5, 20);
        registry.add(EBBlocks.CHERRY_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.CHERRY_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.CHERRY_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_MANGROVE, 5, 20);
        registry.add(EBBlocks.MANGROVE_MOSAIC, 5, 20);
        registry.add(EBBlocks.MANGROVE_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.MANGROVE_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.MANGROVE_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_BAMBOO, 5, 20);
        registry.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.BAMBOO_VERTICAL_STAIRS, 5, 20);

        registry.add(EBBlocks.CHISELED_ANCIENT, 5, 20);
        registry.add(EBBlocks.ANCIENT_MOSAIC, 5, 20);
        registry.add(EBBlocks.ANCIENT_MOSAIC_STAIRS, 5, 20);
        registry.add(EBBlocks.ANCIENT_MOSAIC_SLAB, 5, 20);
        registry.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.ANCIENT_VERTICAL_STAIRS, 5, 20);
        registry.add(EBBlocks.ANCIENT_LOG, 5, 5);
        registry.add(EBBlocks.ANCIENT_WOOD, 5, 5);
        registry.add(EBBlocks.STRIPPED_ANCIENT_LOG, 5, 5);
        registry.add(EBBlocks.STRIPPED_ANCIENT_WOOD, 5, 5);
    }
}
