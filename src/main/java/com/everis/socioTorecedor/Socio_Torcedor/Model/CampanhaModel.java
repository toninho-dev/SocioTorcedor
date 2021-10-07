package com.everis.socioTorecedor.Socio_Torcedor.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity(name = "Campaign")
@AllArgsConstructor
@NoArgsConstructor
public class CampanhaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    @NotBlank
    String nomeCampanha;
    @Column
    Long idTimeCampanha;
    @Column
    @DateTimeFormat
    String dataVigenciainicio;
    @Column
    @DateTimeFormat
    String dataVigenciaFim;

}
