package com.api.FormulaOneApplication.Service;

import com.api.FormulaOneApplication.Entity.Piloto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PilotoService {

    private static List<Piloto> listaPilotos = new ArrayList<>();

    static {
        listaPilotos.add(new Piloto(1, "Max", "Verstappen", "RedBull", 100, null));
        listaPilotos.add(new Piloto(1, "Sergio", "Perez", "RedBull", 80, null));
        listaPilotos.add(new Piloto(1, "Daniel", "Ricciardo", "RedBull", 40, null));
    }

    public List<Piloto> findAllPilotos(){
        return listaPilotos;
    }
}
