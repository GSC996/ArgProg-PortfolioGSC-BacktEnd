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
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    
    @NotNull
    private String nombreSkill;
    
    private String imgenSkill;
    
    private int porcentaje;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String imgenSkill, int porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imgenSkill = imgenSkill;
        this.porcentaje = porcentaje;
    }

}
