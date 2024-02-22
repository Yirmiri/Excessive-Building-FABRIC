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
		EBItems.registerModItems();
		EBBlocks.registerModBlocks();
		EBVillagers.registerModStuffs();
		EBItemGroups.registerItemGroups();
		EBParticlesTypes.registerParticles();

		StrippableBlockRegistry.register(EBBlocks.ANCIENT_LOG, EBBlocks.STRIPPED_ANCIENT_LOG);
		StrippableBlockRegistry.register(EBBlocks.ANCIENT_WOOD, EBBlocks.STRIPPED_ANCIENT_WOOD);
	}
}
