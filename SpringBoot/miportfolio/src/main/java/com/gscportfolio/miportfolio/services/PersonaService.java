package com.gscportfolio.miportfolio.services;

import com.gscportfolio.miportfolio.exceptions.UserNotFoundException;
import com.gscportfolio.miportfolio.models.Persona;
import com.gscportfolio.miportfolio.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {

    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public List<Persona> findPersona() {
        return personaRepo.findAll();
    }

    public Persona editPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    public Persona findPersonaById(Long id) {
        return personaRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
    }
}
