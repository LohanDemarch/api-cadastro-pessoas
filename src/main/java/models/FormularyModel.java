package models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.Utils;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "REGISTRATION_FORM")
public class FormularyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String sex;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate dataCadastro = LocalDate.now();

    @NotNull
    private String naturalness;

    @NotNull
    private String naturality;

    @NotNull
    private String cpf;

}
