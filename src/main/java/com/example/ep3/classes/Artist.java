package com.example.ep3.classes;

import javax.persistence.*;

import java.util.Date;
import java.util.Locale;

@Entity
public class Artist {
    @Id
    @Column(name = "ARTIST_ID")
    private String nome;

    // Table columns
    private String descArtista;
    private Date dataMorte;
    private String estiloPrincipal;
    private String periodoArt;
    private Locale paisDeOrigem;

    // Constructor
    public Artist() {
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescArtista() {
        return descArtista;
    }

    public void setDescArtista(String descArtista) {
        this.descArtista = descArtista;
    }

    public Date getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Date dataMorte) {
        this.dataMorte = dataMorte;
    }

    public String getEstiloPrincipal() {
        return estiloPrincipal;
    }

    public void setEstiloPrincipal(String estiloPrincipal) {
        this.estiloPrincipal = estiloPrincipal;
    }

    public String getPeriodoArt() {
        return periodoArt;
    }

    public void setPeriodoArt(String periodoArt) {
        this.periodoArt = periodoArt;
    }

    public Locale getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(Locale paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }
}

