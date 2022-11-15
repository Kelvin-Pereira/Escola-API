package com.example.demo.api.aluno.service;

import com.example.demo.api.aluno.domain.AlunoMapper;
import com.example.demo.api.aluno.domain.dto.AlunoFiltroDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.repository.custom.CustomizedAlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchAlunoService implements Function<AlunoFiltroDTO, List<AlunoOutputDTO>> {

    private final CustomizedAlunoRepository repository;

    @Override
    public List<AlunoOutputDTO> apply(AlunoFiltroDTO filtro) {
        return repository.searchAluno(filtro).stream().map(AlunoMapper.INSTANCE::entityToDto).collect(Collectors.toList());
    }

}
