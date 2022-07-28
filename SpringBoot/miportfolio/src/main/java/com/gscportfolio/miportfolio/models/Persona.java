package com.gscportfolio.miportfolio.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String ocupacion;

    @NotNull
    private Date fecha_nacimiento;
    
    @NotNull
    private String locacion;
    
    @NotNull
    private String email;

    @NotNull
    private String telefono;

    @NotNull
    private String sobre_mi;

    private String foto_perfil;

    private String foto_portada;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List<Proyecto> proyectoList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, Date fecha_nacimiento, String email, String telefono, String sobre_mi, String foto_perfil, String foto_portada, List<Educacion> educacionList, List<Experiencia> experienciaList, List<Skill> skillList, List<Proyecto> proyectoList) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.sobre_mi = sobre_mi;
        this.foto_perfil = foto_perfil;
        this.foto_portada = foto_portada;
        this.educacionList = educacionList;
        this.experienciaList = experienciaList;
        this.skillList = skillList;
        this.proyectoList = proyectoList;
    }
}
