
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEducacion (Educacion edu){
        controlPersis.crearEdu(edu);
    }
    
    public void eliminarEducacion (int id){
        controlPersis.eliminarEdu(id);
    }
    
    public void eliminarEducacion (Educacion edu){
        controlPersis.eliminarEdu(edu);
    }
    
    public List<Educacion> traerEducacion(){
        return controlPersis.traerEducacion();
}
