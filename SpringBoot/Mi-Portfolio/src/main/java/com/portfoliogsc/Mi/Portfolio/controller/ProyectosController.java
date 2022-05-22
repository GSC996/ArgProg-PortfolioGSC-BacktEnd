package com.portfoliogsc.Mi.Portfolio.controller;

import com.portfoliogsc.Mi.Portfolio.models.Proyectos;
import com.portfoliogsc.Mi.Portfolio.services.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectoService) {
        this.proyectosService = proyectoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyectos() {
        List<Proyectos> proyectos = proyectosService.findProyecto();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyecto) {
        Proyectos updateProyecto = proyectosService.editProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @PostMapping("/all")
    public ResponseEntity<Proyectos> crearProyectos(@RequestBody Proyectos proyecto) {
        Proyectos nuevoProyecto = proyectosService.addProyecto(proyecto);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable("id") Long id) {
        proyectosService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
