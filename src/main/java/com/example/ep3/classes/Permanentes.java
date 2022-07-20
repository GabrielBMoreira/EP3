package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Permanentes extends ObjetosArte {

    // Table columns
    private Float custo;
    private Date dataAquisicao;

    // FKs
    @ManyToOne
    @JoinColumn(name = "EM_EXPO", referencedColumnName = "EXPO_ID")
    private Exposicoes exposicao;
}
