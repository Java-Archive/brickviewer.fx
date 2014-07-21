package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import org.rapidpm.commons.cdi.contextresolver.CDIContext;

/**
 * Created by Sven Ruppert on 20.07.2014.
 */
public class MainContext implements CDIContext {

  @Override
  public boolean isMockedModusActive() {
    return false;
  }

}
