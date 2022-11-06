package com.example.demo.api.aluno.domain;

import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoMapper {

    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    AlunoOutputDTO entityToDto(Aluno aluno);

    Aluno dtoToEntity(AlunoInputDTO alunoInputDTO);

    @InheritConfiguration(name = "dtoToEntity")
    Aluno dtoToEntity(AlunoInputDTO alunoInputDTO, @MappingTarget Aluno aluno);

}
