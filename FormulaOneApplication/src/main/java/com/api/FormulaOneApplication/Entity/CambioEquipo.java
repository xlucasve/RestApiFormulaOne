package com.api.FormulaOneApplication.Entity;

import java.time.LocalDate;

public class CambioEquipo {

    private String nombreEquipo;

    private String nombrePilotoSeVa;

    private String apellidoPilotoSeVa;

    private String nombrePilotoEntra;

    private String apellidoPilotoEntra;

    private LocalDate fechaCambio;

    public CambioEquipo(String nombreEquipo, String nombrePilotoSeVa, String apellidoPilotoSeVa, String nombrePilotoEntra, String apellidoPilotoEntra, LocalDate fechaCambio) {
        this.nombreEquipo = nombreEquipo;
        this.nombrePilotoSeVa = nombrePilotoSeVa;
        this.apellidoPilotoSeVa = apellidoPilotoSeVa;
        this.nombrePilotoEntra = nombrePilotoEntra;
        this.apellidoPilotoEntra = apellidoPilotoEntra;
        this.fechaCambio = fechaCambio;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombrePilotoSeVa() {
        return nombrePilotoSeVa;
    }

    public void setNombrePilotoSeVa(String nombrePilotoSeVa) {
        this.nombrePilotoSeVa = nombrePilotoSeVa;
    }

    public String getApellidoPilotoSeVa() {
        return apellidoPilotoSeVa;
    }

    public void setApellidoPilotoSeVa(String apellidoPilotoSeVa) {
        this.apellidoPilotoSeVa = apellidoPilotoSeVa;
    }

    public String getNombrePilotoEntra() {
        return nombrePilotoEntra;
    }

    public void setNombrePilotoEntra(String nombrePilotoEntra) {
        this.nombrePilotoEntra = nombrePilotoEntra;
    }

    public String getApellidoPilotoEntra() {
        return apellidoPilotoEntra;
    }

    public void setApellidoPilotoEntra(String apellidoPilotoEntra) {
        this.apellidoPilotoEntra = apellidoPilotoEntra;
    }

    public LocalDate getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(LocalDate fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    @Override
    public String toString() {
        return "CambioEquipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", nombrePilotoSeVa='" + nombrePilotoSeVa + '\'' +
                ", apellidoPilotoSeVa='" + apellidoPilotoSeVa + '\'' +
                ", nombrePilotoEntra='" + nombrePilotoEntra + '\'' +
                ", apellidoPilotoEntra='" + apellidoPilotoEntra + '\'' +
                ", fechaCambio=" + fechaCambio +
                '}';
    }
}
