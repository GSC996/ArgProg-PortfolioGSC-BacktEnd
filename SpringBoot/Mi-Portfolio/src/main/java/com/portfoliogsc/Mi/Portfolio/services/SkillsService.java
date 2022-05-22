package com.portfoliogsc.Mi.Portfolio.services;

import com.portfoliogsc.Mi.Portfolio.exceptions.UserNotFoundException;
import com.portfoliogsc.Mi.Portfolio.models.Skills;
import com.portfoliogsc.Mi.Portfolio.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> findSkills() {
        return skillsRepo.findAll();
    }

    public Skills editSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    public Skills findProyectosById(Long id) {
        return skillsRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}
