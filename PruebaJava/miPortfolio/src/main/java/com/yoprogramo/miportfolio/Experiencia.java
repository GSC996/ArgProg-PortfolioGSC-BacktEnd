
package com.yoprogramo.miportfolio;

public class Experiencia {
    
    private String cargo;
    private String empresa;
    private String logoEmpresa;
    private String descripcion;
    private String incio;
    private String fin;

    public Experiencia(String cargo, String empresa, String logoEmpresa, String descripcion, String incio, String fin) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.logoEmpresa = logoEmpresa;
        this.descripcion = descripcion;
        this.incio = incio;
        this.fin = fin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(String logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIncio() {
        return incio;
    }

    public void setIncio(String incio) {
        this.incio = incio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
    
}
