package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
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
}
