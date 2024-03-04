package com.develhope.develhope.esercizio2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/Es2")
public class ControllerEs2 {
    @GetMapping("/saluto/{provincia}")
    public Utente salutoEClima(@RequestParam String nome, @PathVariable String provincia){
        String saluto="Ciao "+ nome+ ", com'è il tempo in "+provincia;
        return new Utente(nome,provincia,saluto);
    }



}