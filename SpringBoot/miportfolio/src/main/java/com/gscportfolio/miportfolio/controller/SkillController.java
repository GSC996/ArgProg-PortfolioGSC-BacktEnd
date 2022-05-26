package com.gscportfolio.miportfolio.controller;

import com.gscportfolio.miportfolio.models.Skill;
import com.gscportfolio.miportfolio.services.SkillService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skill")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> obtenerSkill() {
        List<Skill> skills = skillService.findSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> editarProyecto(@RequestBody Skill skill) {
        Skill updateSkill = skillService.editSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> crearProyecto(@RequestBody Skill skill) {
        Skill nuevoSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(nuevoSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id) {
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
