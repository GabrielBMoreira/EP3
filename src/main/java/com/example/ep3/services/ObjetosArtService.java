package com.example.ep3.services;


import com.example.ep3.classes.ObjetosArte;
import com.example.ep3.interfaces.ObjetosArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("artObjectsService")
public class ObjetosArtService {

    @Autowired
    private ObjetosArtRepository repository;


    @PostConstruct
    public List<ObjetosArte> listByTypeAndClass(){

        return repository.findAll(Sort.by("tipoObjart").and(Sort.by("CatObjArt")));

    }

}
