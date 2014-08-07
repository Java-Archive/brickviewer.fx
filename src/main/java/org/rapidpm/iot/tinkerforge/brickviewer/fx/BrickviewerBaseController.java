package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import org.rapidpm.commons.cdi.fx.JavaFXBaseController;
import org.rapidpm.commons.cdi.registry.property.CDIPropertyRegistryService;
import org.rapidpm.commons.cdi.registry.property.PropertyRegistryService;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Sven Ruppert on 05.08.2014.
 */
public abstract class BrickviewerBaseController extends JavaFXBaseController {

  public @Inject @CDIPropertyRegistryService PropertyRegistryService propertyRegistryService;

  @Override
  public void cleanUp() {

  }

  @Override
  public void setI18n() {

  }

  @Override
  public void cdiPostConstruct() {

  }

  @Override
  protected void initializeFX(URL url, ResourceBundle resourceBundle) {

  }

}
