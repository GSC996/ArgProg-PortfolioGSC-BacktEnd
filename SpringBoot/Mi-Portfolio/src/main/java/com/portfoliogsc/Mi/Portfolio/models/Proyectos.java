package com.portfoliogsc.Mi.Portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;

    @NotNull
    private String nombre;

    @NotNull
    private String descripcion;

    private String fecha_realizacion;

    private String url_proyecto;

    private String img_proyecto;

}
