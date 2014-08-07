package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.commons.javafx.tableview.control.ColumnWidthOptimizer;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.BrickviewerBaseController;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainPaneController extends BrickviewerBaseController {

  @Inject @CDILogger Logger logger;
  @Inject KeyMapper mapper;

  @FXML public PasswordField passwordField;
  @FXML public Button btn;

  @FXML public MenuBar menubar;
  @FXML public BorderPane borderPaneMain;

  @FXML public TableView<BrickElement> brickTable;
  @FXML public VBox diagramVBox;

  @Override
  public void initBusinessLogic() {
    menubar.prefWidthProperty().bind(menubar.getScene().getWindow().widthProperty());
    borderPaneMain.prefWidthProperty().bind(borderPaneMain.getScene().getWindow().widthProperty());
    borderPaneMain.prefHeightProperty().bind(borderPaneMain.getScene().getWindow().heightProperty());


    brickTable.setEditable(true);
    brickTable.getColumns()
        .forEach(c -> {
          final String text = c.getText();

//          if ("tcShowDiagram".equals(text)) {
//            ((TableColumn<BrickElement, Boolean>) c).setCellFactory(param -> new CheckBoxTableCell<BrickElement, Boolean>() {
//              @Override
//              public void updateItem(Boolean item, boolean empty) {
//                super.updateItem(item, empty);
//                System.out.println("item = " + item);
//                //true -> anzeigen false -> ausblenden
//
//                if (item!= null && item) {
//                  final DateAxis dateAxis = new DateAxis();
//                  dateAxis.setLabel("Time");
//                  final NumberAxis yAxis = new NumberAxis();
//
//                  final LineChart<Date, Number> lineChart = new LineChart<>(dateAxis, yAxis);
//                  lineChart.setTitle("SensorNAme");
//                  final XYChart.Series<Date, Number> seriesData = new XYChart.Series<>();
//                  double correctedSensorValue = 25 / 100.0;
//                  final XYChart.Data data = new XYChart.Data(new Date(), correctedSensorValue);
//                  seriesData.getData().add(data);
//                  lineChart.getData().add(seriesData);
//                diagramVBox.getChildren().add(lineChart);
//                }
//              }
//            });
//          } else {
//            //alle anderen
//          }
          c.setText(mapper.map(text));
        });
    brickTable.prefHeightProperty().bind(borderPaneMain.prefHeightProperty());

    ColumnWidthOptimizer optimizer = new ColumnWidthOptimizer();
    optimizer.optimize(brickTable);

  }


  public void mbtnClose(ActionEvent actionEvent) {
    System.exit(0);
  }


  public void handleSubmitButtonAction(ActionEvent actionEvent) {
    System.out.println("actionEvent = " + actionEvent);
  }


}
