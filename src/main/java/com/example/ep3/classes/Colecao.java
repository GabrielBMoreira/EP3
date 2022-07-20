package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
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
}
