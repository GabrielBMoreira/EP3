package com.example.ep3.interfaces;

import com.example.ep3.classes.Permanentes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PermanentesRepository extends CrudRepository<Permanentes, Integer> {
    @Query("SELECT p.objetosarteId as id, p.dataAquisicao as date, p.custo as custo FROM Permanentes as p")
    List<PermanentesFields> aGetAllByDate();
}
