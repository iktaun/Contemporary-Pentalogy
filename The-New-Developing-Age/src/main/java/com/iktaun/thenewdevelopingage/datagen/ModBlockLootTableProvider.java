package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.item.Moditems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        dropSelf(Modblocks.MAGNET_BLOCK.get());
        dropSelf(Modblocks.COLOURED_MAGNET_BLOCK.get());
        add(Modblocks.ALUMINIUM_ORE.get(), block -> createOreDrop(Modblocks.ALUMINIUM_ORE.get(), Moditems.RAW_ALUMINIUM.get()));
        add(Modblocks.MAGNETITE_ORE.get(), block -> createOreDrop(Modblocks.MAGNETITE_ORE.get(), Moditems.RAW_MAGNET.get()));
        add(Modblocks.SULPHUR_ORE.get(), block -> createOreDrop(Modblocks.SULPHUR_ORE.get(), Moditems.SULPHUR_POWDER.get()));
        add(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get(), block -> createOreDrop(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get(), Moditems.RAW_ALUMINIUM.get()));
        add(Modblocks.DEEPSLATE_MAGNETITE_ORE.get(), block -> createOreDrop(Modblocks.DEEPSLATE_MAGNETITE_ORE.get(), Moditems.RAW_MAGNET.get()));
        add(Modblocks.DEEPSLATE_SULPHUR_ORE.get(), block -> createOreDrop(Modblocks.DEEPSLATE_SULPHUR_ORE.get(), Moditems.SULPHUR_POWDER.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Modblocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
