package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane;

import org.rapidpm.commons.cdi.fx.components.CDIBaseAnchorPane;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
public class DataSourcePane extends CDIBaseAnchorPane<DataSourcePane, DataSourcePaneController> {
  @Override
  public Class<DataSourcePane> getPaneClass() {
    return DataSourcePane.class;
  }



}
