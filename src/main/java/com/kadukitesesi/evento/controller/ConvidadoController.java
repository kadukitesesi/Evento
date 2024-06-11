package com.kadukitesesi.evento.controller;


import com.kadukitesesi.evento.model.ConvidadosModel;
import com.kadukitesesi.evento.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadoController {

    @Autowired
    ConvidadoRepository convidados;

    @GetMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView view = new ModelAndView("ListaConvidados");

        view.addObject("convidados", convidados.findAll());
        view.addObject("convidado", new ConvidadosModel());

        return view;
    }

    @PostMapping("/convidados")
    public String salvar(ConvidadosModel convidado) {
        this.convidados.save(convidado);

        return "redirect:/convidados";
    }


    @DeleteMapping("/convidados/{id}")
    public ResponseEntity<Void> deleteGuest(@PathVariable Long id) {
        if (convidados.existsById(id)) {
            convidados.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
