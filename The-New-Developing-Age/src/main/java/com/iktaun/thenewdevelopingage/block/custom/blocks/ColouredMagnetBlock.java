package com.iktaun.thenewdevelopingage.block.custom.blocks;

import com.iktaun.thenewdevelopingage.block.custom.TheNewDevelopingAgeHorizontalFacingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ColouredMagnetBlock extends TheNewDevelopingAgeHorizontalFacingBlock {
    public ColouredMagnetBlock(Properties settings) {
        super(settings);
    }
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}