package net.yirmiri.excessive_building.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.worldgen.tree.*;

public class EBBlocks {

    //MOSAIC & CHISELED WOOD
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_OAK = registerBlock("chiseled_oak", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs", new StairsBlock(SPRUCE_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_SPRUCE = registerBlock("chiseled_spruce", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs", new StairsBlock(BIRCH_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_BIRCH = registerBlock("chiseled_birch", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs", new StairsBlock(JUNGLE_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_JUNGLE = registerBlock("chiseled_jungle", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs", new StairsBlock(ACACIA_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_ACACIA = registerBlock("chiseled_acacia", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs", new StairsBlock(DARK_OAK_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_DARK_OAK = registerBlock("chiseled_dark_oak", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic", new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs", new StairsBlock(CRIMSON_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block CHISELED_CRIMSON = registerBlock("chiseled_crimson", new Block(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic", new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs", new StairsBlock(WARPED_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block CHISELED_WARPED = registerBlock("chiseled_warped", new Block(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs", new StairsBlock(MANGROVE_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANGROVE_MOSAIC_VERTICAL_STAIRS = registerBlock("mangrove_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MANGROVE_VERTICAL_STAIRS = registerBlock("mangrove_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHISELED_MANGROVE = registerBlock("chiseled_mangrove", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic", new Block(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs", new StairsBlock(CHERRY_MOSAIC.getDefaultState(), FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_MOSAIC_VERTICAL_STAIRS = registerBlock("cherry_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_VERTICAL_STAIRS = registerBlock("cherry_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHISELED_CHERRY = registerBlock("chiseled_cherry", new Block(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block CHISELED_BAMBOO = registerBlock("chiseled_bamboo", new Block(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_MOSAIC_VERTICAL_STAIRS = registerBlock("bamboo_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_VERTICAL_STAIRS = registerBlock("bamboo_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));

    //COBBLED BRICKS
    public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs", new StairsBlock(COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DEEPSLATE_BRICKS = registerBlock("cobbled_deepslate_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("cobbled_deepslate_brick_stairs", new StairsBlock(COBBLED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("cobbled_deepslate_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("cobbled_deepslate_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block BLACKSTONE_BRICKS = registerBlock("blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block BLACKSTONE_BRICK_STAIRS = registerBlock("blackstone_brick_stairs", new StairsBlock(BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block BLACKSTONE_BRICK_SLAB = registerBlock("blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block BLACKSTONE_BRICK_WALL = registerBlock("blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));

    //POLISHED STONES
    public static final Block CRACKED_POLISHED_STONE_BRICKS = registerBlock("cracked_polished_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_BRICKS = registerBlock("polished_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_BRICK_STAIRS = registerBlock("polished_stone_brick_stairs", new StairsBlock(POLISHED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_BRICK_SLAB = registerBlock("polished_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE_BRICKS)));
    public static final Block POLISHED_STONE_BRICK_WALL = registerBlock("polished_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE = registerBlock("polished_stone", new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool()));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs", new StairsBlock(POLISHED_STONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_STONE).requiresTool()));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE).requiresTool()));
    public static final Block POLISHED_STONE_VERTICAL_STAIRS = registerBlock("polished_stone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_STONE).requiresTool()));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles", new Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs", new StairsBlock(POLISHED_BLACKSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_BLACKSTONE_TILES).requiresTool()));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BLACKSTONE_TILES).requiresTool()));
    public static final Block POLISHED_BLACKSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_blackstone_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BLACKSTONE_TILES)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BLACKSTONE_TILES).requiresTool()));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles", new Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE).requiresTool()));

    //MOSSY BRICKS
    public static final Block MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = registerBlock("mossy_cobblestone_brick_stairs", new StairsBlock(MOSSY_COBBLESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = registerBlock("mossy_cobblestone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = registerBlock("mossy_cobblestone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_BRICKS = registerBlock("mossy_cobbled_deepslate_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_stairs", new StairsBlock(MOSSY_COBBLED_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_cobbled_deepslate_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block MOSSY_COBBLED_DEEPSLATE_BRICK_WALL = registerBlock("mossy_cobbled_deepslate_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs", new StairsBlock(MOSSY_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).requiresTool()));
    public static final Block CRIMSON_MOSSY_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block CRIMSON_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_blackstone_brick_stairs", new StairsBlock(CRIMSON_MOSSY_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block CRIMSON_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block CRIMSON_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block WARPED_MOSSY_BLACKSTONE_BRICKS = registerBlock("warped_mossy_blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block WARPED_MOSSY_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_blackstone_brick_stairs", new StairsBlock(WARPED_MOSSY_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block WARPED_MOSSY_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block WARPED_MOSSY_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("crimson_mossy_polished_blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_stairs", new StairsBlock(CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("crimson_mossy_polished_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("crimson_mossy_polished_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("warped_mossy_polished_blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_stairs", new StairsBlock(WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("warped_mossy_polished_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));
    public static final Block WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("warped_mossy_polished_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool()));

    //SAND
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).strength(1).resistance(1).requiresTool()));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs", new StairsBlock(SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SANDSTONE_BRICKS).requiresTool()));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SANDSTONE_BRICKS).requiresTool()));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SANDSTONE_BRICKS).requiresTool()));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).strength(1).resistance(1).requiresTool()));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs", new StairsBlock(RED_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.RED_SANDSTONE_BRICKS).requiresTool()));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.RED_SANDSTONE_BRICKS).requiresTool()));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.RED_SANDSTONE_BRICKS).requiresTool()));
    public static final Block SOUL_SANDSTONE = registerBlock("soul_sandstone", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()));
    public static final Block SOUL_SANDSTONE_STAIRS = registerBlock("soul_sandstone_stairs", new StairsBlock(SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE).requiresTool()));
    public static final Block SOUL_SANDSTONE_SLAB = registerBlock("soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE).requiresTool()));
    public static final Block SOUL_SANDSTONE_WALL = registerBlock("soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE).requiresTool()));
    public static final Block SOUL_SANDSTONE_BRICKS = registerBlock("soul_sandstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE).strength(1).resistance(1).requiresTool()));
    public static final Block SOUL_SANDSTONE_BRICK_STAIRS = registerBlock("soul_sandstone_brick_stairs", new StairsBlock(SOUL_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE_BRICKS).requiresTool()));
    public static final Block SOUL_SANDSTONE_BRICK_SLAB = registerBlock("soul_sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE_BRICKS).requiresTool()));
    public static final Block SOUL_SANDSTONE_BRICK_WALL = registerBlock("soul_sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE_BRICKS).requiresTool()));
    public static final Block CUT_SOUL_SANDSTONE = registerBlock("cut_soul_sandstone", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()));
    public static final Block CUT_SOUL_SANDSTONE_SLAB = registerBlock("cut_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool()));
    public static final Block CHISELED_SOUL_SANDSTONE = registerBlock("chiseled_soul_sandstone", new Block(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE).requiresTool()));
    public static final Block SMOOTH_SOUL_SANDSTONE = registerBlock("smooth_soul_sandstone", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).strength(2).resistance(6).requiresTool()));
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock("smooth_soul_sandstone_stairs", new StairsBlock(SMOOTH_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SMOOTH_SOUL_SANDSTONE).requiresTool()));
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock("smooth_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_SOUL_SANDSTONE).requiresTool()));

    //NETHER BRICK/TILE
    public static final Block NETHER_TILES = registerBlock("nether_tiles", new Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block NETHER_TILE_STAIRS = registerBlock("nether_tile_stairs", new StairsBlock(NETHER_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block NETHER_TILE_SLAB = registerBlock("nether_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block NETHER_TILE_WALL = registerBlock("nether_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block RED_NETHER_TILES = registerBlock("red_nether_tiles", new Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block RED_NETHER_TILE_STAIRS = registerBlock("red_nether_tile_stairs", new StairsBlock(RED_NETHER_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block RED_NETHER_TILE_SLAB = registerBlock("red_nether_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block RED_NETHER_TILE_WALL = registerBlock("red_nether_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_TILES = registerBlock("blue_nether_tiles", new Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_TILE_STAIRS = registerBlock("blue_nether_tile_stairs", new StairsBlock(BLUE_NETHER_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_TILE_SLAB = registerBlock("blue_nether_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_TILE_WALL = registerBlock("blue_nether_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks", new Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs", new StairsBlock(BLUE_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).requiresTool()));

    //OBSIDIAN
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_TILES = registerBlock("obsidian_tiles", new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_STAIRS = registerBlock("obsidian_tile_stairs", new StairsBlock(OBSIDIAN_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.OBSIDIAN_TILES)));
    public static final Block OBSIDIAN_TILE_SLAB = registerBlock("obsidian_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.OBSIDIAN_TILES)));
    public static final Block OBSIDIAN_TILE_VERTICAL_STAIRS = registerBlock("obsidian_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OBSIDIAN_TILES)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs", new StairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.OBSIDIAN_BRICKS)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.OBSIDIAN_BRICKS)));
    public static final Block OBSIDIAN_BRICK_VERTICAL_STAIRS = registerBlock("obsidian_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OBSIDIAN_BRICKS)));

    //BRIMSTONE
    public static final Block BRIMSTONE = registerBlock("brimstone", new Block(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block BRIMSTONE_STAIRS = registerBlock("brimstone_stairs", new StairsBlock(BRIMSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.BRIMSTONE).requiresTool()));
    public static final Block BRIMSTONE_SLAB = registerBlock("brimstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.BRIMSTONE).requiresTool()));
    public static final Block POLISHED_BRIMSTONE = registerBlock("polished_brimstone", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_STAIRS = registerBlock("polished_brimstone_stairs", new StairsBlock(POLISHED_BRIMSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_SLAB = registerBlock("polished_brimstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_WALL = registerBlock("polished_brimstone_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_BRICKS = registerBlock("polished_brimstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("polished_brimstone_brick_stairs", new StairsBlock(POLISHED_BRIMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("polished_brimstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("polished_brimstone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_BRIMSTONE_BRICKS = registerBlock("cracked_polished_brimstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_BRIMSTONE_BRICK_STAIRS = registerBlock("cracked_polished_brimstone_brick_stairs", new StairsBlock(CRACKED_POLISHED_BRIMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_BRIMSTONE_BRICK_SLAB = registerBlock("cracked_polished_brimstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_BRIMSTONE_BRICK_WALL = registerBlock("cracked_polished_brimstone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_TILES = registerBlock("polished_brimstone_tiles", new Block(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE).sounds(BlockSoundGroup.DEEPSLATE_TILES).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_TILE_STAIRS = registerBlock("polished_brimstone_tile_stairs", new StairsBlock(POLISHED_BRIMSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_TILES).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_TILE_SLAB = registerBlock("polished_brimstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_TILES).requiresTool()));
    public static final Block POLISHED_BRIMSTONE_TILE_WALL = registerBlock("polished_brimstone_tile_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_TILES).requiresTool()));
    public static final Block BRIMSTONE_LAMP = registerBlock("brimstone_lamp", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block BRIMSTONE_WINDOW = registerBlock("brimstone_window", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block POLISHED_BRIMSTONE_PILLAR = registerBlock("polished_brimstone_pillar", new PillarBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS).requiresTool()));

    //SULFURIC
    public static final Block SULFURIC_BRIMSTONE = registerBlock("sulfuric_brimstone", new Block(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block SULFURIC_BRIMSTONE_STAIRS = registerBlock("sulfuric_brimstone_stairs", new StairsBlock(SULFURIC_BRIMSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SULFURIC_BRIMSTONE)));
    public static final Block SULFURIC_BRIMSTONE_SLAB = registerBlock("sulfuric_brimstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SULFURIC_BRIMSTONE)));
    public static final Block SULFURIC_BRIMSTONE_VERTICAL_STAIRS = registerBlock("sulfuric_brimstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE = registerBlock("polished_sulfuric_brimstone", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_STAIRS = registerBlock("polished_sulfuric_brimstone_stairs", new StairsBlock(POLISHED_SULFURIC_BRIMSTONE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_SLAB = registerBlock("polished_sulfuric_brimstone_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_BRICKS = registerBlock("polished_sulfuric_brimstone_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_BRICK_STAIRS = registerBlock("polished_sulfuric_brimstone_brick_stairs", new StairsBlock(POLISHED_SULFURIC_BRIMSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_BRICK_SLAB = registerBlock("polished_sulfuric_brimstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_TILES = registerBlock("polished_sulfuric_brimstone_tiles", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_TILE_STAIRS = registerBlock("polished_sulfuric_brimstone_tile_stairs", new StairsBlock(POLISHED_SULFURIC_BRIMSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_TILE_SLAB = registerBlock("polished_sulfuric_brimstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_sulfuric_brimstone_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_SULFURIC_BRIMSTONE)));

    //POLISHED ANDESITE/GRANITE/DIORITE
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).requiresTool()));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs", new StairsBlock(POLISHED_ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_ANDESITE_BRICKS).requiresTool()));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_ANDESITE_BRICKS).requiresTool()));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_ANDESITE_BRICKS).requiresTool()));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks", new Block(FabricBlockSettings.copy(Blocks.GRANITE).requiresTool()));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs", new StairsBlock(POLISHED_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_GRANITE_BRICKS).requiresTool()));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_GRANITE_BRICKS).requiresTool()));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_GRANITE_BRICKS).requiresTool()));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.DIORITE).requiresTool()));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs", new StairsBlock(POLISHED_DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_DIORITE_BRICKS).requiresTool()));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_DIORITE_BRICKS).requiresTool()));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_DIORITE_BRICKS).requiresTool()));

    //COBBLED ANDESITE/GRANITE/DIORITE
    public static final Block COBBLED_ANDESITE = registerBlock("cobbled_andesite", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs", new StairsBlock(COBBLED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.COBBLED_ANDESITE).requiresTool()));
    public static final Block COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_ANDESITE).requiresTool()));
    public static final Block COBBLED_ANDESITE_WALL = registerBlock("cobbled_andesite_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_ANDESITE).requiresTool()));
    public static final Block COBBLED_GRANITE = registerBlock("cobbled_granite", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs", new StairsBlock(COBBLED_GRANITE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.COBBLED_GRANITE).requiresTool()));
    public static final Block COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_GRANITE).requiresTool()));
    public static final Block COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_GRANITE).requiresTool()));
    public static final Block COBBLED_DIORITE = registerBlock("cobbled_diorite", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs", new StairsBlock(COBBLED_DIORITE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.COBBLED_DIORITE).requiresTool()));
    public static final Block COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DIORITE).requiresTool()));
    public static final Block COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DIORITE).requiresTool()));
    public static final Block COBBLED_ANDESITE_BRICKS = registerBlock("cobbled_andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_ANDESITE_BRICK_STAIRS = registerBlock("cobbled_andesite_brick_stairs", new StairsBlock(COBBLED_ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_ANDESITE_BRICK_SLAB = registerBlock("cobbled_andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_ANDESITE_BRICK_WALL = registerBlock("cobbled_andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_GRANITE_BRICKS = registerBlock("cobbled_granite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_GRANITE_BRICK_STAIRS = registerBlock("cobbled_granite_brick_stairs", new StairsBlock(COBBLED_GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_GRANITE_BRICK_SLAB = registerBlock("cobbled_granite_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_GRANITE_BRICK_WALL = registerBlock("cobbled_granite_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DIORITE_BRICKS = registerBlock("cobbled_diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DIORITE_BRICK_STAIRS = registerBlock("cobbled_diorite_brick_stairs", new StairsBlock(COBBLED_DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DIORITE_BRICK_SLAB = registerBlock("cobbled_diorite_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLED_DIORITE_BRICK_WALL = registerBlock("cobbled_diorite_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));

    //SMOOTH STONE
    public static final Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).requiresTool()));
    public static final Block SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs", new StairsBlock(SMOOTH_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));
    public static final Block SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));
    public static final Block SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));
    public static final Block SMOOTH_BRICKS = registerBlock("smooth_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_BRICK_STAIRS = registerBlock("smooth_brick_stairs", new StairsBlock(SMOOTH_BRICKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SMOOTH_BRICKS).requiresTool()));
    public static final Block SMOOTH_BRICK_SLAB = registerBlock("smooth_brick_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_BRICKS).requiresTool()));
    public static final Block SMOOTH_BRICK_WALL = registerBlock("smooth_brick_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_BRICKS).requiresTool()));
    public static final Block SMOOTH_STONE_TILES = registerBlock("smooth_stone_tiles", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).requiresTool()));
    public static final Block SMOOTH_STONE_TILE_STAIRS = registerBlock("smooth_stone_tile_stairs", new StairsBlock(SMOOTH_STONE_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));
    public static final Block SMOOTH_STONE_TILE_SLAB = registerBlock("smooth_stone_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));
    public static final Block SMOOTH_STONE_TILE_WALL = registerBlock("smooth_stone_tile_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS).requiresTool()));

    //CRAFTING/UTILITY
    //   public static final Block OAK_CRAFTING_TABLE = registerBlock("oak_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //  public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //  public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    //  public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    //  public static final Block COLORED_SPRUCE_CRAFTING_TABLE = registerBlock("colored_spruce_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block COLORED_BIRCH_CRAFTING_TABLE = registerBlock("colored_birch_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block COLORED_JUNGLE_CRAFTING_TABLE = registerBlock("colored_jungle_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //  public static final Block COLORED_ACACIA_CRAFTING_TABLE = registerBlock("colored_acacia_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //  public static final Block COLORED_DARK_OAK_CRAFTING_TABLE = registerBlock("colored_dark_oak_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //   public static final Block COLORED_CRIMSON_CRAFTING_TABLE = registerBlock("colored_crimson_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    //   public static final Block COLORED_WARPED_CRAFTING_TABLE = registerBlock("colored_warped_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    // public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    // public static final Block COLORED_MANGROVE_CRAFTING_TABLE = registerBlock("colored_mangrove_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    //  public static final Block CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    //  public static final Block COLORED_CHERRY_CRAFTING_TABLE = registerBlock("colored_cherry_crafting_table",new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    // public static final Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table", new CraftingTableBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block CONSTRUCTION_TABLE = registerBlock("construction_table", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block LOGO_BLOCK = registerBlock("logo_block", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    //MATERIAL
    public static final Block LAPIS_LAZULI_BRICKS = registerBlock("lapis_lazuli_bricks", new Block(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).requiresTool()));
    public static final Block LAPIS_LAZULI_BRICK_STAIRS = registerBlock("lapis_lazuli_brick_stairs", new StairsBlock(LAPIS_LAZULI_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).requiresTool()));
    public static final Block LAPIS_LAZULI_BRICK_SLAB = registerBlock("lapis_lazuli_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).requiresTool()));
    public static final Block GOLDEN_BRICKS = registerBlock("golden_bricks", new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).requiresTool()));
    public static final Block GOLDEN_BRICK_STAIRS = registerBlock("golden_brick_stairs", new StairsBlock(GOLDEN_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.GOLD_BLOCK).requiresTool()));
    public static final Block GOLDEN_BRICK_SLAB = registerBlock("golden_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).requiresTool()));
    public static final Block IRON_BRICKS = registerBlock("iron_bricks", new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_BRICK_STAIRS = registerBlock("iron_brick_stairs", new StairsBlock(IRON_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_BRICK_SLAB = registerBlock("iron_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block IRON_BRICK_VERTICAL_STAIRS = registerBlock("iron_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.IRON_BRICKS)));
    public static final Block DIAMOND_BRICKS = registerBlock("diamond_bricks", new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_BRICK_STAIRS = registerBlock("diamond_brick_stairs", new StairsBlock(DIAMOND_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_BRICK_SLAB = registerBlock("diamond_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).requiresTool()));
    public static final Block DIAMOND_BRICK_VERTICAL_STAIRS = registerBlock("diamond_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.DIAMOND_BRICKS)));
    public static final Block NETHERITE_BRICKS = registerBlock("netherite_bricks", new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block NETHERITE_BRICK_STAIRS = registerBlock("netherite_brick_stairs", new StairsBlock(NETHERITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block NETHERITE_BRICK_SLAB = registerBlock("netherite_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));

    //VERTICAL STAIRS (only the ones that came on release)
    public static final Block OAK_VERTICAL_STAIRS = registerBlock("oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_STAIRS = registerBlock("spruce_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_STAIRS = registerBlock("birch_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_STAIRS = registerBlock("jungle_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block DARK_OAK_VERTICAL_STAIRS = registerBlock("dark_oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ACACIA_VERTICAL_STAIRS = registerBlock("acacia_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CRIMSON_VERTICAL_STAIRS = registerBlock("crimson_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_VERTICAL_STAIRS = registerBlock("warped_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block STONE_VERTICAL_STAIRS = registerBlock("stone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block COBBLESTONE_VERTICAL_STAIRS = registerBlock("cobblestone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE)));
    public static final Block STONE_BRICK_VERTICAL_STAIRS = registerBlock("stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_TILE_VERTICAL_STAIRS = registerBlock("deepslate_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_STAIRS = registerBlock("polished_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final Block QUARTZ_VERTICAL_STAIRS = registerBlock("quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block SMOOTH_QUARTZ_VERTICAL_STAIRS = registerBlock("smooth_quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block BRICK_VERTICAL_STAIRS = registerBlock("brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block SANDSTONE_VERTICAL_STAIRS = registerBlock("sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block BLACKSTONE_VERTICAL_STAIRS = registerBlock("blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_STAIRS = registerBlock("polished_blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block PRISMARINE_VERTICAL_STAIRS = registerBlock("prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)));
    public static final Block DARK_PRISMARINE_VERTICAL_STAIRS = registerBlock("dark_prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block PRISMARINE_BRICK_VERTICAL_STAIRS = registerBlock("prismarine_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block NETHER_BRICK_VERTICAL_STAIRS = registerBlock("nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("red_nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block ANDESITE_VERTICAL_STAIRS = registerBlock("andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block GRANITE_VERTICAL_STAIRS = registerBlock("granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.GRANITE)));
    public static final Block DIORITE_VERTICAL_STAIRS = registerBlock("diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block POLISHED_ANDESITE_VERTICAL_STAIRS = registerBlock("polished_andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_GRANITE_VERTICAL_STAIRS = registerBlock("polished_granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_DIORITE_VERTICAL_STAIRS = registerBlock("polished_diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block PURPUR_VERTICAL_STAIRS = registerBlock("purpur_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block END_STONE_BRICK_VERTICAL_STAIRS = registerBlock("end_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("oak_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block SPRUCE_MOSAIC_VERTICAL_STAIRS = registerBlock("spruce_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block BIRCH_MOSAIC_VERTICAL_STAIRS = registerBlock("birch_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block JUNGLE_MOSAIC_VERTICAL_STAIRS = registerBlock("jungle_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block DARK_OAK_MOSAIC_VERTICAL_STAIRS = registerBlock("dark_oak_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block ACACIA_MOSAIC_VERTICAL_STAIRS = registerBlock("acacia_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.OAK_MOSAIC)));
    public static final Block CRIMSON_MOSAIC_VERTICAL_STAIRS = registerBlock("crimson_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.CRIMSON_MOSAIC)));
    public static final Block WARPED_MOSAIC_VERTICAL_STAIRS = registerBlock("warped_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.WARPED_MOSAIC)));
    public static final Block COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("cobblestone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLESTONE_BRICKS)));
    public static final Block MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLESTONE_BRICKS)));
    public static final Block COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DEEPSLATE_BRICKS)));
    public static final Block MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DEEPSLATE_BRICKS)));
    public static final Block BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BLACKSTONE_BRICKS)));
    public static final Block CRIMSON_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BLACKSTONE_BRICKS)));
    public static final Block WARPED_MOSSY_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BLACKSTONE_BRICKS)));
    public static final Block CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("crimson_mossy_polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.CRIMSON_MOSSY_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block WARPED_MOSSY_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerBlock("warped_mossy_polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.WARPED_MOSSY_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMOOTH_BRICK_VERTICAL_STAIRS = registerBlock("smooth_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_BRICKS)));
    public static final Block SMOOTH_STONE_BRICK_VERTICAL_STAIRS = registerBlock("smooth_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_BRICKS)));
    public static final Block SMOOTH_STONE_TILE_VERTICAL_STAIRS = registerBlock("smooth_stone_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_STONE_TILES)));
    public static final Block BLUE_NETHER_BRICK_VERTICAL_STAIRS = registerBlock("blue_nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BLUE_NETHER_BRICKS)));
    public static final Block SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("sandstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SANDSTONE_BRICKS)));
    public static final Block RED_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("red_sandstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.RED_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = registerBlock("soul_sandstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("soul_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = registerBlock("smooth_soul_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SMOOTH_SOUL_SANDSTONE)));
    public static final Block COBBLED_ANDESITE_VERTICAL_STAIRS = registerBlock("cobbled_andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_ANDESITE)));
    public static final Block COBBLED_GRANITE_VERTICAL_STAIRS = registerBlock("cobbled_granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_GRANITE)));
    public static final Block COBBLED_DIORITE_VERTICAL_STAIRS = registerBlock("cobbled_diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DIORITE)));
    public static final Block POLISHED_ANDESITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_andesite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_ANDESITE_BRICKS)));
    public static final Block POLISHED_GRANITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_granite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_GRANITE_BRICKS)));
    public static final Block POLISHED_DIORITE_BRICK_VERTICAL_STAIRS = registerBlock("polished_diorite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_DIORITE_BRICKS)));
    public static final Block BRIMSTONE_VERTICAL_STAIRS = registerBlock("brimstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BRIMSTONE)));
    public static final Block POLISHED_BRIMSTONE_VERTICAL_STAIRS = registerBlock("polished_brimstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE)));
    public static final Block POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("polished_brimstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_BRICKS)));
    public static final Block POLISHED_BRIMSTONE_TILE_VERTICAL_STAIRS = registerBlock("polished_brimstone_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_BRIMSTONE_TILES)));
    public static final Block CRACKED_POLISHED_BRIMSTONE_BRICK_VERTICAL_STAIRS = registerBlock("cracked_polished_brimstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.CRACKED_POLISHED_BRIMSTONE_BRICKS)));
    public static final Block GOLDEN_BRICK_VERTICAL_STAIRS = registerBlock("golden_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.GOLDEN_BRICKS)));
    public static final Block LAPIS_LAZULI_BRICK_VERTICAL_STAIRS = registerBlock("lapis_lazuli_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.LAPIS_LAZULI_BRICKS)));
    public static final Block MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerBlock("mossy_deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.MOSSY_DEEPSLATE_BRICKS)));
    public static final Block NETHER_TILE_VERTICAL_STAIRS = registerBlock("nether_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.NETHER_TILES)));
    public static final Block RED_NETHER_TILE_VERTICAL_STAIRS = registerBlock("red_nether_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.RED_NETHER_TILES)));
    public static final Block BLUE_NETHER_TILE_VERTICAL_STAIRS = registerBlock("blue_nether_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.BLUE_NETHER_TILES)));

    //MISC & ME BEING LAZY
    public static final Block CHISELED_SANDSTONE_BRICKS = registerBlock("chiseled_sandstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.SANDSTONE_BRICKS).requiresTool()));
    public static final Block CHISELED_SOUL_SANDSTONE_BRICKS = registerBlock("chiseled_soul_sandstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.SOUL_SANDSTONE_BRICKS).requiresTool()));
    public static final Block CHISELED_RED_SANDSTONE_BRICKS = registerBlock("chiseled_red_sandstone_bricks", new Block(FabricBlockSettings.copy(EBBlocks.RED_SANDSTONE_BRICKS).requiresTool()));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS).requiresTool()));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS).requiresTool()));
    public static final Block QUARTZ_BRICK_VERTICAL_STAIRS = registerBlock("quartz_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_ORE = registerBlock("quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(2, 5)));
    public static final Block SOUL_MAGMA_BLOCK = registerBlock("soul_magma_block", new SoulMagmaBlock(FabricBlockSettings.copy(Blocks.MAGMA_BLOCK).requiresTool()));
    public static final Block CRACKED_COBBLESTONE_BRICKS = registerBlock("cracked_cobblestone_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block CRACKED_COBBLED_DEEPSLATE_BRICKS = registerBlock("cracked_cobbled_deepslate_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).requiresTool()));
    public static final Block CRACKED_BLACKSTONE_BRICKS = registerBlock("cracked_blackstone_bricks", new Block(FabricBlockSettings.copy(Blocks.BLACKSTONE).requiresTool()));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks", new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_BRICK_WALL = registerBlock("polished_sulfuric_brimstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_TILE_WALL = registerBlock("polished_sulfuric_brimstone_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block POLISHED_SULFURIC_BRIMSTONE_WALL = registerBlock("polished_sulfuric_brimstone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_STAIRS = registerBlock("mossy_cobblestone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final Block CRACKED_OBSIDIAN_BRICKS = registerBlock("cracked_obsidian_bricks", new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).requiresTool()));
    public static final Block CRACKED_COBBLED_ANDESITE_BRICKS = registerBlock("cracked_cobbled_andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block CRACKED_COBBLED_GRANITE_BRICKS = registerBlock("cracked_cobbled_granite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block CRACKED_COBBLED_DIORITE_BRICKS = registerBlock("cracked_cobbled_diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).requiresTool()));
    public static final Block CRACKED_SMOOTH_BRICKS = registerBlock("cracked_smooth_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block GOLD_GRATE = registerBlock("gold_grate", new SimpleWaterloggableBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block IRON_GRATE = registerBlock("iron_grate", new SimpleWaterloggableBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block NETHERITE_BRICK_WALL = registerBlock("netherite_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).requiresTool()));
    public static final Block RAINBOW_CARPET = registerBlock("rainbow_carpet", new CarpetBlock(FabricBlockSettings.copy(Blocks.RED_CARPET)));
    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool", new Block(FabricBlockSettings.copy(Blocks.RED_WOOL)));
    public static final Block RAINBOW_STAINED_GLASS = registerBlock("rainbow_stained_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block RAINBOW_STAINED_GLASS_PANE = registerBlock("rainbow_stained_glass_pane", new PaneBlock(FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS_PANE)));
    public static final Block CALCITE_BRICK_VERTICAL_STAIRS = registerBlock("calcite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.CALCITE_BRICKS)));
    public static final Block CALCITE_TILE_VERTICAL_STAIRS = registerBlock("calcite_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.CALCITE_TILES)));
    public static final Block TUFF_BRICK_VERTICAL_STAIRS = registerBlock("tuff_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.TUFF_BRICKS)));
    public static final Block TUFF_TILE_VERTICAL_STAIRS = registerBlock("tuff_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.TUFF_TILES)));
    public static final Block DRIPSTONE_BRICK_VERTICAL_STAIRS = registerBlock("dripstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.DRIPSTONE_BRICKS)));
    public static final Block DRIPSTONE_TILE_VERTICAL_STAIRS = registerBlock("dripstone_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.DRIPSTONE_TILES)));
    public static final Block SNOW_BRICK_VERTICAL_STAIRS = registerBlock("snow_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.SNOW_BRICKS)));
    public static final Block MUD_TILE_VERTICAL_STAIRS = registerBlock("mud_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.MUD_TILES)));
    public static final Block NETHERITE_BRICK_VERTICAL_STAIRS = registerBlock("netherite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.NETHERITE_BRICKS)));
    public static final Block COBBLED_GRANITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_granite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_GRANITE_BRICKS)));
    public static final Block COBBLED_DIORITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_diorite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_DIORITE_BRICKS)));
    public static final Block COBBLED_ANDESITE_BRICK_VERTICAL_STAIRS = registerBlock("cobbled_andesite_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.COBBLED_ANDESITE_BRICKS)));
    public static final Block QUARTZ_TILE_VERTICAL_STAIRS = registerBlock("quartz_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.QUARTZ_TILES)));
    public static final Block DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(2, 5)));
    public static final Block POLISHED_TUFF_VERTICAL_STAIRS = registerBlock("polished_tuff_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_TUFF)));
    public static final Block TUFF_VERTICAL_STAIRS = registerBlock("tuff_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.TUFF)));

    //TERRACOTTA TILES
    public static final Block TERRACOTTA_TILES = registerBlock("terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block TERRACOTTA_TILE_STAIRS = registerBlock("terracotta_tile_stairs", new StairsBlock(TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block TERRACOTTA_TILE_SLAB = registerBlock("terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block RAINBOW_TERRACOTTA_TILES = registerBlock("rainbow_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RAINBOW_TERRACOTTA_TILE_STAIRS = registerBlock("rainbow_terracotta_tile_stairs", new StairsBlock(RAINBOW_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block RAINBOW_TERRACOTTA_TILE_SLAB = registerBlock("rainbow_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BLACK_TERRACOTTA_TILES = registerBlock("black_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_TERRACOTTA_TILE_STAIRS = registerBlock("black_terracotta_tile_stairs", new StairsBlock(TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BLACK_TERRACOTTA_TILE_SLAB = registerBlock("black_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BROWN_TERRACOTTA_TILES = registerBlock("brown_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_TERRACOTTA_TILE_STAIRS = registerBlock("brown_terracotta_tile_stairs", new StairsBlock(BROWN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BROWN_TERRACOTTA_TILE_SLAB = registerBlock("brown_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block GRAY_TERRACOTTA_TILES = registerBlock("gray_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_TERRACOTTA_TILE_STAIRS = registerBlock("gray_terracotta_tile_stairs", new StairsBlock(GRAY_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block GRAY_TERRACOTTA_TILE_SLAB = registerBlock("gray_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILES = registerBlock("light_gray_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = registerBlock("light_gray_terracotta_tile_stairs", new StairsBlock(LIGHT_GRAY_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_SLAB = registerBlock("light_gray_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block WHITE_TERRACOTTA_TILES = registerBlock("white_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_TERRACOTTA_TILE_STAIRS = registerBlock("white_terracotta_tile_stairs", new StairsBlock(WHITE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block WHITE_TERRACOTTA_TILE_SLAB = registerBlock("white_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block RED_TERRACOTTA_TILES = registerBlock("red_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_TERRACOTTA_TILE_STAIRS = registerBlock("red_terracotta_tile_stairs", new StairsBlock(RED_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block RED_TERRACOTTA_TILE_SLAB = registerBlock("red_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_TILES = registerBlock("orange_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_TILE_STAIRS = registerBlock("orange_terracotta_tile_stairs", new StairsBlock(ORANGE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_TILE_SLAB = registerBlock("orange_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_TILES = registerBlock("yellow_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_TILE_STAIRS = registerBlock("yellow_terracotta_tile_stairs", new StairsBlock(YELLOW_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_TILE_SLAB = registerBlock("yellow_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIME_TERRACOTTA_TILES = registerBlock("lime_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_TERRACOTTA_TILE_STAIRS = registerBlock("lime_terracotta_tile_stairs", new StairsBlock(LIME_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIME_TERRACOTTA_TILE_SLAB = registerBlock("lime_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block GREEN_TERRACOTTA_TILES = registerBlock("green_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_TERRACOTTA_TILE_STAIRS = registerBlock("green_terracotta_tile_stairs", new StairsBlock(GREEN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block GREEN_TERRACOTTA_TILE_SLAB = registerBlock("green_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block CYAN_TERRACOTTA_TILES = registerBlock("cyan_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_TERRACOTTA_TILE_STAIRS = registerBlock("cyan_terracotta_tile_stairs", new StairsBlock(CYAN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block CYAN_TERRACOTTA_TILE_SLAB = registerBlock("cyan_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILES = registerBlock("light_blue_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = registerBlock("light_blue_terracotta_tile_stairs", new StairsBlock(LIGHT_BLUE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_SLAB = registerBlock("light_blue_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BLUE_TERRACOTTA_TILES = registerBlock("blue_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_TERRACOTTA_TILE_STAIRS = registerBlock("blue_terracotta_tile_stairs", new StairsBlock(BLUE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block BLUE_TERRACOTTA_TILE_SLAB = registerBlock("blue_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_TILES = registerBlock("purple_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_TILE_STAIRS = registerBlock("purple_terracotta_tile_stairs", new StairsBlock(PURPLE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_TILE_SLAB = registerBlock("purple_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_TILES = registerBlock("magenta_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_TILE_STAIRS = registerBlock("magenta_terracotta_tile_stairs", new StairsBlock(MAGENTA_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_TILE_SLAB = registerBlock("magenta_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block PINK_TERRACOTTA_TILES = registerBlock("pink_terracotta_tiles", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_TERRACOTTA_TILE_STAIRS = registerBlock("pink_terracotta_tile_stairs", new StairsBlock(PINK_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));
    public static final Block PINK_TERRACOTTA_TILE_SLAB = registerBlock("pink_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.TERRACOTTA_TILES).requiresTool()));

    //QUARTZ
    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles", new Block(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS).requiresTool()));
    public static final Block QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs", new StairsBlock(QUARTZ_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS).requiresTool()));
    public static final Block QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS).requiresTool()));

    //TUFF
    public static final Block TUFF_TILES = registerBlock("tuff_tiles", new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_TILE_STAIRS = registerBlock("tuff_tile_stairs", new StairsBlock(TUFF_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_TILE_SLAB = registerBlock("tuff_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_TILE_WALL = registerBlock("tuff_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));

    //CALCITE
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite", new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles", new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs", new StairsBlock(POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_CALCITE).requiresTool()));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_CALCITE).requiresTool()));
    public static final Block POLISHED_CALCITE_VERTICAL_STAIRS = registerBlock("polished_calcite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_CALCITE).requiresTool()));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks", new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", new StairsBlock(CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles", new Block(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs", new StairsBlock(CALCITE_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE).requiresTool()));

    //DRIPSTONE
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks", new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs", new StairsBlock(DRIPSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles", new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs", new StairsBlock(DRIPSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall", new WallBlock(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK).requiresTool()));

    //NATURAL BUILDING VARIANTS
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks", new Block(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).requiresTool()));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs", new StairsBlock(SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SNOW_BLOCK).requiresTool()));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).requiresTool()));
    public static final Block MUD_TILES = registerBlock("mud_tiles", new Block(FabricBlockSettings.copy(Blocks.MUD_BRICKS).requiresTool()));
    public static final Block MUD_TILE_STAIRS = registerBlock("mud_tile_stairs", new StairsBlock(MUD_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.MUD_BRICKS).requiresTool()));
    public static final Block MUD_TILE_SLAB = registerBlock("mud_tile_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.MUD_BRICKS).requiresTool()));
    public static final Block MUD_BRICK_VERTICAL_STAIRS = registerBlock("mud_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MUD_BRICKS)));

    //BACKPORT BLOCKS (REMOVE WHEN 1.21 RELEASES)
    public static final Block CHISELED_COPPER = registerBlock("chiseled_copper", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block EXPOSED_CHISELED_COPPER = registerBlock("exposed_chiseled_copper", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WEATHERED_CHISELED_COPPER = registerBlock("weathered_chiseled_copper", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block OXIDIZED_CHISELED_COPPER = registerBlock("oxidized_chiseled_copper", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_CHISELED_COPPER = registerBlock("waxed_chiseled_copper", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER = registerBlock("waxed_exposed_chiseled_copper", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER = registerBlock("waxed_weathered_chiseled_copper", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER = registerBlock("waxed_oxidized_chiseled_copper", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK)));
    public static final Block COPPER_BULB = registerBlock("copper_bulb", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 15)));
    public static final Block EXPOSED_COPPER_BULB = registerBlock("exposed_copper_bulb", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 11)));
    public static final Block WEATHERED_COPPER_BULB = registerBlock("weathered_copper_bulb", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 8)));
    public static final Block OXIDIZED_COPPER_BULB = registerBlock("oxidized_copper_bulb", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 3)));
    public static final Block WAXED_COPPER_BULB = registerBlock("waxed_copper_bulb", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 15)));
    public static final Block WAXED_EXPOSED_COPPER_BULB = registerBlock("waxed_exposed_copper_bulb", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 11)));
    public static final Block WAXED_WEATHERED_COPPER_BULB = registerBlock("waxed_weathered_copper_bulb", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 8)));
    public static final Block WAXED_OXIDIZED_COPPER_BULB = registerBlock("waxed_oxidized_copper_bulb", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).luminance(state -> 3)));
    public static final Block COPPER_GRATE = registerBlock("copper_grate", new OxidizableWaterloggableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate", new OxidizableWaterloggableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate", new OxidizableWaterloggableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate", new OxidizableWaterloggableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate", new Block(FabricBlockSettings.copy(Blocks.COPPER_BLOCK).nonOpaque()));
    public static final Block POLISHED_TUFF = registerBlock("polished_tuff", new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs", new StairsBlock(POLISHED_TUFF.getDefaultState(), FabricBlockSettings.copy(EBBlocks.POLISHED_TUFF).requiresTool()));
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_TUFF).requiresTool()));
    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall", new WallBlock(FabricBlockSettings.copy(EBBlocks.POLISHED_TUFF).requiresTool()));
    public static final Block CHISELED_POLISHED_TUFF = registerBlock("chiseled_polished_tuff", new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks", new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_SLAB = registerBlock("tuff_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_WALL = registerBlock("tuff_wall", new WallBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs", new StairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks", new Block(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs", new StairsBlock(TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));

    //ASPHALT
    public static final Block SWIFT_ASPHALT = registerBlock("swift_asphalt", new SpeedBlock(FabricBlockSettings.copy(Blocks.TUFF).requiresTool()));
    public static final Block SWIFT_ASPHALT_STAIRS = registerBlock("swift_asphalt_stairs", new SpeedStairsBlock(SWIFT_ASPHALT.getDefaultState(), FabricBlockSettings.copy(EBBlocks.ASPHALT).requiresTool()));
    public static final Block SWIFT_ASPHALT_SLAB = registerBlock("swift_asphalt_slab", new SpeedSlabBlock(FabricBlockSettings.copy(EBBlocks.ASPHALT).requiresTool()));
    public static final Block SWIFT_ASPHALT_VERTICAL_STAIRS = registerBlock("swift_asphalt_vertical_stairs", new SpeedVerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.ASPHALT)));
    public static final Block ASPHALT = registerBlock("asphalt", new Block(FabricBlockSettings.copy(Blocks.STONE).strength(1).resistance(2).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool()));
    public static final Block ASPHALT_STAIRS = registerBlock("asphalt_stairs", new StairsBlock(ASPHALT.getDefaultState(), FabricBlockSettings.copy(EBBlocks.ASPHALT).requiresTool()));
    public static final Block ASPHALT_SLAB = registerBlock("asphalt_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.ASPHALT).requiresTool()));
    public static final Block ASPHALT_VERTICAL_STAIRS = registerBlock("asphalt_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.ASPHALT)));

    //LIGHT BLOCKS
    public static final Block BLACKSTONE_LAMP = registerBlock("blackstone_lamp", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block BLACKSTONE_WINDOW = registerBlock("blackstone_window", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));
    public static final Block STONE_LAMP = registerBlock("stone_lamp", new Block(FabricBlockSettings.copy(Blocks.STONE).luminance(state -> 15)));
    public static final Block DEEPSLATE_LAMP = registerBlock("deepslate_lamp", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE).luminance(state -> 15)));

    //NORMAL BRICK VARIANTS
    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block HERRINGBONE_BRICKS = registerBlock("herringbone_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block BASKETWEAVE_BRICKS = registerBlock("basketweave_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block BASKETWEAVE_BRICK_STAIRS = registerBlock("basketweave_brick_stairs", new StairsBlock(BASKETWEAVE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block BASKETWEAVE_BRICK_SLAB = registerBlock("basketweave_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block BASKETWEAVE_BRICK_VERTICAL_STAIRS = registerBlock("basketweave_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block BASKETWEAVE_BRICK_WALL = registerBlock("basketweave_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_HERRINGBONE_BRICKS = registerBlock("smooth_herringbone_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_BASKETWEAVE_BRICKS = registerBlock("smooth_basketweave_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_BASKETWEAVE_BRICK_STAIRS = registerBlock("smooth_basketweave_brick_stairs", new StairsBlock(SMOOTH_BASKETWEAVE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_BASKETWEAVE_BRICK_SLAB = registerBlock("smooth_basketweave_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));
    public static final Block SMOOTH_BASKETWEAVE_BRICK_VERTICAL_STAIRS = registerBlock("smooth_basketweave_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block SMOOTH_BASKETWEAVE_BRICK_WALL = registerBlock("smooth_basketweave_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BRICKS).requiresTool()));

    //ANCIENT WOOD
    public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks", new Block(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block ANCIENT_STAIRS = registerBlock("ancient_stairs", new StairsBlock(ANCIENT_PLANKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_SLAB = registerBlock("ancient_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_VERTICAL_STAIRS = registerBlock("ancient_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_MOSAIC = registerBlock("ancient_mosaic", new Block(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_MOSAIC_STAIRS = registerBlock("ancient_mosaic_stairs", new StairsBlock(ANCIENT_MOSAIC.getDefaultState(), FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_MOSAIC_SLAB = registerBlock("ancient_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_MOSAIC_VERTICAL_STAIRS = registerBlock("ancient_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block CHISELED_ANCIENT = registerBlock("chiseled_ancient", new Block(FabricBlockSettings.copy(EBBlocks.ANCIENT_PLANKS)));
    public static final Block ANCIENT_LOG = registerBlock("ancient_log", new PillarBlock(FabricBlockSettings.copy(Blocks.CHERRY_LOG)));
    public static final Block ANCIENT_WOOD = registerBlock("ancient_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.CHERRY_LOG)));
    public static final Block STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log", new PillarBlock(FabricBlockSettings.copy(Blocks.CHERRY_LOG)));
    public static final Block STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.CHERRY_LOG)));
    public static final Block ANCIENT_BUTTON = registerBlock("ancient_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).noCollision().nonOpaque(), BlockSetType.CHERRY, 30, true));
    public static final Block ANCIENT_PRESSURE_PLATE = registerBlock("ancient_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).nonOpaque().noCollision(), BlockSetType.CHERRY));
    public static final Block ANCIENT_DOOR = registerBlock("ancient_door", new DoorBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).nonOpaque(), BlockSetType.CHERRY));
    public static final Block ANCIENT_FENCE = registerBlock("ancient_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS), WoodType.CHERRY));
    public static final Block ANCIENT_SAPLING = registerBlock("ancient_sapling", new SaplingBlock(new AncientSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).luminance(6)));
    public static final Block POTTED_ANCIENT_SAPLING = Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, "potted_ancient_sapling"), new FlowerPotBlock(ANCIENT_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING).nonOpaque().luminance(6)));
    public static final Block ANCIENT_LEAVES = registerBlock("ancient_leaves", new AncientLeavesBlock(FabricBlockSettings.copy(Blocks.AZALEA_LEAVES).luminance(state -> 9)));
    public static final Block UNLIT_ANCIENT_LEAVES = registerBlock("unlit_ancient_leaves", new AncientLeavesBlock(FabricBlockSettings.copy(Blocks.AZALEA_LEAVES)));

    //MAPLE WOOD
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", new StairsBlock(MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_VERTICAL_STAIRS = registerBlock("maple_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_MOSAIC = registerBlock("maple_mosaic", new Block(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_MOSAIC_STAIRS = registerBlock("maple_mosaic_stairs", new StairsBlock(MAPLE_MOSAIC.getDefaultState(), FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_MOSAIC_SLAB = registerBlock("maple_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_MOSAIC_VERTICAL_STAIRS = registerBlock("maple_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block CHISELED_MAPLE = registerBlock("chiseled_maple", new Block(FabricBlockSettings.copy(EBBlocks.MAPLE_PLANKS)));
    public static final Block MAPLE_LOG = registerBlock("maple_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).noCollision().nonOpaque(), BlockSetType.OAK, 30, true));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque().noCollision(), BlockSetType.OAK));
    public static final Block MAPLE_DOOR = registerBlock("maple_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block MAPLE_LADDER = registerBlock("maple_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));

    //WILLOW WOOD
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs", new StairsBlock(WILLOW_PLANKS.getDefaultState(), FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_SLAB = registerBlock("willow_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_VERTICAL_STAIRS = registerBlock("willow_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_MOSAIC = registerBlock("willow_mosaic", new Block(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_MOSAIC_STAIRS = registerBlock("willow_mosaic_stairs", new StairsBlock(WILLOW_MOSAIC.getDefaultState(), FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_MOSAIC_SLAB = registerBlock("willow_mosaic_slab", new SlabBlock(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_MOSAIC_VERTICAL_STAIRS = registerBlock("willow_mosaic_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block CHISELED_WILLOW = registerBlock("chiseled_willow", new Block(FabricBlockSettings.copy(EBBlocks.WILLOW_PLANKS)));
    public static final Block WILLOW_LOG = registerBlock("willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block WILLOW_BUTTON = registerBlock("willow_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).noCollision().nonOpaque(), BlockSetType.OAK, 30, true));
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque().noCollision(), BlockSetType.OAK));
    public static final Block WILLOW_DOOR = registerBlock("willow_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block WILLOW_TRAPDOOR = registerBlock("willow_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling", new SaplingBlock(new WillowSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WILLOW_SAPLING = Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, "potted_willow_sapling"), new FlowerPotBlock(WILLOW_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block WILLOW_LADDER = registerBlock("willow_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));

    //MAPLE FLORA
    public static final Block RED_MAPLE_LEAVES_PILE = registerBlock("red_maple_leaves_pile", new LeavesPileBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block ORANGE_MAPLE_LEAVES_PILE = registerBlock("orange_maple_leaves_pile", new LeavesPileBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block YELLOW_MAPLE_LEAVES_PILE = registerBlock("yellow_maple_leaves_pile", new LeavesPileBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling", new SaplingBlock(new RedMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_RED_MAPLE_SAPLING = Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, "potted_red_maple_sapling"), new FlowerPotBlock(RED_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves", new AncientLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block ORANGE_MAPLE_SAPLING = registerBlock("orange_maple_sapling", new SaplingBlock(new OrangeMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_ORANGE_MAPLE_SAPLING = Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, "potted_orange_maple_sapling"), new FlowerPotBlock(ORANGE_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block ORANGE_MAPLE_LEAVES = registerBlock("orange_maple_leaves", new OrangeMapleLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block YELLOW_MAPLE_SAPLING = registerBlock("yellow_maple_sapling", new SaplingBlock(new YellowMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_YELLOW_MAPLE_SAPLING = Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, "potted_yellow_maple_sapling"), new FlowerPotBlock(YELLOW_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block YELLOW_MAPLE_LEAVES = registerBlock("yellow_maple_leaves", new YellowMapleLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));

    //VANILLA BLOCK VARIANTS
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DIRT)));

    //CRYSTAL GLASS & LIGHTS
    public static final Block FIERY_GLASS = registerBlock("fiery_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)));
    public static final Block FIERY_GLASS_PANE = registerBlock("fiery_glass_pane", new PaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)));
    public static final Block AMETHYST_GLASS = registerBlock("amethyst_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)));
    public static final Block AMETHYST_GLASS_PANE = registerBlock("amethyst_glass_pane", new PaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)));
    public static final Block PRISMARINE_GLASS = registerBlock("prismarine_glass", new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)));
    public static final Block PRISMARINE_GLASS_PANE = registerBlock("prismarine_glass_pane", new PaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)));
    public static final Block FIERY_LAMP = registerBlock("fiery_lamp", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 11)));
    public static final Block AMETHYST_LAMP = registerBlock("amethyst_lamp", new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));

    //CRYSTAL BLOCK VARIANTS
    public static final Block FIERY_BLOCK = registerBlock("fiery_block", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).luminance(state -> 7)));
    public static final Block FIERY_CLUSTER = registerBlock("fiery_cluster", new AmethystClusterBlock(7, 3, FabricBlockSettings.copy(EBBlocks.FIERY_BLOCK).luminance(state -> 12)));
    public static final Block KYANITE_CLUSTER = registerBlock("kyanite_cluster", new AmethystClusterBlock(7, 3, FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block KYANITE_BLOCK = registerBlock("kyanite_block", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block PRISMARINE_CRYSTAL_BLOCK = registerBlock("prismarine_crystal_block", new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));

    //LADDER VARIANTS
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block ANCIENT_LADDER = registerBlock("ancient_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));
    public static final Block WARPED_LADDER = registerBlock("warped_ladder", new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER)));

    //SHELF VARIANTS
    public static final Block EMPTY_SHELF = registerBlock("empty_shelf", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block EMPTY_POTION_SHELF = registerBlock("empty_potion_shelf", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block WATER_POTION_SHELF = registerBlock("water_potion_shelf", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block POTION_SHELF = registerBlock("potion_shelf", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block ALCHEMIST_SHELF = registerBlock("alchemist_shelf", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block BRICKSHELF = registerBlock("brickshelf", new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    public static final Block NETHER_BRICKSHELF = registerBlock("nether_brickshelf", new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));

    private static Block registerBlock(String name, Block block) { registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ExcessiveBuilding.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ExcessiveBuilding.MODID, name), new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerBlocks() {
        ExcessiveBuilding.LOGGER.info("Registering Blocks for " + ExcessiveBuilding.MODID);
    }
}
