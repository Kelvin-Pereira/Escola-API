package com.example.demo.api.aluno.controller;

import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.service.SalvarAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final SalvarAlunoService salvarAlunoService;


    @PostMapping
    public AlunoOutputDTO savar(@RequestBody @Validated AlunoInputDTO alunoInputDTO) {
        return salvarAlunoService.apply(alunoInputDTO);
    }

}
