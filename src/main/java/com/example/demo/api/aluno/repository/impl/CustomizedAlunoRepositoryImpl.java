package com.example.demo.api.aluno.repository.impl;

import com.example.demo.api.aluno.domain.dto.AlunoFiltroDTO;
import com.example.demo.api.aluno.domain.entity.Aluno;
import com.example.demo.api.aluno.repository.custom.CustomizedAlunoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomizedAlunoRepositoryImpl implements CustomizedAlunoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Aluno> searchAluno(AlunoFiltroDTO filtroDTO) {
        Map<String, Object> parameters = new HashMap<>();

        String query = "SELECT a FROM Aluno a where upper(a.nome) like :nome";
        parameters.put("nome", "%" + filtroDTO.getNome().toUpperCase() + "%");

        if (filtroDTO.getIdTurma() != null) {
            query += " and a.turma.id = :idTurma";
            parameters.put("idTurma", filtroDTO.getIdTurma());
        }

        TypedQuery<Aluno> searchQuery = entityManager.createQuery(query, Aluno.class);
        parameters.forEach(searchQuery::setParameter);
        return searchQuery.getResultList();
    }

}
