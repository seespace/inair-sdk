package tv.inair.layeredtemplate;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;

import java.util.Random;

import inair.app.IAChildLayout;
import inair.view.UIAnimation;
import inair.view.UIImageView;

/**
 * Child layout example
 * Should be used to handle all events on it's content view
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class ChildLayout extends IAChildLayout {

  UIImageView staticImageView;

  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setAndBindRootContentView(R.layout.child_layout, Application.childViewModel);

    staticImageView = ((UIImageView) findUIViewById(R.id.staticImageView));
  }

  @Override
  public void processDebugKeyPress(int id) {
    // Right now responder chain does NOT work so we can reach here
    Random r = new Random();
    float alpha = r.nextInt(256) / 256.0f;
    switch (id) {
      case inair.sdk.R.id.upBtn:
        // Transform animation ~ rotate
        float[] rotTransform = UIAnimation.identityMatrix();
        Matrix.rotateM(rotTransform, 0, r.nextInt(360), 1.0f, 1.0f, 1.0f);
        Animator rotAnim = UIAnimation.createTransformAnimation(staticImageView, rotTransform, 1000);
        rotAnim.start();
        Application.childViewModel.setDescText("Transform animation example");
        break;
      case inair.sdk.R.id.downBtn:
        // Alpha animation
        Animator alphaAnim = UIAnimation.createAlphaAnimation(staticImageView, alpha, 1000);
        alphaAnim.start();
        Application.childViewModel.setDescText("Alpha animation example");
        break;

      case inair.sdk.R.id.leftBtn:
        // Scale by x & y axis of model and alpha animation then translate
        AnimatorSet animSet = new AnimatorSet();
        animSet.setDuration(1000);
        animSet.setInterpolator(new AccelerateDecelerateInterpolator());

        float[] scaleTransform = UIAnimation.identityMatrix();
        Matrix.scaleM(scaleTransform, 0, r.nextInt(3), r.nextInt(3), 0);
        Animator scaleAnim = UIAnimation.createTransformAnimation(staticImageView, scaleTransform);

        Animator alAnim = UIAnimation.createAlphaAnimation(staticImageView, alpha);

        float[] translateTransform = UIAnimation.identityMatrix();
        Matrix.translateM(translateTransform, 0, r.nextInt(1920), r.nextInt(1080), r.nextInt(2000) -  1000);
        Animator translateAnim = UIAnimation.createTransformAnimation(staticImageView, translateTransform);

        animSet.play(scaleAnim).with(alAnim).before(translateAnim);

        animSet.start();
        Application.childViewModel.setDescText("Chain animation example");
        break;

      case inair.sdk.R.id.rightBtn:
        // Callback
        Animator anim = UIAnimation.createAlphaAnimation(staticImageView, alpha, 1000);

        anim.addListener(new Animator.AnimatorListener() {
          @Override
          public void onAnimationStart(Animator animation) {
            Application.childViewModel.setDescText("Callback: Animation Start");
          }

          @Override
          public void onAnimationEnd(Animator animation) {
            Application.childViewModel.setDescText("Callback: Animation End");
          }

          @Override
          public void onAnimationCancel(Animator animation) {
            Application.childViewModel.setDescText("Callback: Animation Cancel");
          }

          @Override
          public void onAnimationRepeat(Animator animation) {
          }
        });

        anim.start();
        break;
    }
  }
}
