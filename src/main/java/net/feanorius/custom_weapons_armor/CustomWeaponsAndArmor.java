package net.feanorius.custom_weapons_armor;

import com.mojang.logging.LogUtils;
import net.feanorius.custom_weapons_armor.item.ModdedItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CustomWeaponsAndArmor.MOD_ID)
public class CustomWeaponsAndArmor
{
    public static final String MOD_ID = "custom_weapons_armor";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CustomWeaponsAndArmor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModdedItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
