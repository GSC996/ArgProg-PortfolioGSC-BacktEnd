
package com.yoprogramo.miportfolio;

public class Educacion {
    
    private String institucion;
    private String titulo;
    private int promedio;
    private String inicio;
    private String fin;
    private String logo;

    public Educacion(String institucion, String titulo, int promedio, String inicio, String fin, String logo) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.promedio = promedio;
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
