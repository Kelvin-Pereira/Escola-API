package com.example.demo.api.aluno.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Aluno {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

}
