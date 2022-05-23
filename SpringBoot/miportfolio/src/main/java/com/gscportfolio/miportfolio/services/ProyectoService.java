package com.gscportfolio.miportfolio.services;

import com.gscportfolio.miportfolio.exceptions.UserNotFoundException;
import com.gscportfolio.miportfolio.models.Proyecto;
import com.gscportfolio.miportfolio.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> findProyecto() {
        return proyectoRepo.findAll();
    }

    public Proyecto editProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    public Proyecto findProyectosById(Long id) {
        return proyectoRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}
