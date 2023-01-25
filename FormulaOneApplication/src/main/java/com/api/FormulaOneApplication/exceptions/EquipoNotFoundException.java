package com.api.FormulaOneApplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class EquipoNotFoundException extends  RuntimeException{

    public EquipoNotFoundException (String message){
        super (message);
    }
}
