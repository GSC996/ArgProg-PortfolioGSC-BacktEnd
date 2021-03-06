package com.gscportfolio.miportfolio.services;

import com.gscportfolio.miportfolio.exceptions.UserNotFoundException;
import com.gscportfolio.miportfolio.models.Educacion;
import com.gscportfolio.miportfolio.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion editEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    public Educacion findEducacionById(Long id) {
        return educacionRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}
