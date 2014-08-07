package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.showDiagram;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.BrickElement;

/**
 * Created by Sven Ruppert on 06.08.2014.
 */
public class ShowDiagramButtonCellValueFactory
    implements Callback<TableColumn.CellDataFeatures<BrickElement, Boolean>,ObservableValue<Boolean>> {

  @Override
  public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<BrickElement, Boolean> p) {
    final BrickElement value = p.getValue();
    return new SimpleBooleanProperty(value != null);
  }
}
