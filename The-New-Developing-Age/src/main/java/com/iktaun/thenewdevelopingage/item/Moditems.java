package com.iktaun.thenewdevelopingage.item;

import com.iktaun.thenewdevelopingage.item.custom.ModFuelItem;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
      DeferredRegister
              .create(ForgeRegistries.ITEMS,
              thenewdevelopingage.MOD_ID);

    public static final RegistryObject<Item> MAGNET_INGOT =
            ITEMS.register("magnet_ingot",
                    () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> COLOURED_MAGNET_INGOT =
            ITEMS.register("coloured_magnet_ingot",
                    () ->new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_MAGNET =
            ITEMS.register("raw_magnet",
                    () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> UNINFORMATIVE_BLUE_TICKET =
            ITEMS.register("uninformative_blue_ticket",
                    () ->new ModFuelItem(new Item.Properties()
                    ,10));
    public static final RegistryObject<Item> UNINFORMATIVE_RED_TICKET =
            ITEMS.register("uninformative_red_ticket",
                    () ->new ModFuelItem(new Item.Properties()
                    ,10));
    public static final RegistryObject<Item> RED_TICKET =
            ITEMS.register("red_ticket",
                    () ->new ModFuelItem(new Item.Properties()
                    ,10));
    public static final RegistryObject<Item> BLUE_TICKET =
            ITEMS.register("blue_ticket",
                    () ->new ModFuelItem(new Item.Properties()
                    ,10));
    public static final RegistryObject<Item> RAW_ALUMINIUM =
            ITEMS.register("raw_aluminium",
                    () ->new Item(new Item.Properties()
                    ));
    public static final RegistryObject<Item> ALUMINIUM_INGOT =
            ITEMS.register("aluminium_ingot",
                    () ->new Item(new Item.Properties()
                    ));
    public static final RegistryObject<Item> SULPHUR_POWDER =
            ITEMS.register("sulphur_powder",
                    () ->new Item(new Item.Properties()
                    ));
    public static final RegistryObject<Item> REDSTONE_WRENCH =
            ITEMS.register("redstone_wrench",
                    () ->new Item(new Item.Properties()
                    ));
    public static final RegistryObject<Item> OPTICAL_CABLE_WRENCH =
            ITEMS.register("optical_cable_wrench",
                    () ->new Item(new Item.Properties()
                    ));
    public static final RegistryObject<Item> OPTICAL_CABLE =
            ITEMS.register("optical_cable",
                    () ->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
