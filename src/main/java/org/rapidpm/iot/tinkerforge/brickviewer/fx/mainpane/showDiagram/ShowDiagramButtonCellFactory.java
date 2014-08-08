package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.showdiagram;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import org.rapidpm.commons.cdi.se.CDIContainerSingleton;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.BrickElement;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 06.08.2014.
 */
public class ShowDiagramButtonCellFactory
    implements Callback<TableColumn<BrickElement, ?>, TableCell<BrickElement, ?>> {

  public ShowDiagramButtonCellFactory() {
    CDIContainerSingleton.getInstance().activateCDI(this);
  }

  @Inject Instance<ShowDiagramButtonCell> buttonCellInstance;

  @Override
  public TableCell<BrickElement, ?> call(TableColumn<BrickElement, ?> param) {
    return buttonCellInstance.get();
  }
}
