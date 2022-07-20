package com.example.ep3.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Exposicoes {
    @Id
    @Column(name = "EXPO_ID")
    private String exposicaoId;

    private Date dataInicio;
    private Date dataFinal;
}
