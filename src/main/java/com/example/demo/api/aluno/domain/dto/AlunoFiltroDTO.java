package com.example.demo.api.aluno.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class AlunoFiltroDTO {

    @NotNull(message = "Nome é obrigatório")
    @Size(min = 3, message = "mínimo 3 caracteres")
    private String nome;

    private Long idTurma;

}
