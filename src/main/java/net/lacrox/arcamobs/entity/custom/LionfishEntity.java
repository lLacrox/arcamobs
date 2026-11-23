package net.lacrox.arcamobs.entity.custom;

import net.lacrox.arcamobs.item.ModItems;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;

import net.minecraft.entity.passive.FishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

//Give this sucker Wither instead of Poison >:)

public class LionfishEntity extends FishEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public LionfishEntity(EntityType<? extends FishEntity> entityType, World world) {
        super(entityType, world);
        this.calculateDimensions();
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_COD_FLOP;
    }

    @Override
    public ItemStack getBucketItem() {
        return new ItemStack(ModItems.LIONFISH_IN_A_BUCKET);
    }


}
