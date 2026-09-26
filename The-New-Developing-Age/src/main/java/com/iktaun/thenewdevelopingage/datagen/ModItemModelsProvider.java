package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.item.Moditems;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, thenewdevelopingage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Moditems.MAGNET_INGOT.get());
        basicItem(Moditems.COLOURED_MAGNET_INGOT.get());
        basicItem(Moditems.RAW_MAGNET.get());
        basicItem(Moditems.ALUMINIUM_INGOT.get());
        basicItem(Moditems.RAW_ALUMINIUM.get());
        basicItem(Moditems.UNINFORMATIVE_BLUE_TICKET.get());
        basicItem(Moditems.UNINFORMATIVE_RED_TICKET.get());
        basicItem(Moditems.RED_TICKET.get());
        basicItem(Moditems.BLUE_TICKET.get());
        basicItem(Moditems.REDSTONE_WRENCH.get());
        basicItem(Moditems.SULPHUR_POWDER.get());
        basicItem(Moditems.OPTICAL_CABLE_WRENCH.get());
    }
}
