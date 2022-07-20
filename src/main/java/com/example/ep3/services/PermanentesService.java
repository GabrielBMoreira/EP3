package com.example.ep3.services;

import com.example.ep3.classes.Permanentes;
import com.example.ep3.interfaces.PermanentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("permanentesService")
public class PermanentesService {

    @Autowired
    private PermanentesRepository repository;

    @PostConstruct
    public Iterable<Permanentes> listByMonthYear(){
        Iterable<Permanentes> permanentes = repository.findAll();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        permanentes.forEach(System.out::println);
        return permanentes;

    }

}
