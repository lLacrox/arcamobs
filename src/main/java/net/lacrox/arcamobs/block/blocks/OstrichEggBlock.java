package net.lacrox.arcamobs.block.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class OstrichEggBlock extends Block {
    public static final MapCodec<OstrichEggBlock> CODEC = createCodec(OstrichEggBlock::new);
    public static final int FINAL_HATCH_STAGE = 2;
    public static final IntProperty HATCH = Properties.HATCH;
    private static final int HATCHING_TIME = 24000;
    private static final int BOOSTED_HATCHING_TIME = 12000;
    private static final int MAX_RANDOM_CRACK_TIME_OFFSET = 300;
    private static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 8.0, 11.0);

    @Override
    public MapCodec<OstrichEggBlock> getCodec() {
        return CODEC;
    }

    public OstrichEggBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HATCH, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HATCH);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public int getHatchStage(BlockState state) {
        return state.get(HATCH);
    }

    private boolean isReadyToHatch(BlockState state) {
        return this.getHatchStage(state) == 2;
    }

    /*@Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.isReadyToHatch(state)) {
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SNIFFER_EGG_CRACK, SoundCategory.BLOCKS, 0.7F, 0.9F + random.nextFloat() * 0.2F);
            world.setBlockState(pos, state.with(HATCH, this.getHatchStage(state) + 1), Block.NOTIFY_LISTENERS);
        } else {
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SNIFFER_EGG_HATCH, SoundCategory.BLOCKS, 0.7F, 0.9F + random.nextFloat() * 0.2F);
            world.breakBlock(pos, false);
            SnifferEntity snifferEntity = EntityType.SNIFFER.create(world);
            if (snifferEntity != null) {
                Vec3d vec3d = pos.toCenterPos();
                snifferEntity.setBaby(true);
                snifferEntity.refreshPositionAndAngles(vec3d.getX(), vec3d.getY(), vec3d.getZ(), MathHelper.wrapDegrees(world.random.nextFloat() * 360.0F), 0.0F);
                world.spawnEntity(snifferEntity);
            }
        }
    }*/

    @Override
    public boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }

}
