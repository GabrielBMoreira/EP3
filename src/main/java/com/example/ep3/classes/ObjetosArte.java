package com.example.ep3.classes;

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ObjetosArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer objetosarteId;

    // Table columns
    private String titulo;
    private String descricao;
    private Date anoCriacao;
    private String periodoObj;
    private Locale paisCulutura;
    private String estilo;
    private String tipoObjart;
    private String catObjArt;


    // FKs
    @ManyToOne
    @JoinColumn(name = "ARTIST_ID")
    private Artist nomeArt;

    @ManyToMany
    @JoinTable(name = "EXPO_EM")
    private Set<Exposicoes> exposicoes;

    public Set<Exposicoes> getExposicoes() {
        return exposicoes;
    }

    public void setExposicoes(Set<Exposicoes> exposicoes) {
        this.exposicoes = exposicoes;
    }

    protected ObjetosArte() {
    }

    public Integer getObjetosarteId() {
        return objetosarteId;
    }

    public void setObjetosarteId(Integer objetosarteId) {
        this.objetosarteId = objetosarteId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Date anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getPeriodoObj() {
        return periodoObj;
    }

    public void setPeriodoObj(String periodoObj) {
        this.periodoObj = periodoObj;
    }

    public Locale getPaisCulutura() {
        return paisCulutura;
    }

    public void setPaisCulutura(Locale paisCulutura) {
        this.paisCulutura = paisCulutura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoObjart() {
        return tipoObjart;
    }

    public void setTipoObjart(String tipoObjart) {
        this.tipoObjart = tipoObjart;
    }

    public String getCatObjArt() {
        return catObjArt;
    }

    public void setCatObjArt(String catObjArt) {
        this.catObjArt = catObjArt;
    }

    public Artist getNomeArt() {
        return nomeArt;
    }

    public void setNomeArt(Artist nomeArt) {
        this.nomeArt = nomeArt;
    }
}
