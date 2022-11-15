package com.example.demo.api.aluno.controller;

import com.example.demo.api.aluno.domain.dto.AlunoFiltroDTO;
import com.example.demo.api.aluno.domain.dto.AlunoInputDTO;
import com.example.demo.api.aluno.domain.dto.AlunoOutputDTO;
import com.example.demo.api.aluno.service.BuscarAlunoService;
import com.example.demo.api.aluno.service.SalvarAlunoService;
import com.example.demo.api.aluno.service.SearchAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final SalvarAlunoService salvarAlunoService;
    private final BuscarAlunoService buscarAlunoService;
    private final SearchAlunoService searchAlunoService;

    @GetMapping("/{id:[0-9]*}")
    private AlunoOutputDTO buscarPorId(@PathVariable("id") Long id) {
        return buscarAlunoService.apply(id);
    }

    @GetMapping("/search")
    public List<AlunoOutputDTO> searchByNome(@ModelAttribute @Validated AlunoFiltroDTO alunoFiltroDTO) {
        return searchAlunoService.apply(alunoFiltroDTO);
    }

    @PostMapping
    public AlunoOutputDTO savar(@RequestBody @Validated AlunoInputDTO alunoInputDTO) {
        return salvarAlunoService.apply(alunoInputDTO);
    }

}
