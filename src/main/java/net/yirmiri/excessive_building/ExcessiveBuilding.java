package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.yirmiri.excessive_building.init.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding implements ModInitializer {
	public static final String MODID = "excessive_building";
	public static final Logger LOGGER = LoggerFactory.getLogger("MODID");

	@Override
	public void onInitialize() {
		EBBlocks.registerBlocks();
		EBItems.registerItems();
		EBVillagers.registerVillagers();
		EBItemGroups.registerItemGroups();
		EBParticlesTypes.registerParticleTypes();

		StrippableBlockRegistry.register(EBBlocks.ANCIENT_LOG, EBBlocks.STRIPPED_ANCIENT_LOG);
		StrippableBlockRegistry.register(EBBlocks.ANCIENT_WOOD, EBBlocks.STRIPPED_ANCIENT_WOOD);
		StrippableBlockRegistry.register(EBBlocks.MAPLE_LOG, EBBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(EBBlocks.MAPLE_WOOD, EBBlocks.STRIPPED_MAPLE_WOOD);
		StrippableBlockRegistry.register(EBBlocks.WILLOW_LOG, EBBlocks.STRIPPED_WILLOW_LOG);
		StrippableBlockRegistry.register(EBBlocks.WILLOW_WOOD, EBBlocks.STRIPPED_WILLOW_WOOD);
	}
}
