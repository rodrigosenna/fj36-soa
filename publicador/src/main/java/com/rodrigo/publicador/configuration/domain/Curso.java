package com.rodrigo.publicador.configuration.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Curso {

    private String     nome;
    private String    categoria;
    private Integer   cargaHoraria;
}
