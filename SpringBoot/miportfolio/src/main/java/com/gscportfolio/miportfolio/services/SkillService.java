package com.gscportfolio.miportfolio.services;

import com.gscportfolio.miportfolio.exceptions.UserNotFoundException;
import com.gscportfolio.miportfolio.models.Skill;
import com.gscportfolio.miportfolio.repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {

    private final SkillRepo skillsRepo;

    @Autowired
    public SkillService(SkillRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillsRepo.save(skill);
    }

    public List<Skill> findSkills() {
        return skillsRepo.findAll();
    }

    public Skill editSkill(Skill skill) {
        return skillsRepo.save(skill);
    }

    public void deleteSkill(Long id) {
        skillsRepo.deleteById(id);
    }

    public Skill findSkillById(Long id) {
        return skillsRepo.findById(id).orElseThrow(() -> new UserNotFoundException("No encontrado"));
    }
}