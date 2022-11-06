package com.example.demo.api.turma.controller;

import com.example.demo.api.turma.domain.dto.TurmaInputDTO;
import com.example.demo.api.turma.domain.dto.TurmaOutputDTO;
import com.example.demo.api.turma.service.SalvarTurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/turma")
public class TurmaController {

    private final SalvarTurmaService salvarTurmaService;

    @PostMapping
    public ResponseEntity<TurmaOutputDTO> salvar(@RequestBody @Validated TurmaInputDTO turmaInputDTO){
        return ResponseEntity.ok(salvarTurmaService.apply(turmaInputDTO));
    }

}
