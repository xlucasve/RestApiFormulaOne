package com.api.FormulaOneApplication.Entity;

import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Transient;

public class Piloto {

    private Integer id;

    private String nombrePiloto;

    private String apellidoPiloto;

    @Size (min = 3, message = "El nombre del equipo debe tener al menos 3 caracteres")
    private String equipoConduce;

    private Integer salario;

    @Transient
    private Integer posicionCampeonatoActual;

    public Piloto(Integer id, String nombrePiloto, String apellidoPiloto, String equipoConduce, Integer salario, Integer posicionCampeonatoActual) {
        this.id = id;
        this.nombrePiloto = nombrePiloto;
        this.apellidoPiloto = apellidoPiloto;
        this.equipoConduce = equipoConduce;
        this.salario = salario;
        this.posicionCampeonatoActual = posicionCampeonatoActual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getApellidoPiloto() {
        return apellidoPiloto;
    }

    public void setApellidoPiloto(String apellidoPiloto) {
        this.apellidoPiloto = apellidoPiloto;
    }

    public String getEquipoConduce() {
        return equipoConduce;
    }

    public void setEquipoConduce(String equipoConduce) {
        this.equipoConduce = equipoConduce;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getPosicionCampeonatoActual() {
        return posicionCampeonatoActual;
    }

    public void setPosicionCampeonatoActual(Integer posicionCampeonatoActual) {
        this.posicionCampeonatoActual = posicionCampeonatoActual;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", nombrePiloto='" + nombrePiloto + '\'' +
                ", apellidoPiloto='" + apellidoPiloto + '\'' +
                ", equipoConduce='" + equipoConduce + '\'' +
                ", salario=" + salario +
                ", posicionCampeonatoActual=" + posicionCampeonatoActual +
                '}';
    }
}