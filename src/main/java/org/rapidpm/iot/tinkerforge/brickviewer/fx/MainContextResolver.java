package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainContextResolver implements ContextResolver {

  @Inject @CDILogger Logger logger;

  @Override
  public AnnotationLiteral resolveContext(Class<?> aClass) {
    if(aClass.getPackage().getName().contains("org.rapidpm.iot.tinkerforge.brickviewer.fx")){
      return new AnnotationLiteral<BrickViewerFX>(){};
    } else {
      return null;
    }
  }
}
