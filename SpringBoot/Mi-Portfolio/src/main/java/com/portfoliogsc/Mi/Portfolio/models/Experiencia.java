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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;

    @NotNull
    private String empresa;

    @NotNull
    private String cargo;
    
    private String descripcion;

    private String fecha_inicio;
    private String fecha_fin;

    private String imgen_logoEmp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String empresa, String cargo, String descripcion, String fecha_inicio, String fecha_fin, String imgen_logoEmp) {
        this.idExp = idExp;
        this.empresa = empresa;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.imgen_logoEmp = imgen_logoEmp;
    }

}
