package com.portfoliogsc.Mi.Portfolio.services;

import com.portfoliogsc.Mi.Portfolio.exceptions.UserNotFoundException;
import com.portfoliogsc.Mi.Portfolio.models.Proyectos;
import com.portfoliogsc.Mi.Portfolio.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectosService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyectos addProyecto(Proyectos proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<Proyectos> findProyecto() {
        return proyectoRepo.findAll();
    }

    public Proyectos editProyecto(Proyectos proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
    
    public Proyectos findProyectosById(Long id) {
        return proyectoRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}
