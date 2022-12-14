package com.example.demo.api.aluno.service;

import com.example.demo.api.aluno.domain.AlunoMapper;
import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;
import com.example.demo.api.aluno.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class SalvarAlunoService implements Function<AlunoInputDTO, AlunoOutputDTO> {

    private final AlunoRepository repository;

    @Override
    public AlunoOutputDTO apply(AlunoInputDTO alunoInputDTO) {
        Aluno aluno = AlunoMapper.INSTANCE.dtoToEntity(alunoInputDTO);
        Aluno alunoSalvo = repository.save(aluno);
        return AlunoMapper.INSTANCE.entityToDto(alunoSalvo);
    }

}
