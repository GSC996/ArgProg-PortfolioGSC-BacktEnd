
package com.yoprogramo.miportfolio;

public class Persona {
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimento;
    private String email;
    private String telefono;
    private String sobreMi;
    private String ocupacionActual;
    private String nacionalidad;
    private String imagenPerfil;
    private String imagenPortada;
    
    //constructor

    public Persona(int id, String nombre, String apellido, String fechaNacimento, String email, String telefono, String sobreMi, String ocupacionActual, String nacionalidad, String imagenPerfil, String imagenPortada) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimento = fechaNacimento;
        this.email = email;
        this.telefono = telefono;
        this.sobreMi = sobreMi;
        this.ocupacionActual = ocupacionActual;
        this.nacionalidad = nacionalidad;
        this.imagenPerfil = imagenPerfil;
        this.imagenPortada = imagenPortada;
    }
    
    
    //metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFechaNacimento() {
        return fechaNacimento;
    }

    public void setFechaNacimento(String fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getOcupacionActual() {
        return ocupacionActual;
    }

    public void setOcupacionActual(String ocupacionActual) {
        this.ocupacionActual = ocupacionActual;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimento=" + fechaNacimento + ", email=" + email + ", telefono=" + telefono + ", sobreMi=" + sobreMi + ", ocupacionActual=" + ocupacionActual + ", nacionalidad=" + nacionalidad + ", imagenPerfil=" + imagenPerfil + ", imagenPortada=" + imagenPortada + '}';
    }
    
    
}
