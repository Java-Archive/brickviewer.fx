package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.closeconnection;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.DataSourceElement;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
public class CloseConnectionButtonCellFactory implements Callback<TableColumn<DataSourceElement, ?>, TableCell<DataSourceElement, ?>> {




  @Inject Instance<CloseConnectionButtonCell> buttonCellInstance;

  @Override
  public TableCell<DataSourceElement, ?> call(TableColumn<DataSourceElement, ?> param) {
    return buttonCellInstance.get();
  }
}
