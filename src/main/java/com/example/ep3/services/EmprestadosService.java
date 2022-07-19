package com.example.ep3.services;

import com.example.ep3.classes.Emprestados;
import com.example.ep3.interfaces.EmprestadosRepository;
import com.example.ep3.interfaces.NameAndCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("emprestadosService")
public class EmprestadosService {

    @Autowired
    private EmprestadosRepository repository;

    @PostConstruct
    public void listByMonthYearCount(){

        List<NameAndCount> list = repository.aGetCountByColectionAndDate();
        list.forEach(emprestimo -> System.out.println("Emprestimo " + emprestimo.getnomeColecao() + " " + emprestimo.getdate() + " " + emprestimo.getcontagem()));

    }

}
