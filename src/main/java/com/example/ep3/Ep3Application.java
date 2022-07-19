package com.example.ep3;

import com.example.ep3.classes.Emprestados;
import com.example.ep3.interfaces.PermanentesFields;
import com.example.ep3.services.ArtistService;
import com.example.ep3.services.EmprestadosService;
import com.example.ep3.services.ObjetosArtService;
import com.example.ep3.services.PermanentesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        PermanentesService testePerm = new PermanentesService();
        List<PermanentesFields> permanentes = testePerm.listByMonthYear();
    }

}
