package com.gscportfolio.miportfolio.models;

import java.io.Serializable;
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
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;

    @NotNull
    private String nombreSkill;

    private String imagenSkill;

    private int porcentaje;

    public Skill() {
    }

    public Skill(Long idSkill, String nombreSkill, String imagenSkill, int porcentaje) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imagenSkill = imagenSkill;
        this.porcentaje = porcentaje;
    }

}
