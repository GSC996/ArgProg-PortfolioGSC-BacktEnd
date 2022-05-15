package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Educacion;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    EducacionJpaController eduJPA = new EducacionJpaController();
    
    public void crearEdu(Educacion edu) {
        eduJPA.create(edu);
    }
    
    public void eliminarEdu(int id) {
        try {
            eduJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarEdu(Educacion edu){
        try {
            eduJPA.destroy(edu.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Educacion> traerEducacion(){
        return eduJPA.findEducacionEntities();
    }
}
