package com.api.FormulaOneApplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class CampeonatoNotFoundException extends RuntimeException{

    public CampeonatoNotFoundException (String message){
        super (message);
    }
}
