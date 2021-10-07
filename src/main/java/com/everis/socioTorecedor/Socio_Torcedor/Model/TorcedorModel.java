package com.everis.socioTorecedor.Socio_Torcedor.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "torcedor")
public class TorcedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column
    String nome;
    @Column
    String aniversario;
    @Column
    String email;
    @Column
    @Enumerated
    TimeEnum timeFavorito;

}
