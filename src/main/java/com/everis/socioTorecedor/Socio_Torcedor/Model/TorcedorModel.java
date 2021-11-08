package com.everis.socioTorecedor.Socio_Torcedor.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "torcedor")
public class TorcedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column (unique = true)
    private String nome;

    @CPF
    @Column (unique = true)
    @Min(value = 11, message = "Este campo deve ter 11 digitos")
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate aniversario;

    @Column (unique = true)
    @Email
    private String email;

    @Enumerated (EnumType.ORDINAL)
    private TimeEnum timeFavorito;

}
