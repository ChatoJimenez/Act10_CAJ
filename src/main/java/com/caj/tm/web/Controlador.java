package com.caj.tm.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador de mi primer app de Spring Boot");
        return "index";
    }
}



