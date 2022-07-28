package com.gscportfolio.miportfolio.security.service;

import com.gscportfolio.miportfolio.security.entity.Rol;
import com.gscportfolio.miportfolio.security.enums.RolNombre;
import com.gscportfolio.miportfolio.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
