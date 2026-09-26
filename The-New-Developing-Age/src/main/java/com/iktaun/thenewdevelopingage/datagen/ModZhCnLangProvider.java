package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.item.Moditems;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider{
    public ModZhCnLangProvider(PackOutput output) {
        super(output, thenewdevelopingage.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(Moditems.MAGNET_INGOT.get(), "磁铁锭");
        add(Moditems.COLOURED_MAGNET_INGOT.get(), "上色磁铁锭");
        add(Moditems.RAW_MAGNET.get(), "粗磁铁");
        add(Moditems.UNINFORMATIVE_RED_TICKET.get(), "未打印的红色车票");
        add(Moditems.UNINFORMATIVE_BLUE_TICKET.get(), "未打印的蓝色车票");
        add(Moditems.RED_TICKET.get(), "红色车票");
        add(Moditems.BLUE_TICKET.get(), "蓝色车票");
        add(Moditems.ALUMINIUM_INGOT.get(), "铝锭");
        add(Moditems.RAW_ALUMINIUM.get(), "粗铝");
        add(Moditems.REDSTONE_WRENCH.get(), "红石扳手");
        add(Moditems.OPTICAL_CABLE_WRENCH.get(), "光缆扳手");
        add(Moditems.SULPHUR_POWDER.get(),"硫磺粉");

        add(Modblocks.COLOURED_MAGNET_BLOCK.get(), "上色磁铁块");
        add(Modblocks.MAGNET_BLOCK.get(), "磁铁块");
        add(Modblocks.MAGNETITE_ORE.get(), "磁铁矿");
        add(Modblocks.ALUMINIUM_ORE.get(), "铝矿");
        add(Modblocks.SULPHUR_ORE.get(), "硫磺矿");
        add(Modblocks.DEEPSLATE_MAGNETITE_ORE.get(), "深板岩磁铁矿");
        add(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get(), "深板岩铝矿");
        add(Modblocks.DEEPSLATE_SULPHUR_ORE.get(), "深板岩硫磺矿");

        add("itemGroup.ingredients", "原材料");
        add("itemGroup.blocks", "方块");
        add("itemGroup.objects", "物件");
        add("itemGroup.tools", "工具");
    }
}