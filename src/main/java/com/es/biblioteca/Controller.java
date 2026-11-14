package com.es.biblioteca;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
* Classe de exemplo só para eu lembrar
* como funcionar e conferir que está funcionando.
* */
@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping( "/")
    public String helloWorld(
            @RequestParam(name="name", required=false, defaultValue="World")
            String name, Model model) {

        model.addAttribute("name", name);
        return "index";
    }
}
