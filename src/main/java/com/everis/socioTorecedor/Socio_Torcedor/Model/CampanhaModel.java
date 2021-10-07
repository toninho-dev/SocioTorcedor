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
    private Integer id;
    @Column
    @NotBlank
    private String nomeCampanha;
    @Column
    private Integer idTimeCampanha;
    @Column
    @DateTimeFormat
    private String dataVigenciainicio;
    @Column
    @DateTimeFormat
    private String dataVigenciaFim;

}
