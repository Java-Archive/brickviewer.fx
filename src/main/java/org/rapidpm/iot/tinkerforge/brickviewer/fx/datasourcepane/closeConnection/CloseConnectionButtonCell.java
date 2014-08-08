package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.closeconnection;

import org.rapidpm.commons.cdi.fx.components.tableview.cell.CDIButtonCell;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.DataSourceElement;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.KeyMapper;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
public class CloseConnectionButtonCell extends CDIButtonCell<DataSourceElement> {

  @Inject KeyMapper mapper;
  @Inject CloseConnectionButtonLogic logic;

  @Override
  public String getButtonLabelText() {
    return mapper.mapDataSourcePane("tcCloseConnection");
  }

  @PostConstruct
  public void init() {



  }

}
