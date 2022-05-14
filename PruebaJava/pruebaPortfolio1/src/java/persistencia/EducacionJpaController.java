
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Educacion;
import persistencia.exceptions.NonexistentEntityException;

public class EducacionJpaController implements Serializable {

    public EducacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EducacionJpaController() {
        emf = Persistence.createEntityManagerFactory("pruebaPortfolio1PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Educacion educacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(educacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Educacion educacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            educacion = em.merge(educacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = educacion.getId();
                if (findEducacion(id) == null) {
                    throw new NonexistentEntityException("The educacion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Educacion educacion;
            try {
                educacion = em.getReference(Educacion.class, id);
                educacion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The educacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(educacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Educacion> findEducacionEntities() {
        return findEducacionEntities(true, -1, -1);
    }

    public List<Educacion> findEducacionEntities(int maxResults, int firstResult) {
        return findEducacionEntities(false, maxResults, firstResult);
    }

    private List<Educacion> findEducacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Educacion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Educacion findEducacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Educacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getEducacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Educacion> rt = cq.from(Educacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
