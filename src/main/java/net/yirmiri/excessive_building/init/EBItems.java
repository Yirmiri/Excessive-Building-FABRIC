package net.yirmiri.excessive_building.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItems {

    public static final Item FIERY_SHARDS = registerItem("fiery_shards", new Item(new FabricItemSettings()));

    public static final Item KYANITE_SHARDS = registerItem("kyanite_shards", new Item(new FabricItemSettings()));

    public static final Item ANCIENT_FRUIT = registerItem("ancient_fruit", new Item(new FabricItemSettings().food(EBFoods.ANCIENT_FRUIT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExcessiveBuilding.MODID, name), item);
    }

    public static void registerModItems() {
        ExcessiveBuilding.LOGGER.info("Registering Items for " + ExcessiveBuilding.MODID);
    }
}
