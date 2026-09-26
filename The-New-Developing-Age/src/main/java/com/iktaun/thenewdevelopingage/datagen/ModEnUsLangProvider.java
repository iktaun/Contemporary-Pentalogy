package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.item.Moditems;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider{
    public ModEnUsLangProvider(PackOutput output) {
        super(output, thenewdevelopingage.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Moditems.MAGNET_INGOT.get(), "Magnet Ingot");
        add(Moditems.COLOURED_MAGNET_INGOT.get(), "Coloured Magnet Ingot");
        add(Moditems.RAW_MAGNET.get(), "Raw Magnet");
        add(Moditems.UNINFORMATIVE_RED_TICKET.get(), "Uninformative Red Ticket");
        add(Moditems.UNINFORMATIVE_BLUE_TICKET.get(), "Uninformative Blue Ticket");
        add(Moditems.RED_TICKET.get(), "Red Ticket");
        add(Moditems.BLUE_TICKET.get(), "Blue Ticket");
        add(Moditems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(Moditems.RAW_ALUMINIUM.get(), "Raw Aluminium");
        add(Moditems.REDSTONE_WRENCH.get(), "Redstone Wrench");
        add(Moditems.OPTICAL_CABLE_WRENCH.get(), "Optical Cable Wrench");
        add(Moditems.SULPHUR_POWDER.get(), "Sulphur Powder");

        add(Modblocks.COLOURED_MAGNET_BLOCK.get(), "Coloured Magnet Block");
        add(Modblocks.MAGNET_BLOCK.get(), "Magnet Block");
        add(Modblocks.MAGNETITE_ORE.get(), "Magnetite Ore");
        add(Modblocks.ALUMINIUM_ORE.get(), "Aluminium Ore");
        add(Modblocks.SULPHUR_ORE.get(), "Sulphur Ore");
        add(Modblocks.DEEPSLATE_MAGNETITE_ORE.get(), "Deepslate Magnetite Ore");
        add(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get(), "Deepslate Aluminium Ore");
        add(Modblocks.DEEPSLATE_SULPHUR_ORE.get(), "Deepslate Sulphur Ore");

        add("itemGroup.ingredients", "Ingredients Items");
        add("itemGroup.blocks", "Blocks Items");
        add("itemGroup.objects", "Objects Items");
        add("itemGroup.tools", "Tools");
    }
}