
package BaseDatos;


import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
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
    
    public void agregarValv(Valvula v1, Valvula v2, Valvula v3, Valvula v4, Valvula v5,
            Valvula v6, Valvula v7, Valvula v8, Valvula v9, Valvula v10){
        em.getTransaction().begin();
        em.persist(v1);
        em.persist(v2);
        em.persist(v3);
        em.persist(v4);
        em.persist(v5);
        em.persist(v6);
        em.persist(v7);
        em.persist(v8);
        em.persist(v9);
        em.persist(v10);
        em.getTransaction().commit();
    }
    
    public void agregarTanque(Tanque t){
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
    
    public Tanque agregarTanqueCilindrico(int num, Valvula[] val, int radio, int altura, double vol){
        TanqueCilindrico tc = new TanqueCilindrico(num, val, radio, altura, vol);
        
        System.out.println("Guardando...");
        
        em.getTransaction().begin();
        em.persist(tc);
        em.getTransaction().commit();
        
        return tc;
    }
    public Tanque agregarTanqueCubico(int num,Valvula[] val, int l, double vol){
        TanqueCubico tc = new TanqueCubico(num, val, l, vol);
        
        System.out.println("Guardando...");
        
        em.getTransaction().begin();
        em.persist(tc);
        em.getTransaction().commit();
        
        return tc;
    }
    
    public Tanque agregarTanqueOrtogonal(int num, Valvula[] val, int l, int a, int h, double vol){
        TanqueOrtogonal to = new TanqueOrtogonal(num, val, l, h , a, vol);
        
        System.out.println("Guardando...");
        
        em.getTransaction().begin();
        em.persist(to);
        em.getTransaction().commit();
        
        return to;
    }
    
    public List<Valvula> recuperarValvulas(){
        Query q = em.createQuery("select d from Valvula d");
        List<Valvula> valvulas = q.getResultList();
        
        
        return valvulas;
    }
    
    public List<Tanque> recuperarTanques(){
        Query q = em.createQuery("select d from Tanque d");
        List<Tanque> tanques = q.getResultList();
        
        
        return tanques;
    }

}
