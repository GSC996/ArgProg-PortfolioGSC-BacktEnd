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
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;

    @NotNull
    private String institucion;

    @NotNull
    private String titulo;

    private String fecha_inicio;

    private String fecha_fin;

    private String imagen_logoInst;

    public Educacion() {
    }

    public Educacion(Long idEdu, String institucion, String titulo, String fecha_inicio, String fecha_fin, String imagen_logoInst) {
        this.idEdu = idEdu;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.imagen_logoInst = imagen_logoInst;
    }

}
