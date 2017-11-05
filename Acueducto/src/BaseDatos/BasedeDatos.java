package BaseDatos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 * @author Oliver Mazariegos
 * @author Javier Carpio
 * @version 5.11.2017
 */
public class BasedeDatos {
    Valvula valvula; 
    EntityManagerFactory emf;  
    EntityManager em; 
    
    /**
     * Constructor que crea la conexion a la Base de Datos.
     */
    public BasedeDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AcueductoPU");
        em = emf.createEntityManager();
        
        valvula = new Valvula(); 
    }
    
    /**
     * Metodo que cierra la conexion con la Base de Datos.
     */
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    /**
     * Metodo que nos permite agregar las valvulas a la base de datos.
     * @param v1 Valvula 1
     * @param v2 Valvula 2
     * @param v3 Valvula 3
     * @param v4 Valvula 4
     * @param v5 Valvula 5
     * @param v6 Valvula 6
     * @param v7 Valvula 7
     * @param v8 Valvula 8
     * @param v9 Valvula 9
     * @param v10 Valvula 10
     */
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
    
    /**
     * Metodo que permite agregar un tanque a la base de datos.
     * @param t Tanque
     */
    public void agregarTanque(Tanque t){
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
    
    /**
     * Metodo que permite agregar un tanque cilindrico a la base de datos.
     * @param num Numero de identificacion
     * @param val Valvulas
     * @param radio Radio del tanque.
     * @param altura Altura del tanque.
     * @param vol Volumen del tanque.
     * @param cap Capacidad del tanque
     * @return Tanque cilindrico
     */
    public Tanque agregarTanqueCilindrico(int num, Valvula[] val, int radio, int altura, double vol, double cap){
        TanqueCilindrico tc = new TanqueCilindrico(num, val, radio, altura, vol, cap);
        
        em.getTransaction().begin();
        em.persist(tc);
        em.getTransaction().commit();
        
        return tc;
    }
    
    /**
     * Metodo que permite agregar un tanque cubico a la base de datos.
     * @param num Numero de identificacion.
     * @param val Valvulas.
     * @param l Lado del tanque.
     * @param vol Volumen del tanque.
     * @param cap Capacidad del tanque.
     * @return Tanque cubico.
     */
    public Tanque agregarTanqueCubico(int num,Valvula[] val, int l, double vol, double cap){
        TanqueCubico tc = new TanqueCubico(num, val, l, vol, cap);
        
        em.getTransaction().begin();
        em.persist(tc);
        em.getTransaction().commit();
        
        return tc;
    }
    
    /**
     * Metodo que permite agregar un tanque ortogonal a la base de datos.
     * @param num Numero de identifiacion. 
     * @param val Valvulas.
     * @param l Lado del tanque.
     * @param a Ancho del tanque.
     * @param h Altura del tanque.
     * @param vol Volumen del tanque.
     * @param cap Capacidad del tanque.
     * @return Tanque ortogonal.
     */
    public Tanque agregarTanqueOrtogonal(int num, Valvula[] val, int l, int a, int h, double vol, double cap){
        TanqueOrtogonal to = new TanqueOrtogonal(num, val, l, h , a, vol, cap);
        
        em.getTransaction().begin();
        em.persist(to);
        em.getTransaction().commit();
        
        return to;
    }
    
    /**
     * Metodo que permite recuperar las valvulas de la base de datos.
     * @return Valvulas
     */
    public List<Valvula> recuperarValvulas(){
        Query q = em.createQuery("select d from Valvula d");
        List<Valvula> valvulas = q.getResultList();
        
        
        return valvulas;
    }
    
    /**
     * Metodo que nos permite recuperar las fechas de la base de datos.
     * @return Fecha
     */
    public List<Fecha> recuperarFechas(){
        Query q = em.createQuery("select d from Fecha d");
        List<Fecha> fecha = q.getResultList();
        
        
        return fecha;
    }

    /**
     * Metodo que nos permite recuperar los tanques de la base de datos.
     * @return Tanque
     */
    public List<Tanque> recuperarTanques(){
        Query q = em.createQuery("select d from Tanque d");
        List<Tanque> tanques = q.getResultList();
        
        
        return tanques;
    }

    /**
     * Metodo que nos permite modificar el volumen de la base de datos.
     * @param num Numero de identificacion.
     * @param volumen Volumen a modificar.
     */
    public void modificarVolumen(int num, double volumen){
        
        Query q = em.createQuery("select d from Tanque d where d.num = :num");
        q.setParameter("num", num);
        Tanque tq = (Tanque)q.getSingleResult();
        if(tq != null){
            tq.setVolumen(volumen);
            em.getTransaction().begin();// grabar el docente en la base de datos
            em.persist(tq);
            em.getTransaction().commit();
        }
                
    }
    
    /**
     * Metodo que nos permite agregar una fecha a la base de datos.
     * @param abrir Fecha que se abrio el tanque.
     * @param cerrar Fecha que se cerro el tanque.
     */
    public void agregarFecha(String abrir, String cerrar){
        Fecha fecha = new Fecha(abrir, cerrar);
        
        em.getTransaction().begin();
        em.persist(fecha);
        em.getTransaction().commit();
        
    }
    
    
}
