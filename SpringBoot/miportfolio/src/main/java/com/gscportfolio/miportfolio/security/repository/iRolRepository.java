package com.gscportfolio.miportfolio.security.repository;

import com.gscportfolio.miportfolio.security.entity.Rol;
import com.gscportfolio.miportfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
