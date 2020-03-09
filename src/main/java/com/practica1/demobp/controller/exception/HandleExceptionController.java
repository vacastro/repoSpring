package com.practica1.demobp.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOError;

@ControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){
        e.printStackTrace();
        return "redirect:/index";
    }


}
