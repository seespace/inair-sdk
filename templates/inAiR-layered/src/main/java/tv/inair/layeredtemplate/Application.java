package tv.inair.layeredtemplate;

import inair.app.InAiRApplication;
import tv.inair.layeredtemplate.modelview.ChildViewModel;
import tv.inair.layeredtemplate.modelview.MainViewModel;

/**
 * Application class of inAiR
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class Application extends InAiRApplication {
  /**
   * View model of main layout
   *
   * Should be singleton and create on Application instance
   */
  public static MainViewModel mainViewModel;
  /**
   * View model of main layout
   *
   * Should be singleton and create on Application instance
   */
  public static ChildViewModel childViewModel;

  @Override
  protected void onInitialize(InAiRApplication application) {
    super.onInitialize(application);
    mainViewModel = new MainViewModel();
    childViewModel = new ChildViewModel();
  }
}
