package com.api.FormulaOneApplication.Entity;

public class Carrera {

    private String nombreCarrera;

    private String paisUbicacion;

    private String ciudadUbicacion;

    private Integer cantidadVueltas;

    private Integer cantidadKilometros;

    private String sponsorCarrera;

    public Carrera(String nombreCarrera, String paisUbicacion, String ciudadUbicacion, Integer cantidadVueltas, Integer cantidadKilometros, String sponsorCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.paisUbicacion = paisUbicacion;
        this.ciudadUbicacion = ciudadUbicacion;
        this.cantidadVueltas = cantidadVueltas;
        this.cantidadKilometros = cantidadKilometros;
        this.sponsorCarrera = sponsorCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getPaisUbicacion() {
        return paisUbicacion;
    }

    public void setPaisUbicacion(String paisUbicacion) {
        this.paisUbicacion = paisUbicacion;
    }

    public String getCiudadUbicacion() {
        return ciudadUbicacion;
    }

    public void setCiudadUbicacion(String ciudadUbicacion) {
        this.ciudadUbicacion = ciudadUbicacion;
    }

    public Integer getCantidadVueltas() {
        return cantidadVueltas;
    }

    public void setCantidadVueltas(Integer cantidadVueltas) {
        this.cantidadVueltas = cantidadVueltas;
    }

    public Integer getCantidadKilometros() {
        return cantidadKilometros;
    }

    public void setCantidadKilometros(Integer cantidadKilometros) {
        this.cantidadKilometros = cantidadKilometros;
    }

    public String getSponsorCarrera() {
        return sponsorCarrera;
    }

    public void setSponsorCarrera(String sponsorCarrera) {
        this.sponsorCarrera = sponsorCarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombreCarrera='" + nombreCarrera + '\'' +
                ", paisUbicacion='" + paisUbicacion + '\'' +
                ", ciudadUbicacion='" + ciudadUbicacion + '\'' +
                ", cantidadVueltas=" + cantidadVueltas +
                ", cantidadKilometros=" + cantidadKilometros +
                ", sponsorCarrera='" + sponsorCarrera + '\'' +
                '}';
    }
}
