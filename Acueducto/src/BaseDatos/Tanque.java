package BaseDatos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Oliver Mazariegos
 * @author Javier Carpio
 * @version 5.11.2017
 */
@Entity
public class Tanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    //private 
    protected int num;
    protected Valvula[] valvula;
    protected double volumen;
    protected double capacidad;
    
    
    /**
     * Constructor que permite conectar con la base de datos.
     */
    public Tanque(){
        
    }
    
    /**
     * Constructor que permite crear los objetos de tipo Tanque.
     * @param a ID para la identificacion del tanque.
     * @param valv Array que contiene todas las valvulas del tanque.
     * @param vol Double que posee el volumen del tanque.
     * @param cap Double que posee la capacidad total del tanque.
     */
    public Tanque(int a, Valvula[] valv, double vol, double cap){
        num = a;
        valvula = valv;
        volumen = vol;
        capacidad = cap;
    }
    
    /**
     * Metodo que nos permite calcular el volumen del tanque.
     * @param radio Es el radio del tanque.
     * @param altura Es la altura del tanque.
     * @param profundidad Es la profundidad del tanque.
     * @param ancho Es el ancho del tanque
     * @return Devuelve el volumen
     */
    public double calcularVolumen(int radio, int altura, int profundidad, int ancho){
        
        return 1.0;
    }
    
    /**
     * Metodo que nos permite realizar la verificacion de todos los datos.
     * @param a Municipio 1
     * @param b Municipio 2
     * @param c Municipio 3
     * @param d Municipio 4
     * @param e Municipio 5
     * @param f Municipio 6
     * @param g Municipio 7
     * @param h Municipio 8
     * @param i Municipio 9
     * @param j Municipio 10
     * @return Devuele si estan todos los datos llenos o no.
     */
    public boolean verificacion(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        
        boolean verificar;
        
        if(a.equals("")){
            verificar = false;
        }else if(b.equals("")){
            verificar = false;
        }else if(c.equals("")){
            verificar = false;
        }else if(d.equals("")){
            verificar = false;
        }else if(e.equals("")){
            verificar = false;
        }else if(f.equals("")){
            verificar = false;
        }else if(g.equals("")){
            verificar = false;
        }else if(h.equals("")){
            verificar = false;
        }else if(i.equals("")){
            verificar = false;
        }else if(j.equals("")){
            verificar = false;
        }else{
            verificar = true;
        }
                
        return verificar;
    }
    
    /**
     * Metodo que nos permite averiguar de que forma es el tanque.
     * @param tanque Tanque que contiene toda la informacion.
     * @return El tipo de tanque.
     */
    public String InstanceOf(Tanque tanque){
        String tipo = "";
        if(tanque instanceof TanqueCilindrico){
            tipo = "Tanque cilindrico:";
        }else if(tanque instanceof TanqueOrtogonal){
            tipo = "Tanque ortogonal:";
        }else if(tanque instanceof TanqueCubico){
            tipo = "Tanque cubico:";
        }
        return tipo;
    }
    
    /**
     * Metodo que nos permite conocer el ID del tanque.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que nos permite asignarle un valor al tanque.
     * @param id ID que se desea asignar.
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Metodo que nos permite conocer el numero de tanque.
     * @return El numero de tanque.
     */
    public int getNum(){
        return num;
    }
    
    /**
     * Metodo que nos permite conocer la capacidad del tanque.
     * @return capacidad
     */
    public double getCapacidad(){
        return capacidad;
    }
    
    /**
     * Metodo que nos permite conocer el volumen del tanque.
     * @return volumen
     */
    public double getVolumen(){
        return volumen;
    }
    
    /**
     * Metodo que nos permite asignarle el valor del volumen del tanque.
     * @param vol Volumen nuevo.
     */
    public void setVolumen(double vol){
        volumen = vol;
    }

    /**
     * Metodo que nos permite mostrar la informacion del tanque.
     * @return Informacion
     */
    public String mostrar(){
        return "";
    }
    
    /**
     * Metodo que nos permite conocer las valvulas de ARRAY ingresado.
     * @return Valvulas
     */
    public String getValvula(){
        String cadena = "";
        
        for(Valvula valv: valvula){
            cadena += valv.toString() + "\n";
        }
        
        return cadena;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tanque)) {
            return false;
        }
        Tanque other = (Tanque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Metodo que nos permite conocer la informacion del tanque.
     * @return informacion
     */
    @Override
    public String toString() {
        String cadena = "";
        cadena += "ID: " + num; 
                
        return cadena;
    }

    
}
