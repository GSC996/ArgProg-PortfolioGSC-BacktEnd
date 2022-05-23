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
public class Proyecto implements Serializable {

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

    public Proyecto() {
    }

    public Proyecto(Long idProy, String nombre, String descripcion, String fecha_realizacion, String url_proyecto, String img_proyecto) {
        this.idProy = idProy;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_realizacion = fecha_realizacion;
        this.url_proyecto = url_proyecto;
        this.img_proyecto = img_proyecto;
    }

}
