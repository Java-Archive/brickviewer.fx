package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.showdiagram;

import javafx.scene.chart.LineChart;
import javafx.scene.layout.VBox;
import org.rapidpm.commons.cdi.fx.components.tableview.cell.CDIButtonCell;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.BrickElement;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.KeyMapper;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 06.08.2014.
 */
public class ShowDiagramButtonCell extends CDIButtonCell<BrickElement> {

  private @Inject @CDILogger Logger logger;
  private @Inject KeyMapper mapper;
  private @Inject ShowDiagramButtonLogic logic;

  public ShowDiagramButtonCell() { }

  @Override
  public String getButtonLabelText() {
    return mapper.map("showDiagramInActive");
  }

  @PostConstruct
  public void init() {
    super.init();
    if (logger.isDebugEnabled()) {
      logger.debug("ShowDiagramButtonCell->init");
    }

    addCellAction(action -> {
      action.setShowDiagram(!action.getShowDiagram());
      System.out.println("workOnRowItem = " + action);

    });

    addCellAction(action -> {
      if (action.getShowDiagram()) {
        cellButton.setText(mapper.map("showDiagramActive"));
      } else {
        cellButton.setText(mapper.map("showDiagramInActive"));
      }
    });

    addCellAction(action -> {
      final String chartNodeID = action.getBrickType() + " - " + action.getMasterUID() + "/" + action.getBrickUID();

      if (action.getShowDiagram()) {
        final LineChart lineChart = logic.createLineChartFor(chartNodeID);
        final VBox diagramVBox = (VBox) cellButton.getScene().lookup("#diagramVBox");
        diagramVBox.getChildren().add(lineChart);

      } else {
        final VBox diagramVBox = (VBox) cellButton.getScene().lookup("#diagramVBox");
        diagramVBox.getChildren().removeIf(p -> p.getId().equals(chartNodeID));
      }
    });
  }
}
