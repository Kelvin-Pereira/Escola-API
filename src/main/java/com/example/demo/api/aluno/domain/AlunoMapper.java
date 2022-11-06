package com.example.demo.api.aluno.domain;

import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoMapper {

    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    @Mapping(target = "turmaSigla", source = "turma.sigla")
    AlunoOutputDTO entityToDto(Aluno aluno);

    @Mapping(target = "turma.id", source = "turmaId")
    Aluno dtoToEntity(AlunoInputDTO alunoInputDTO);

    @InheritConfiguration(name = "dtoToEntity")
    void dtoToEntity(AlunoInputDTO alunoInputDTO, @MappingTarget Aluno aluno);

}
