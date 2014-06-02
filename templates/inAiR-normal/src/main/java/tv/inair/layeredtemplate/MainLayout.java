package tv.inair.layeredtemplate;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;

import java.util.Random;

import inair.app.IABaseLayout;
import inair.view.UIAnimation;
import inair.view.UIImageView;
import tv.inair.apptemplate.R;

/**
 * Main layout of application
 * Should be used to handle all controller events on it's content view
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class MainLayout extends IABaseLayout {

  UIImageView staticImageView;

  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setAndBindRootContentView(R.layout.main_layout, Application.modelView);

    staticImageView = ((UIImageView) findUIViewById(R.id.staticImageView));
  }

  @Override
  public void processDebugKeyPress(int id) {
    Random r = new Random();
    float alpha = r.nextInt(256) / 256.0f;
    switch (id) {
      case inair.sdk.R.id.upBtn:
        // Transform animation ~ rotate
        float[] rotTransform = UIAnimation.identityMatrix();
        Matrix.rotateM(rotTransform, 0, r.nextInt(360), 1.0f, 1.0f, 1.0f);
        Animator rotAnim = UIAnimation.createTransformAnimation(staticImageView, rotTransform, 1000);
        rotAnim.start();
        Application.modelView.setDescText("Transform animation example");
        break;
      case inair.sdk.R.id.downBtn:
        // Alpha animation
        Animator alphaAnim = UIAnimation.createAlphaAnimation(staticImageView, alpha, 1000);
        alphaAnim.start();
        Application.modelView.setDescText("Alpha animation example");
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
        Application.modelView.setDescText("Chain animation example");
        break;

      case inair.sdk.R.id.rightBtn:
        // Callback
        Animator anim = UIAnimation.createAlphaAnimation(staticImageView, alpha, 1000);

        anim.addListener(new Animator.AnimatorListener() {
          @Override
          public void onAnimationStart(Animator animation) {
            Application.modelView.setDescText("Callback: Animation Start");
          }

          @Override
          public void onAnimationEnd(Animator animation) {
            Application.modelView.setDescText("Callback: Animation End");
          }

          @Override
          public void onAnimationCancel(Animator animation) {
            Application.modelView.setDescText("Callback: Animation Cancel");
          }

          @Override
          public void onAnimationRepeat(Animator animation) {
          }
        });

        anim.start();
        break;

      default:
        Application.modelView.randomValue();
    }
  }
}
