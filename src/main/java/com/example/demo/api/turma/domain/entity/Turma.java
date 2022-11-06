package com.example.demo.api.turma.domain.entity;

import com.example.demo.api.aluno.domain.entity.Aluno;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sigla", nullable = false)
    private String sigla;

    @OneToMany
    @JoinColumn(name = "turmaId")
    private List<Aluno> alunos;

}
