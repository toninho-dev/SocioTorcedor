package com.everis.socioTorecedor.Socio_Torcedor.Controller.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampanhaResponse {

    private Integer id;
    private String nome;
    @JsonFormat (pattern = "dd/MM/yyyy")
    private String dataVigenciainicio;
    @JsonFormat (pattern = "dd/MM/yyyy")
    private String dataVigenciaFim;
}
