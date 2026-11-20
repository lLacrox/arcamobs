package net.lacrox.arcamobs.block.blocks.entity.custom;

import net.lacrox.arcamobs.block.blocks.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class MyceholeBlockEntity extends BlockEntity {
    public MyceholeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MYCEHOLE_BE, pos, state);
    }
}
