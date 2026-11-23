package net.lacrox.arcamobs.entity.custom;

import net.lacrox.arcamobs.item.ModItems;
import net.lacrox.arcamobs.list.ModEntityTypeTags;
import net.lacrox.arcamobs.list.TagList;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FleeEntityGoal;
import net.minecraft.entity.ai.goal.SwimAroundGoal;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class LionfishEntity extends FishEntity {
    private static final Predicate<LivingEntity> BLOW_UP_FILTER = entity ->
            (!(entity instanceof PlayerEntity player) || !player.isCreative())
                    && !entity.getType().isIn(ModEntityTypeTags.LIONFISH_CHILL);

    static final TargetPredicate BLOW_UP_TARGET_PREDICATE = TargetPredicate.createNonAttackable()
            .ignoreDistanceScalingFactor()
            .ignoreVisibility()
            .setPredicate(BLOW_UP_FILTER);
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
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(1, new SwimToRandomPlaceGoal(this));
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

    @Override
    public void tickMovement() {
        super.tickMovement();
        if (this.isAlive()) {
            for (MobEntity mob : this.getWorld().getEntitiesByClass(
                    MobEntity.class,
                    this.getBoundingBox().expand(0.3),
                    mob -> mob != this && BLOW_UP_TARGET_PREDICATE.test(this, mob))) {
                if (mob.isAlive()) {
                    this.sting(mob);
                }
            }
        }
    }

    private void sting(MobEntity mob) {
        if (mob.damage(this.getDamageSources().mobAttack(this), 1)) {
            mob.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, 0), this);
            this.playSound(SoundEvents.ENTITY_PUFFER_FISH_STING, 1.0F, 1.0F);
        }
    }

    @Override
    public void onPlayerCollision(PlayerEntity player) {
        if (player instanceof ServerPlayerEntity && player.damage(this.getDamageSources().mobAttack(this), 1)) {
            if (!this.isSilent()) {
                ((ServerPlayerEntity)player)
                        .networkHandler
                        .sendPacket(new GameStateChangeS2CPacket(GameStateChangeS2CPacket.PUFFERFISH_STING, GameStateChangeS2CPacket.DEMO_OPEN_SCREEN));
            }

            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, 0), this);
        }
    }

    @Override
    protected boolean hasSelfControl() {
        return true;
    }

    static class SwimToRandomPlaceGoal
            extends SwimAroundGoal {
        private final LionfishEntity lionfish;

        public SwimToRandomPlaceGoal(LionfishEntity lionfish) {
            super(lionfish, 1.0, 40);
            this.lionfish = lionfish;
        }

        @Override
        public boolean canStart() {
            return this.lionfish.hasSelfControl() && super.canStart();
        }
    }
}
