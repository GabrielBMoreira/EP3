package com.example.ep3.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Colecao {
    @Id
    @Column(name = "COLECAO_ID")
    private String colecaoId;

    // Table columns
    private String descCol;
    private String endereco;
    private String telefone;
    private String pessoaContato;
    private String tipoCol;

    // Constructor
    public Colecao() {
    }


    // Getters and Setters
    public String getColecaoId() {
        return colecaoId;
    }

    public void setColecaoId(String colecaoId) {
        this.colecaoId = colecaoId;
    }

    public String getDescCol() {
        return descCol;
    }

    public void setDescCol(String descCol) {
        this.descCol = descCol;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPessoaContato() {
        return pessoaContato;
    }

    public void setPessoaContato(String pessoaContato) {
        this.pessoaContato = pessoaContato;
    }

    public String getTipoCol() {
        return tipoCol;
    }

    public void setTipoCol(String tipoCol) {
        this.tipoCol = tipoCol;
    }
}
