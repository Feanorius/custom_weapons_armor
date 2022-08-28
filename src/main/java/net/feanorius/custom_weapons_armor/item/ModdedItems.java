package net.feanorius.custom_weapons_armor.item;

import net.feanorius.custom_weapons_armor.CustomWeaponsAndArmor;
import net.feanorius.custom_weapons_armor.item.weapons.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModdedItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomWeaponsAndArmor.MOD_ID);

    public static void register(IEventBus eventBus) {
        // iron weapons
        Items.register("iron_spear", IronSpearItem::new);
        Items.register("iron_halberd", IronHalberdItem::new);

        // steel weapons
        Items.register("steel_spear", SteelSpearItem::new);
        Items.register("steel_halberd", SteelHalberdItem::new);
        Items.register("steel_hammer", SteelHammerItem::new);
        Items.register("steel_mace", SteelMaceItem::new);
        Items.register("steel_saber", SteelSaberItem::new);
        Items.register("steel_war_axe", SteelWarAxeItem::new);

        // decorative weapons


        // steel armor


        // decorative armor


        Items.register(eventBus);
    }

}
