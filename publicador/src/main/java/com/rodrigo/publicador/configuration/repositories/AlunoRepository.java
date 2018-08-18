package com.rodrigo.publicador.configuration.repositories;

import com.rodrigo.publicador.configuration.domain.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, String> {

    
    List<Aluno> findAll(){

    }
}
