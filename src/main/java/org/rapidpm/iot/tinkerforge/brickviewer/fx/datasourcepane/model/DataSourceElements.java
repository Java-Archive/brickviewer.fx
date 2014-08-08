package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.model;

import javax.inject.Singleton;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
@Singleton
public class DataSourceElements {

  public Set<DataSourceElementIPConnection> ipConnectionSet = new HashSet<>();
  public Set<DataSourceElementMQTT> mqttSet = new HashSet<>();

}
