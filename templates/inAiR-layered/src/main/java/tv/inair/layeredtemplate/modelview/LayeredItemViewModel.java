package tv.inair.layeredtemplate.modelview;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;

import inair.data.ViewModel;

/**
 * Implementation of view model for a single layer on layered navigation
 * Should be used to declare all properties which are using to bind in layout
 * Logic code to manipulate data must be declare here
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class LayeredItemViewModel extends ViewModel {
  //region Title
  private CharSequence title;

  public CharSequence getTitle() {
    return title;
  }

  public void setTitle(CharSequence bitmap) {
    title = bitmap;
    notifyPropertyChanged("title");
  }
  //endregion
  //region Image source
  private BitmapDrawable imageSrc;

  public BitmapDrawable getImageSrc() {
    return imageSrc;
  }

  public void setImageSrc(BitmapDrawable bitmap) {
    imageSrc = bitmap;
    notifyPropertyChanged("imageSrc");
  }
  //endregion

  //region ViewColor
  private int viewColor = Color.CYAN;

  public int getViewColor() {
    return viewColor;
  }

  public void setViewColor(int viewColor) {
    this.viewColor = viewColor;
    notifyPropertyChanged("viewColor");
  }
  //endregion

  public LayeredItemViewModel(CharSequence title, int imageId, int color) {
    super();
    setTitle(title);
    setImageSrc(((BitmapDrawable) resources.getDrawable(imageId)));
    setViewColor(color);
  }
}
