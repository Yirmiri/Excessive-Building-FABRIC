package net.yirmiri.excessive_building.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.yirmiri.excessive_building.init.EBBlocks;

public class EBVillagers {

    private static void registerVillagerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
            factories -> { factories.add((entity, random) -> new TradeOffer(
                new ItemStack(Items.EMERALD, 2),
                new ItemStack(EBBlocks.ASPHALT, 12),
                16, 30, 0.05f));
        });
    }

    public static void registerVillagers() {
        registerVillagerTrades();
    }
}
