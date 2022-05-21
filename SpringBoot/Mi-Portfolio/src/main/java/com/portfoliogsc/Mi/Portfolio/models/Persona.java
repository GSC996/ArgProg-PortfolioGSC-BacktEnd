package com.portfoliogsc.Mi.Portfolio.models;

import java.io.Serializable;
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
    private String fecha_nacimiento;

    @NotNull
    private String email;

    @NotNull
    private String telefono;

    @NotNull
    private String sobre_mi;

    private String foto_perfil;

    private String foto_portada;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List <Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List <Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List <Skills> skillsList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List <Proyectos> proyectosList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String fecha_nacimiento, String email, String telefono, String sobre_mi, String foto_perfil, String foto_portada) {
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
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public String getFoto_portada() {
        return foto_portada;
    }

    public void setFoto_portada(String foto_portada) {
        this.foto_portada = foto_portada;
    }

    public List<Educacion> getEducacionList() {
        return educacionList;
    }

    public void setEducacionList(List<Educacion> educacionList) {
        this.educacionList = educacionList;
    }

    public List<Experiencia> getExperienciaList() {
        return experienciaList;
    }

    public void setExperienciaList(List<Experiencia> experienciaList) {
        this.experienciaList = experienciaList;
    }
    
    
}
