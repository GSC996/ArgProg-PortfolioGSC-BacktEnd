package com.gscportfolio.miportfolio.controller;

import com.gscportfolio.miportfolio.models.Proyecto;
import com.gscportfolio.miportfolio.services.ProyectoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> obtenerProyecto() {
        List<Proyecto> proyectos = proyectoService.findProyecto();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto) {
        Proyecto updateProyecto = proyectoService.editProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto) {
        Proyecto nuevoProyecto = proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
