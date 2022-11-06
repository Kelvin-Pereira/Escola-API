package com.example.demo.api.aluno.domain.entity;

import com.example.demo.api.turma.domain.entity.Turma;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "turmaId")
    private Turma turma;

}
