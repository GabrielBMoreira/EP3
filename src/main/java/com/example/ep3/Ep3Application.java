package com.example.ep3;

import com.example.ep3.GUI.graficos.CompradosGrafico;
import com.example.ep3.classes.Emprestados;
import com.example.ep3.classes.Permanentes;
import com.example.ep3.interfaces.PermanentesFields;
import com.example.ep3.services.ArtistService;
import com.example.ep3.services.EmprestadosService;
import com.example.ep3.services.ObjetosArtService;
import com.example.ep3.services.PermanentesService;
import org.jfree.ui.RefineryUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ep3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ep3Application.class, args);
//        ArtistService teste = new ArtistService();
//        ObjetosArtService testeObj = new ObjetosArtService();
//        teste.test();
//        testeObj.listByTypeAndClass();
//        EmprestadosService testeEmp = new EmprestadosService();
//        testeEmp.listByMonthYearCount();
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.ep3");
        appContext.refresh();
        PermanentesService customerService = (PermanentesService) appContext.getBean("permanentesService");


        Iterable<Permanentes> permanentes = customerService.listByMonthYear();

        CompradosGrafico chart = new CompradosGrafico(
                "School Vs Years" ,
                "Numer of Schools vs years", permanentes);
        System.out.println(" _______________________________________________________________________________________________________________" +chart);
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        appContext.close();
    }

}
