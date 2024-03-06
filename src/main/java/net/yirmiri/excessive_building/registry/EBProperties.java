package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.sound.BlockSoundGroup;

public class EBProperties {

    public static final class EBBlockProperties {

        //WOODS
        public static final FabricBlockSettings OAK_WOOD = FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings SPRUCE_WOOD = FabricBlockSettings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings BIRCH_WOOD = FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings JUNGLE_WOOD = FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings ACACIA_WOOD = FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings DARK_OAK_WOOD = FabricBlockSettings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings MANGROVE_WOOD = FabricBlockSettings.create().mapColor(MapColor.RED).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings CHERRY_WOOD = FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable();
        public static final FabricBlockSettings BAMBOO_WOOD = FabricBlockSettings.create().mapColor(MapColor.YELLOW).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable();
        public static final FabricBlockSettings CRIMSON_WOOD = FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD);
        public static final FabricBlockSettings WARPED_WOOD = FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD);
        public static final FabricBlockSettings ANCIENT_WOOD = FabricBlockSettings.create().mapColor(MapColor.WHITE).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable();
        public static final FabricBlockSettings MAPLE_WOOD = FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();
        public static final FabricBlockSettings WILLOW_WOOD = FabricBlockSettings.create().mapColor(MapColor.PALE_GREEN).instrument(Instrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable();

        //STONES
        public static final FabricBlockSettings COBBLED_STONE = FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE).requiresTool();
        public static final FabricBlockSettings COBBLED_DEEPSLATE = FabricBlockSettings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BASS).strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool();
        public static final FabricBlockSettings BLACKSTONE = FabricBlockSettings.create().mapColor(MapColor.BLACK).instrument(Instrument.BASS).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE).requiresTool();
        public static final FabricBlockSettings POLISHED_BLACKSTONE = FabricBlockSettings.create().mapColor(MapColor.BLACK).instrument(Instrument.BASS).strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE).requiresTool();
    }

    public static final class EBFoodProperties {
        public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 0), 1.0F).alwaysEdible().build();
    }
}
