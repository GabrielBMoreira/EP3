package com.example.ep3.interfaces;

import com.example.ep3.classes.Emprestados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmprestadosRepository extends JpaRepository<Emprestados, Integer> {
    @Query("SELECT colecao.colecaoId as nomeColecao, dataEmprestimo as date, count(Emprestados ) as contagem from Emprestados group by colecao.colecaoId, dataEmprestimo order by count(Emprestados ) desc")
    List<NameAndCount> aGetCountByColectionAndDate();
}
