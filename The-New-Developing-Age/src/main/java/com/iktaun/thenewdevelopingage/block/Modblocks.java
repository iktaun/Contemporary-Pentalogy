package com.iktaun.thenewdevelopingage.block;

import com.iktaun.thenewdevelopingage.block.custom.blocks.ColouredMagnetBlock;
import com.iktaun.thenewdevelopingage.item.Moditems;
import com.iktaun.thenewdevelopingage.thenewdevelopingage;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Modblocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, thenewdevelopingage.MOD_ID);

    public static final RegistryObject<Block> MAGNETITE_ORE =
            registerBlock("magnetite_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGNET_BLOCK =
            registerBlock("magnet_block",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(0.25F)));
    public static final RegistryObject<Block> COLOURED_MAGNET_BLOCK =
            registerBlock("coloured_magnet_block",
                    () ->new ColouredMagnetBlock(BlockBehaviour.Properties.of()
                            .strength(0.25F)));
    public static final RegistryObject<Block> ALUMINIUM_ORE =
            registerBlock("aluminium_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SULPHUR_ORE =
            registerBlock("sulphur_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE =
            registerBlock("deepslate_aluminium_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SULPHUR_ORE =
            registerBlock("deepslate_sulphur_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_MAGNETITE_ORE =
            registerBlock("deepslate_magnetite_ore",
                    () ->new Block(BlockBehaviour.Properties.of()
                            .strength(4.5F,3.0F)
                    .requiresCorrectToolForDrops()));

            
    private static <T extends Block> void registerBlockItems(String name, RegistryObject<T> block) {
        Moditems.ITEMS.register(name,() -> new BlockItem(
                block.get(),
                new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> blocks = BLOCKS.register(name,block);
        registerBlockItems(name,blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
