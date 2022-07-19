package com.example.ep3.services;

import com.example.ep3.interfaces.PermanentesFields;
import com.example.ep3.interfaces.PermanentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("permanentesService")
public class PermanentesService {

    @Autowired
    private PermanentesRepository repository;

    @PostConstruct
    public List<PermanentesFields> listByMonthYear(){

        return repository.aGetAllByDate();

    }

}
