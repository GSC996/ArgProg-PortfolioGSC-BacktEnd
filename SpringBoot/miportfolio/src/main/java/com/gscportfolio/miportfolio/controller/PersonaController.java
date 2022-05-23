package com.gscportfolio.miportfolio.controller;

import com.gscportfolio.miportfolio.models.Persona;
import com.gscportfolio.miportfolio.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id) {
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona) {
        Persona updatePersona = personaService.editPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
}
