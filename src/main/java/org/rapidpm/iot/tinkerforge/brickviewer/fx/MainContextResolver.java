package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import org.rapidpm.commons.cdi.contextresolver.ContextResolver;

import javax.enterprise.util.AnnotationLiteral;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainContextResolver implements ContextResolver {
  @Override
  public AnnotationLiteral resolveContext(Class<?> aClass) {
    return new AnnotationLiteral<BrickViewerFX>(){};
  }
}
