package io.github.andersonvelasco.catalogoroupas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.andersonvelasco.catalogoroupas.service.ModeloService;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/modelo")
public class ModeloController {
    
    @Autowired
    private ModeloService modeloService;

    @GetMapping
    public String carregarPaginaListagem (Model model, HttpSession session) {
        model.addAttribute("lista", modeloService.getAllModelos());

        return "modelo/listagem";
    }
}
