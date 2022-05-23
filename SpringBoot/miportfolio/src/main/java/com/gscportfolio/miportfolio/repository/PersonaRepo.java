package com.gscportfolio.miportfolio.repository;

import com.gscportfolio.miportfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
