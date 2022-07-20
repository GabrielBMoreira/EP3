package com.example.ep3.GUI.graficos;

import com.example.ep3.classes.Permanentes;
import com.example.ep3.interfaces.PermanentesFields;
import com.example.ep3.services.PermanentesService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompradosGrafico extends ApplicationFrame {

    public CompradosGrafico( String applicationTitle , String chartTitle, Iterable<Permanentes> data ) {
        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "Years","Number of Schools",
                createDataset(data),
                PlotOrientation.VERTICAL,
                true,true,false);

        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    public CompradosGrafico(String title) {
        super(title);
    }

    private DefaultCategoryDataset createDataset( Iterable<Permanentes> data) {
//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//        appContext.scan("com.example.ep3");
//        appContext.refresh();
//
//        PermanentesService customerService = (PermanentesService) appContext.getBean("permanentesService");

//        Iterable<Permanentes> permanentes = customerService.listByMonthYear();
//        System.out.println("+_______________________________________________++++++++_________________________________________++____________________");
//        System.out.println(permanentes);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        data.forEach(permanente -> dataset.addValue(permanente.getCusto(), "Objetos permanentes", permanente.getDataAquisicao()));

//        appContext.close();
        return dataset;
    }

    public static void main( String[ ] args ) {
//        CompradosGrafico chart = new CompradosGrafico(
//                "School Vs Years" ,
//                "Numer of Schools vs years");
//
//        chart.pack( );
//        RefineryUtilities.centerFrameOnScreen( chart );
//        chart.setVisible( true );
    }
}