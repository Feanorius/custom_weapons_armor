package net.feanorius.custom_weapons_armor.item;

import net.feanorius.custom_weapons_armor.CustomWeaponsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.feanorius.custom_weapons_armor.item.weapons.IronSpearItem;
import net.feanorius.custom_weapons_armor.item.weapons.IronHalberdItem;

public class ModdedItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomWeaponsAndArmor.MOD_ID);

    public static void register(IEventBus eventBus) {
        // iron weapons
        Items.register("iron_spear", IronSpearItem::new);
        Items.register("iron_halberd", IronHalberdItem::new);

        // steel weapons


        // decorative weapons


        // steel armor


        // decorative armor


        Items.register(eventBus);
    }

}
