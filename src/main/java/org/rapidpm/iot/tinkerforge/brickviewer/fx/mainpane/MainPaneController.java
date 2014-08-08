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
import org.rapidpm.commons.cdi.messagebus.CDIMessageBus;
import org.rapidpm.commons.cdi.messagebus.Message;
import org.rapidpm.commons.cdi.messagebus.MessageBus;
import org.rapidpm.commons.javafx.tableview.control.ColumnWidthOptimizer;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.BrickviewerBaseController;
import org.rapidpm.module.iot.tinkerforge.data.SensorDataElement;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainPaneController extends BrickviewerBaseController {

  @Inject @CDILogger Logger logger;
  @Inject @CDIMessageBus MessageBus messageBus;
  @Inject KeyMapper mapper;
  @Inject ColumnWidthOptimizer optimizer;

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
          c.setText(mapper.map(text));
        });
    brickTable.prefHeightProperty().bind(borderPaneMain.prefHeightProperty());
    brickTable.setMaxWidth(650);
    optimizer.optimize(brickTable);

  }

  public void mbtnClose(ActionEvent actionEvent) {
    System.exit(0);
  }

  private Random random = new Random();

  // TODO zu test zwecken - raus damit..
  public void mbtnDemoData(ActionEvent actionEvent) {
    final Message<SensorDataElement> message = new Message<>();
    final SensorDataElement value = new SensorDataElement();
    value.setDate(LocalDateTime.now());
    value.setSensorValue(random.nextInt());
    message.setValue(value);
    messageBus.post(message);


  }

}
