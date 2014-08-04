package org.rapidpm.iot.tinkerforge.brickviewer.fx;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.rapidpm.commons.cdi.fx.CDIJavaFXBaseApplication;
import org.rapidpm.commons.cdi.fx.CDIStartupScene;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.MainPane;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 20.07.2014.
 */
public class Main extends CDIJavaFXBaseApplication {

  public static void main(String[] args) {
    launch(args);
  }


  @Inject @CDILogger Logger logger;

  @Inject MainPane mainPane;


  public void startCDI(@Observes @CDIStartupScene Stage stageCDI){
    stageCDI.setScene(new Scene(mainPane, 2280, 1024));
    stageCDI.show();
  }


  @Override
  public void startImpl(Stage stage) throws Exception {
    // nothing to do before CDI activated
  }
}
