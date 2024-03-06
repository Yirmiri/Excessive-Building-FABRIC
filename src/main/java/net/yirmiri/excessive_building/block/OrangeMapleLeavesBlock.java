package net.yirmiri.excessive_building.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.registry.EBParticlesTypes;

public class OrangeMapleLeavesBlock extends LeavesBlock {
    public OrangeMapleLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtil.spawnParticle(world, pos, random, EBParticlesTypes.ORANGE_MAPLE_PARTICLE);
            }
        }
    }
}
