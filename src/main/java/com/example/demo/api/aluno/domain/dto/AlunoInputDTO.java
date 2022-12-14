package com.example.demo.api.aluno.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AlunoInputDTO {

    @NotNull(message = "Nome é obrigatório")
    private String nome;
    @NotNull(message = "Id da tarma é obrigatório")
    private Long turmaId;

}
