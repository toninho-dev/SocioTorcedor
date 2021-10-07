package com.everis.socioTorecedor.Socio_Torcedor.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "torcedor")
public class TorcedorModel {

    @Column
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
