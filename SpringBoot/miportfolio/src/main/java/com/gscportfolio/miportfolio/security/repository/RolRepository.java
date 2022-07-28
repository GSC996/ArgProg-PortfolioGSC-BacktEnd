package com.gscportfolio.miportfolio.security.repository;

import com.gscportfolio.miportfolio.security.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
}
