package com.example.ep3.interfaces;

import com.example.ep3.classes.ObjetosArte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ObjetosArtRepository extends JpaRepository<ObjetosArte, Integer> {
}
