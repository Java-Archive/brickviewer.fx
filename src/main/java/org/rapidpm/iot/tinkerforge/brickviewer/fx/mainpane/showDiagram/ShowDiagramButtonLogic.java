package org.rapidpm.iot.tinkerforge.brickviewer.fx.mainpane.showdiagram;

import javafx.application.Platform;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import org.rapidpm.commons.cdi.messagebus.CDIMessageBus;
import org.rapidpm.commons.cdi.messagebus.MessageBus;
import org.rapidpm.commons.javafx.chart.DateAxis;
import org.rapidpm.module.iot.tinkerforge.data.SensorDataElement;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by Sven Ruppert on 06.08.2014.
 */
public class ShowDiagramButtonLogic {

  @Inject @CDIMessageBus MessageBus messageBus;

  public LineChart createLineChartFor(final String chartNodeID) {
    final DateAxis dateAxis = new DateAxis();
    dateAxis.setLabel("Time");
    final NumberAxis yAxis = new NumberAxis();

    final LineChart<Date, Number> lineChart = new LineChart<>(dateAxis, yAxis);
    lineChart.setTitle(chartNodeID);
    lineChart.setId(chartNodeID);
    final XYChart.Series<Date, Number> seriesData = new XYChart.Series<>();
    double correctedSensorValue = 25 / 100.0;
    final XYChart.Data data = new XYChart.Data(new Date(), correctedSensorValue);
    seriesData.getData().add(data);
    lineChart.getData().add(seriesData);

    //Event rgistrieren um Daten zu erhalten
    messageBus.<SensorDataElement>registerCallBack(chartNodeID + "DataCallBack", m -> {
      Runnable runnable = () -> {
        final double sensorValue = m.getValue().getSensorValue();
        final LocalDateTime ldt = m.getValue().getDate();

//        Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());

        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
        Date output = Date.from(zdt.toInstant());

        final XYChart.Data newData = new XYChart.Data(output, sensorValue);
        seriesData.getData().add(newData);
      };
      Platform.runLater(runnable);
    });

    return lineChart;
  }



}
