package com.gscportfolio.miportfolio.repository;

import com.gscportfolio.miportfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
