package net.lacrox.arcamobs.entity.client.desert_rain_frog;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class DesertRainFrogAnimations {
    public static final Animation ANIM_DESERT_RAIN_FROG_IDLE = Animation.Builder.create(2.0F).looping()
            .addBoneAnimation("mouth", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.1F, 0.9F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.05F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
            ))
            .build();

    public static final Animation ANIM_DESERT_RAIN_FROG_WALK = Animation.Builder.create(0.995F).looping()
            .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, -5.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 5.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7463F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, -5.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2902F, AnimationHelper.createScalingVector(1.1F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7877F, AnimationHelper.createScalingVector(1.1F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("mouth", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.3109F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.8085F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createRotationalVector(22.5F, 5.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createRotationalVector(-30.0F, 5.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7463F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7463F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.75F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.995F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, -5.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4975F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7463F, AnimationHelper.createRotationalVector(22.5F, -5.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(-30.0F, -5.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.75F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4975F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7463F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_hind", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.1244F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4975F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7463F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("right_hind", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.75F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4975F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7463F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.995F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC)
            ))
            .addBoneAnimation("left_hind", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.6219F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7463F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.995F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_hind", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.2488F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.4975F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, -0.5F), Transformation.Interpolations.CUBIC),
                    new Keyframe(0.7463F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.75F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.995F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
            ))
            .build();
}
