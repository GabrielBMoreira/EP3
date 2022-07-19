package com.example.ep3.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Outros extends ObjetosArte {
    // Table columns
    private String tipo;

    // Constructor
    public Outros(){}

    // Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
