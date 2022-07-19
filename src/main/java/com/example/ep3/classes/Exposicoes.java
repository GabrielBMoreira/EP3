package com.example.ep3.classes;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Exposicoes {
    @Id
    @Column(name = "EXPO_ID")
    private String exposicaoId;

    private Date dataInicio;
    private Date dataFinal;

    // Constructor
    public Exposicoes() {
    }

    public String getExposicaoId() {
        return exposicaoId;
    }

    public void setExposicaoId(String exposicaoId) {
        this.exposicaoId = exposicaoId;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
