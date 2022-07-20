package com.example.ep3.classes;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Pinturas extends ObjetosArte {
    // Table columns
    private String tipoTinta;
    private String suporte;
}
