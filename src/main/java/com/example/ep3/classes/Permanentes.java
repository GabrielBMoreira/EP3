package com.example.ep3.classes;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Permanentes extends ObjetosArte {

    // Table columns
    private Float custo;
    private Date dataAquisicao;

    // FKs
    @ManyToOne
    @JoinColumn(name = "EM_EXPO", referencedColumnName = "EXPO_ID")
    private Exposicoes exposicao;

    // Constructor
    public Permanentes() {
    }

    // Getters and Setters
    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Exposicoes getExposicao() {
        return exposicao;
    }

    public void setExposicao(Exposicoes exposicao) {
        this.exposicao = exposicao;
    }
}
