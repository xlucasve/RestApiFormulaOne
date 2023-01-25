package com.api.FormulaOneApplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class CambioEquipoNotFoundException extends RuntimeException{

    public CambioEquipoNotFoundException (String message){
        super (message);
    }
}
