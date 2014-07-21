package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane;

import org.rapidpm.commons.cdi.fx.components.CDIBaseAnchorPane;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainPane extends CDIBaseAnchorPane<MainPane, MainPaneController> {

  @Override
  public Class<MainPane> getPaneClass() {
    return MainPane.class;
  }
}
