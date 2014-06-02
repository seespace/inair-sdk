package tv.inair.layeredtemplate.modelview;

import android.graphics.Color;

import inair.collection.ObservableCollection;
import inair.data.ViewModel;
import tv.inair.layeredtemplate.R;

/**
 * Implementation of view model
 * Should be used to declare all properties which are using to bind in layout
 * Logic code to manipulate data must be declare here
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class MainViewModel extends ViewModel {

  public static int[] IMAGE_RESOURCES = new int[]{ R.drawable.f1, R.drawable.facebook, R.drawable.ic_launcher, R.drawable.jaguar, R.drawable.keywords, R.drawable.redbull };

  public static int[] COLORS = new int[]{ Color.BLUE, Color.CYAN, Color.GRAY, Color.YELLOW, Color.RED, Color.GREEN };

  static CharSequence[] titles = new CharSequence[] { "RACE", "FACEBOOK", "ICON", "JAGUAR", "KEYWORDS", "REDBULL" };

  public ObservableCollection<LayeredItemViewModel> layeredItemViewModels = new ObservableCollection<>();

  public MainViewModel() {
    for (int i = 0; i < titles.length; i++) {
      layeredItemViewModels.add(new LayeredItemViewModel(titles[i], IMAGE_RESOURCES[i], COLORS[i]));
    }
  }
}
