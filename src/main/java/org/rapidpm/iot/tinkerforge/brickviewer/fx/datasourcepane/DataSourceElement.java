package org.rapidpm.iot.tinkerforge.brickviewer.fx.datasourcepane;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Objects;

/**
 * Created by Sven Ruppert on 08.08.2014.
 */
public class DataSourceElement {

  private StringProperty type = new SimpleStringProperty("");
  private StringProperty masterUID= new SimpleStringProperty("");
  private StringProperty connectionInfo= new SimpleStringProperty("");


  @Override
  public int hashCode() {
    return Objects.hash(type, masterUID, connectionInfo);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final DataSourceElement other = (DataSourceElement) obj;
    return Objects.equals(this.type, other.type) && Objects.equals(this.masterUID, other.masterUID) && Objects.equals(this.connectionInfo, other.connectionInfo);
  }

  public String getType() {
    return type.get();
  }

  public StringProperty typeProperty() {
    return type;
  }

  public void setType(String type) {
    this.type.set(type);
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

  public String getConnectionInfo() {
    return connectionInfo.get();
  }

  public StringProperty connectionInfoProperty() {
    return connectionInfo;
  }

  public void setConnectionInfo(String connectionInfo) {
    this.connectionInfo.set(connectionInfo);
  }
}
