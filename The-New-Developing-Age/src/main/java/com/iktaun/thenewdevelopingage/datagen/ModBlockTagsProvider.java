package com.iktaun.thenewdevelopingage.datagen;

import com.iktaun.thenewdevelopingage.block.Modblocks;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> LookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, LookupProvider, thenewdevelopingage.MOD_ID,existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Modblocks.ALUMINIUM_ORE.get())
                .add(Modblocks.MAGNETITE_ORE.get())
                .add(Modblocks.SULPHUR_ORE.get())
                .add(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get())
                .add(Modblocks.DEEPSLATE_MAGNETITE_ORE.get())
                .add(Modblocks.DEEPSLATE_SULPHUR_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Modblocks.ALUMINIUM_ORE.get())
                .add(Modblocks.MAGNETITE_ORE.get())
                .add(Modblocks.SULPHUR_ORE.get())
                .add(Modblocks.DEEPSLATE_ALUMINIUM_ORE.get())
                .add(Modblocks.DEEPSLATE_MAGNETITE_ORE.get())
                .add(Modblocks.DEEPSLATE_SULPHUR_ORE.get());

    }
}
