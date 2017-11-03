
package BaseDatos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author javie
 */
public class BasedeDatos {
    Valvula valvula; 
    EntityManagerFactory emf;  
    EntityManager em; 
    
    public BasedeDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AcueductoPU");
        em = emf.createEntityManager();
        
        valvula = new Valvula(); 
    }
    
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    public void agregarValv(Valvula v){
        em.getTransaction().begin();
        em.persist(v);
        em.getTransaction().commit();
    }
}
