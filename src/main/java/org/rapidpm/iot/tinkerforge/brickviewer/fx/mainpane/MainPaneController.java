package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import org.rapidpm.commons.cdi.fx.JavaFXBaseController;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Sven Ruppert on 21.07.2014.
 */
public class MainPaneController extends JavaFXBaseController {

  @Inject @CDILogger Logger logger;

  @FXML public PasswordField passwordField;
  @FXML public Button btn;

  @FXML public MenuBar menubar;

  @Override
  public void cleanUp() {

  }

  @Override
  public void setI18n() {

  }


  @Override
  public void cdiPostConstruct() {

  }

  @Override
  protected void initializeFX(URL url, ResourceBundle resourceBundle) {

  }

  @Override
  public void initBusinessLogic() {
    menubar.prefWidthProperty().bind( menubar.getScene().getWindow().widthProperty());

  }


  public  void mbtnClose(ActionEvent actionEvent){
    System.out.println("actionEvent = " + actionEvent);
  }


  public void handleSubmitButtonAction(ActionEvent actionEvent){
    System.out.println("actionEvent = " + actionEvent);
  }


}
