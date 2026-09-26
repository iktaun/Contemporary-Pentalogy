package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, thenewdevelopingage.MOD_ID,exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(Modblocks.ALUMINIUM_ORE.get(), cubeAll(Modblocks.ALUMINIUM_ORE.get()));
        simpleBlockWithItem(Modblocks.MAGNETITE_ORE.get(), cubeAll(Modblocks.MAGNETITE_ORE.get()));
        simpleBlockWithItem(Modblocks.MAGNET_BLOCK.get(), cubeAll(Modblocks.MAGNET_BLOCK.get()));
        simpleBlockWithItem(Modblocks.SULPHUR_ORE.get(), cubeAll(Modblocks.SULPHUR_ORE.get()));
        simpleBlockWithItem(Modblocks.DEEPSLATE_SULPHUR_ORE.get(), cubeAll(Modblocks.DEEPSLATE_SULPHUR_ORE.get()));
        simpleBlockWithItem(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get(), cubeAll(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get()));
        simpleBlockWithItem(Modblocks.DEEPSLATE_MAGNETITE_ORE.get(), cubeAll(Modblocks.DEEPSLATE_MAGNETITE_ORE.get()));

        simpleBlockWithItem(Modblocks.COLOURED_MAGNET_BLOCK.get(),
                models().getExistingFile(modLoc("block/coloured_magnet_block")));
    }
}
