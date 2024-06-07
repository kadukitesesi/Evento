package com.kadukitesesi.evento.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {

    @GetMapping("/convidados")
    public String listar() {
        return "ListaConvidados";
    }
}
