package com.api.FormulaOneApplication.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Size;

public class Equipo {

    @Id
    private Integer id;

    @Size (min = 3, message = "El nombre del equipo debe tener al menos 3 caracteres")
    private String nombreEquipo;

    @Transient
    private Integer posicionWCC;

    private Integer cantidadPersonal;

    @Size (min = 3, message = "El nombre de la marca de motor debe tener al menos 3 caracteres")
    private String marcaMotor;

    public Equipo(Integer id, String nombreEquipo, Integer posicionWCC, Integer cantidadPersonal, String marcaMotor) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.posicionWCC = posicionWCC;
        this.cantidadPersonal = cantidadPersonal;
        this.marcaMotor = marcaMotor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Integer getPosicionWCC() {
        return posicionWCC;
    }

    public void setPosicionWCC(Integer posicionWCC) {
        this.posicionWCC = posicionWCC;
    }

    public Integer getCantidadPersonal() {
        return cantidadPersonal;
    }

    public void setCantidadPersonal(Integer cantidadPersonal) {
        this.cantidadPersonal = cantidadPersonal;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", posicionWCC=" + posicionWCC +
                ", cantidadPersonal=" + cantidadPersonal +
                ", marcaMotor='" + marcaMotor + '\'' +
                '}';
    }
}
