package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Objects;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
public class DataSourceElementIPConnection {

  private StringProperty server = new SimpleStringProperty("");
  private StringProperty port = new SimpleStringProperty("");
  private StringProperty masterUID = new SimpleStringProperty(""); // nur der HptMasterBrick

  private BooleanProperty autoConnection = new SimpleBooleanProperty(false);

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DataSourceElementIPConnection{");
    sb.append("server=").append(server);
    sb.append(", port=").append(port);
    sb.append(", masterUID=").append(masterUID);
    sb.append(", autoConnection=").append(autoConnection);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(server, port, masterUID, autoConnection);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final DataSourceElementIPConnection other = (DataSourceElementIPConnection) obj;
    return Objects.equals(this.server, other.server) && Objects.equals(this.port, other.port) && Objects.equals(this.masterUID, other.masterUID) && Objects.equals(this.autoConnection, other.autoConnection);
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

  public boolean getAutoConnection() {
    return autoConnection.get();
  }

  public BooleanProperty autoConnectionProperty() {
    return autoConnection;
  }

  public void setAutoConnection(boolean autoConnection) {
    this.autoConnection.set(autoConnection);
  }
}
