package com.example.demo.api.aluno.service;

import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class EditarService implements Function<AlunoInputDTO, AlunoOutputDTO> {


    @Override
    public AlunoOutputDTO apply(AlunoInputDTO alunoInputDTO) {
        return null;
    }
}
