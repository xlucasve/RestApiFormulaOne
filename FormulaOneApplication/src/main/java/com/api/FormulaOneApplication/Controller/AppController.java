package com.api.FormulaOneApplication.Controller;

import com.api.FormulaOneApplication.Entity.Piloto;
import com.api.FormulaOneApplication.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/formulaOne")
public class AppController {

    @Autowired
    private CambioEquipoService cambioEquipoService;

    @Autowired
    private CampeonatoService campeonatoService;

    @Autowired
    private CarreraService carreraService;

    @Autowired
    private EquipoService equipoService;

    @Autowired
    private PilotoService pilotoService;


    @GetMapping ("/pilotos")
    public List<Piloto> findAllPilotos(){
        return pilotoService.findAllPilotos();
    }

    @GetMapping ("/test")
    public String test(){
        return "Test Completado";
    }


}
