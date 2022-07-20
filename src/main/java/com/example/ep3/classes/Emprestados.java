package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Emprestados extends ObjetosArte {

    // Table columns
    private Date dataDevolucao;
    private Date dataEmprestimo;

    @ManyToOne
    @JoinColumn(name = "NOME_COLECAO")
    private Colecao colecao;
}
