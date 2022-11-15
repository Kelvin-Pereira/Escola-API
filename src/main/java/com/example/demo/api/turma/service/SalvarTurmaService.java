package com.example.demo.api.turma.service;

import com.example.demo.api.turma.domain.TurmaMapper;
import com.example.demo.api.turma.domain.dto.TurmaInputDTO;
import com.example.demo.api.turma.domain.dto.TurmaOutputDTO;
import com.example.demo.api.turma.domain.entity.Turma;
import com.example.demo.api.turma.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class SalvarTurmaService implements Function<TurmaInputDTO, TurmaOutputDTO> {
    private final TurmaRepository repository;

    @Override
    public TurmaOutputDTO apply(TurmaInputDTO turmaInputDTO) {
        Turma turma = TurmaMapper.INSTANCE.dtoToEntity(turmaInputDTO);
        return TurmaMapper.INSTANCE.entityToDto(repository.save(turma));
    }

}
