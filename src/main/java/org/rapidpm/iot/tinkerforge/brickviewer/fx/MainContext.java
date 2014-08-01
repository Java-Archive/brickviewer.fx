package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import org.rapidpm.commons.cdi.contextresolver.CDIContext;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 20.07.2014.
 */
public class MainContext implements CDIContext {

  @Inject @CDILogger Logger logger;

  @Override
  public boolean isMockedModusActive() {
    return false;
  }

}
