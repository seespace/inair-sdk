package tv.inair.layeredtemplate;

import android.os.Bundle;

import inair.app.IABaseLayeredItem;

/**
 * Controller for layer layout
 *
 * <p>Created by Linh Nguyen</p>
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class LayerLayout extends IABaseLayeredItem {

  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setRootContentView(R.layout.layer_layout);
  }
}
