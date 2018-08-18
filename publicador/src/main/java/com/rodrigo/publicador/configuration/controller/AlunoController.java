package com.rodrigo.publicador.configuration.controller;

import com.rodrigo.publicador.configuration.domain.Aluno;
import com.rodrigo.publicador.configuration.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;

public class AlunoController {

    private AlunoService alunoService;

    @GetMapping
    public List<Aluno>
}
