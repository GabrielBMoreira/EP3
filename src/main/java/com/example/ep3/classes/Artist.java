package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.Locale;

@Entity
@Data
@NoArgsConstructor
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
}

