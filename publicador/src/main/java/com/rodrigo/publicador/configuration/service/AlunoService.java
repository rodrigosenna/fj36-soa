package com.rodrigo.publicador.configuration.service;

import com.rodrigo.publicador.configuration.repositories.AlunoRepository;

public class AlunoService {

    private AlunoRepository repository;

    public Aluno criaAluno(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno atualizaAluno(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno deletaAluno(Aluno aluno){
        return repository.delete(aluno);
    }
}
