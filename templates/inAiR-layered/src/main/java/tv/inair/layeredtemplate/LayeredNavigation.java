package tv.inair.layeredtemplate;

import android.os.Bundle;

import inair.app.IALayeredNavigation;

/**
 * Main layout example
 * An implementation of layered navigation application
 * Should be used to handle all events on it's content view
 *
 * <p>Copyright (c) 2014 SeeSpace.co. All rights reserved.</p>
 */
public class LayeredNavigation extends IALayeredNavigation {
  LayerLayout layerLayout;
  @Override
  public void onInitialize(Bundle savedInstanceState) {
    // Example add one more child layout
    addChildLayout(new ChildLayout());

    // Add all layer we have to navigation
    int size = Application.mainViewModel.layeredItemViewModels.size();
    for (int i = 0; i < size; i++) {
      layerLayout = new LayerLayout();
      layerLayout.setDataContext(Application.mainViewModel.layeredItemViewModels.get(i));
      addLayer(layerLayout);
    }
  }

  @Override
  public void processDebugKeyPress(int id) {
    super.processDebugKeyPress(id);
    // Example change data binding source of first layer
    switch (id) {
      case R.id.leftBtn:
        layerLayout.setDataContext(Application.mainViewModel.layeredItemViewModels.get(1));
        break;
      case R.id.upBtn:
        layerLayout.setDataContext(Application.mainViewModel.layeredItemViewModels.get(2));
        break;
      case R.id.downBtn:
        layerLayout.setDataContext(Application.mainViewModel.layeredItemViewModels.get(3));
        break;
      case R.id.rightBtn:
        layerLayout.setDataContext(Application.mainViewModel.layeredItemViewModels.get(4));
        break;
    }
  }

}
