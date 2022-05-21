package com.portfoliogsc.Mi.Portfolio.repository;

import com.portfoliogsc.Mi.Portfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
