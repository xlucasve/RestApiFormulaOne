package com.api.FormulaOneApplication.Entity;

import java.util.List;

public class Campeonato {

    private Integer anioCampeonato;

    private List<Carrera> carrerasCampeonato;

    private List<Piloto> pilotosParticipantes;

    private List<Equipo> equiposParticipantes;

    public Campeonato(Integer anioCampeonato, List<Carrera> carrerasCampeonato, List<Piloto> pilotosParticipantes, List<Equipo> equiposParticipantes) {
        this.anioCampeonato = anioCampeonato;
        this.carrerasCampeonato = carrerasCampeonato;
        this.pilotosParticipantes = pilotosParticipantes;
        this.equiposParticipantes = equiposParticipantes;
    }

    public Integer getAnioCampeonato() {
        return anioCampeonato;
    }

    public void setAnioCampeonato(Integer anioCampeonato) {
        this.anioCampeonato = anioCampeonato;
    }

    public List<Carrera> getCarrerasCampeonato() {
        return carrerasCampeonato;
    }

    public void setCarrerasCampeonato(List<Carrera> carrerasCampeonato) {
        this.carrerasCampeonato = carrerasCampeonato;
    }

    public List<Piloto> getPilotosParticipantes() {
        return pilotosParticipantes;
    }

    public void setPilotosParticipantes(List<Piloto> pilotosParticipantes) {
        this.pilotosParticipantes = pilotosParticipantes;
    }

    public List<Equipo> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List<Equipo> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "anioCampeonato=" + anioCampeonato +
                ", carrerasCampeonato=" + carrerasCampeonato +
                ", pilotosParticipantes=" + pilotosParticipantes +
                ", equiposParticipantes=" + equiposParticipantes +
                '}';
    }
}
