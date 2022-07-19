package com.example.ep3.GUI.graficos;

import com.example.ep3.interfaces.PermanentesFields;
import com.example.ep3.services.PermanentesService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.List;

public class CompradosGrafico extends Application {

    @Override public void start(Stage stage) {
        PermanentesService testePerm = new PermanentesService();
        List<PermanentesFields> permanentes = testePerm.listByMonthYear();

        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        permanentes.forEach(permanente -> series.getData().add(new XYChart.Data(permanente.getdate(), permanente.getcusto())));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
