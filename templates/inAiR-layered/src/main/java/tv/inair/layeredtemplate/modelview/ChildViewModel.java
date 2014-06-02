package tv.inair.layeredtemplate.modelview;

import inair.data.ViewModel;

/**
 * Implementation of view model
 * Should be used to declare all properties which are using to bind in layout
 * Logic code to manipulate data must be declare here
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class ChildViewModel extends ViewModel {
  private CharSequence descText = "";

  public CharSequence getDescText() {
    return descText;
  }

  public void setDescText(CharSequence descText) {
    this.descText = descText;
    notifyPropertyChanged("descText");
  }
}
