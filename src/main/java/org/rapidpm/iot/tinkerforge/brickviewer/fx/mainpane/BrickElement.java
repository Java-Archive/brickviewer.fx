package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Sven Ruppert on 05.08.2014.
 */
public class BrickElement {

  private StringProperty server = new SimpleStringProperty("");
  private StringProperty port = new SimpleStringProperty("");
  private StringProperty masterUID = new SimpleStringProperty("");
  private StringProperty brickUID = new SimpleStringProperty("");
  private StringProperty brickType= new SimpleStringProperty("");
  private BooleanProperty showDiagram = new SimpleBooleanProperty(false);


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BrickElement{");
    sb.append("server=").append(server);
    sb.append(", port=").append(port);
    sb.append(", masterUID=").append(masterUID);
    sb.append(", brickUID=").append(brickUID);
    sb.append(", brickType=").append(brickType);
    sb.append(", showDiagram=").append(showDiagram);
    sb.append('}');
    return sb.toString();
  }

  public String getServer() {
    return server.get();
  }

  public StringProperty serverProperty() {
    return server;
  }

  public void setServer(String server) {
    this.server.set(server);
  }

  public String getPort() {
    return port.get();
  }

  public StringProperty portProperty() {
    return port;
  }

  public void setPort(String port) {
    this.port.set(port);
  }

  public String getMasterUID() {
    return masterUID.get();
  }

  public StringProperty masterUIDProperty() {
    return masterUID;
  }

  public void setMasterUID(String masterUID) {
    this.masterUID.set(masterUID);
  }

  public String getBrickUID() {
    return brickUID.get();
  }

  public StringProperty brickUIDProperty() {
    return brickUID;
  }

  public void setBrickUID(String brickUID) {
    this.brickUID.set(brickUID);
  }

  public String getBrickType() {
    return brickType.get();
  }

  public StringProperty brickTypeProperty() {
    return brickType;
  }

  public void setBrickType(String brickType) {
    this.brickType.set(brickType);
  }

  public boolean getShowDiagram() {
    return showDiagram.get();
  }

  public BooleanProperty showDiagramProperty() {
    return showDiagram;
  }

  public void setShowDiagram(boolean showDiagram) {
    this.showDiagram.set(showDiagram);
  }
}
