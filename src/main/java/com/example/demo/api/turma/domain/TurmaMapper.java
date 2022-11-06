package com.example.demo.api.turma.domain;

import com.example.demo.api.turma.domain.dto.TurmaInputDTO;
import com.example.demo.api.turma.domain.dto.TurmaOutputDTO;
import com.example.demo.api.turma.domain.entity.Turma;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TurmaMapper {

    TurmaMapper INSTANCE = Mappers.getMapper(TurmaMapper.class);

    TurmaOutputDTO entityToDto(Turma turma);

    Turma dtoToEntity(TurmaInputDTO turmaInputDTO);

    @InheritConfiguration(name = "dtoToEntity")
    void dtoToEntity(TurmaInputDTO turmaInputDTO, @MappingTarget Turma turma);


}
