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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;

    @NotNull
    private String institucion;

    @NotNull
    private String titulo;

    private String fecha_inicio;
    private String fecha_fin;

    private String imgen_logoInst;

    public Educacion() {
    }

    public Educacion(Long idEdu, String institucion, String titulo, String fecha_inicio, String fecha_fin, String imgen_logoInst) {
        this.idEdu = idEdu;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.imgen_logoInst = imgen_logoInst;
    }
    
}