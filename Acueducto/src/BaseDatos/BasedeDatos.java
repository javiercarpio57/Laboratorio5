
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
    Valvula valvula; // la universidad en donde se guardan trabajadores
    EntityManagerFactory emf;  // para especificar la Persistent Unit y conexion a la base de datos
    EntityManager em; // manejador de las entidades en la base de datos
    
    public BasedeDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("universidadJPAPU");
        em = emf.createEntityManager();
        valvula = new Valvula(); // universidad sin trabajadores
    }
    
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    public void agregarValv(Valvula v){
        
    }
}
