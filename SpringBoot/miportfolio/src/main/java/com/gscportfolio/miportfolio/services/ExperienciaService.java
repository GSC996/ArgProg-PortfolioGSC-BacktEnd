package com.gscportfolio.miportfolio.services;

import com.gscportfolio.miportfolio.exceptions.UserNotFoundException;
import com.gscportfolio.miportfolio.models.Experiencia;
import com.gscportfolio.miportfolio.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findExperiencia() {
        return experienciaRepo.findAll();
    }

    public Experiencia editExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    public Experiencia findExperienciaById(Long id) {
        return experienciaRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}
