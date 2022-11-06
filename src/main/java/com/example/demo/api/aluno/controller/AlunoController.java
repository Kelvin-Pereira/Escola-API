package com.example.demo.api.aluno.controller;

import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.service.SalvarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final SalvarService salvarService;


    @PostMapping
    public AlunoOutputDTO savar(@RequestBody @Validated AlunoInputDTO alunoInputDTO){
        return salvarService.apply(alunoInputDTO);
    }

}
