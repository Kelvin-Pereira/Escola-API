package com.example.demo.api.aluno.repository.custom;

import com.example.demo.api.aluno.domain.dto.AlunoFiltroDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;

import java.util.List;

public interface CustomizedAlunoRepository {

    List<Aluno> searchAluno(AlunoFiltroDTO aluno);

}
