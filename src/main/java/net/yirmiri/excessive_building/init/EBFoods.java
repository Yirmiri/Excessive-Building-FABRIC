package net.yirmiri.excessive_building.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class EBFoods {
    public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).statusEffect
            (new StatusEffectInstance(StatusEffects.HASTE, 3000, 0), 1.0F).alwaysEdible().build();
}
