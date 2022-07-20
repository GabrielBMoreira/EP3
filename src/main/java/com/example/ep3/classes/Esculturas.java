package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@NoArgsConstructor
public class Esculturas extends ObjetosArte {

    // Table columns
    private String material;
    private String altura;
    private String peso;
}
