package io.github.xtonousou.soundboardx;

import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

import com.plattysoft.leonids.ParticleSystem;

import java.util.ArrayList;

class Particle {

    private final View view;

    Particle(View view) {
        this.view = view;
    }

    void burstRandomly(ArrayList<Integer> drawables, int particles) {
        Activity act = (Activity) view.getContext();
        for (byte i = 0; i < drawables.size(); i++) {
            new ParticleSystem(act, particles, drawables.get(i), 2500)
                    .setSpeedRange(0.1f, 0.35f)
                    .setFadeOut(750)
                    .setScaleRange(0.9f, 1.3f)
                    .setRotationSpeedRange(0, 200)
                    .oneShot(view, particles, new DecelerateInterpolator());
        }
    }

    void burstScaleRandomly(ArrayList<Integer> drawables, int particles) {
        Activity act = (Activity) view.getContext();
        for (byte i = 0; i < drawables.size(); i++) {
            new ParticleSystem(act, particles, drawables.get(i), 2500)
                    .setSpeedRange(0.1f, 0.3f)
                    .setFadeOut(750)
                    .setScaleRange(1, 2.25f)
                    .oneShot(view, particles, new DecelerateInterpolator());
        }
    }
}
