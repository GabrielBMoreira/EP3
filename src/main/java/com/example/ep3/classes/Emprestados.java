package com.example.ep3.classes;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Emprestados extends ObjetosArte {

    // Table columns
    private Date dataDevolucao;
    private Date dataEmprestimo;

    @ManyToOne
    @JoinColumn(name = "NOME_COLECAO")
    private Colecao colecao;

    // Getters and Setters
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

    // Constructor
    public Emprestados() {
    }


}
