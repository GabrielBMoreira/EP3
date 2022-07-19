package com.example.ep3.classes;


import javax.persistence.*;

@Entity
public class Pinturas extends ObjetosArte {
    // Table columns
    private String tipoTinta;
    private String suporte;


    // Constructor
    public Pinturas() {
    }


    public String getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }
}
