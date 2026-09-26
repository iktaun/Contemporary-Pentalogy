package com.iktaun.thenewdevelopingage.item;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, thenewdevelopingage.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INGREDIENTS_TAB =
            CREATIVE_MODE_TABS.register("ingredients_tab",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Moditems.MAGNET_INGOT.get()))
                    .title(Component.translatable("itemGroup.ingredients"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.RAW_MAGNET.get());
                        pOutput.accept(Moditems.RAW_ALUMINIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("blocks_tab",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Modblocks.COLOURED_MAGNET_BLOCK.get()))
                    .title(Component.translatable("itemGroup.blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Modblocks.COLOURED_MAGNET_BLOCK.get());
                        pOutput.accept(Modblocks.MAGNET_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> OBJECT_TAB =
            CREATIVE_MODE_TABS.register("objects_tab",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Moditems.UNINFORMATIVE_RED_TICKET.get()))
                    .title(Component.translatable("itemGroup.objects"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.UNINFORMATIVE_BLUE_TICKET.get());
                        pOutput.accept(Moditems.BLUE_TICKET.get());
                        pOutput.accept(Moditems.UNINFORMATIVE_RED_TICKET.get());
                        pOutput.accept(Moditems.RED_TICKET.get());
                        pOutput.accept(Moditems.COLOURED_MAGNET_INGOT.get());
                        pOutput.accept(Moditems.MAGNET_INGOT.get());
                        pOutput.accept(Moditems.ALUMINIUM_INGOT.get());
                        pOutput.accept(Moditems.SULPHUR_POWDER.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TOOLS =
            CREATIVE_MODE_TABS.register("tools_tab",() ->CreativeModeTab.builder()
                    .icon(() ->new ItemStack(Moditems.REDSTONE_WRENCH.get()))
                    .title(Component.nullToEmpty("Tools"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.REDSTONE_WRENCH.get());
                        pOutput.accept(Moditems.OPTICAL_CABLE_WRENCH.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
