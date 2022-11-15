package com.example.demo.api.aluno.service;

import com.example.demo.api.aluno.domain.AlunoMapper;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;
import com.example.demo.api.aluno.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.LongFunction;

@Service
@RequiredArgsConstructor
public class BuscarAlunoService implements LongFunction<AlunoOutputDTO> {

    private final AlunoRepository repository;

    @Override
    public AlunoOutputDTO apply(long id) {
        Aluno aluno = repository.findById(id).orElseThrow();
        return AlunoMapper.INSTANCE.entityToDto(aluno);
    }

}
