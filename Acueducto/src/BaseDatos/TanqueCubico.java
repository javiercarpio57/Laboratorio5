
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
public class TanqueCubico extends Tanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private int lado;
    
    private static final Valvula[] valv = new Valvula[10];
    
    /**
     * Constructor que nos conecta con la base de datos.
     */
    public TanqueCubico(){
        super(0, valv, 0, 0);
        lado = 0;
    }
    
    /**
     * Constructor que nos permite crear un tanque cubico.
     * @param a Numero de identificacion
     * @param val Array de 10 valvulas
     * @param l Largo del tanque
     * @param vol Volumen del tanque
     * @param cap Capacidad del tanque
     */
    public TanqueCubico(int a, Valvula [] val, int l, double vol, double cap){
        super(a, val, vol, cap);
        lado = l;
    }
    
    /**
     * Metodo que nos permite calcular el volumen del tanque cubico.
     * @param radio Radio del tanque. No se usa.
     * @param altura Altura del tanque. No se usa.
     * @param profundidad Lado del tanque.
     * @param ancho Ancho del tanque. No se usa.
     * @return Volumen
     */
    @Override
    public double calcularVolumen(int radio, int altura, int profundidad, int ancho) {
        double vol = profundidad * profundidad * profundidad;
        
        vol = vol * 100;
        vol = Math.round(vol);
        vol = vol / 100;
        
        return vol;
    }
    
    /**
     * Metodo que nos permite conocer la informacion del tanque.
     * @return Informacion
     */
    @Override
    public String mostrar(){
        String cadena1 = "";
        cadena1 += super.toString() + "\nLADO: " + lado + " metros\nVOLUMEN: " + volumen + "  metros cubicos\nCAPACIDAD: " + capacidad+ " metros cubicos";
        return cadena1 ;
    }
    
    /**
     * Metodo que nos permite conocer la capacidad del tanque.
     * @return capacidad
     */
    @Override
    public double getCapacidad(){
        return capacidad;
    }
    
    /**
     * Metodo que nos permite conocer el volumen del tanque.
     * @return volumen
     */
    @Override
    public double getVolumen(){
        return volumen;
    }
    
    /**
     * Metodo que nos permite cambiar el volumen del tanque.
     * @param vol Nuevo volumen
     */
    @Override
    public void setVolumen(double vol){
        volumen = vol;
    }
    
    /**
     * Metodo que nos permite conocer el ID.
     * @return ID
     */
    @Override
    public Long getId() {
        return id;
    }
    
    /**
     * Metodo que nos permite cambiar el ID.
     * @param id ID del tanque
     */
    @Override
    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof TanqueCubico)) {
            return false;
        }
        TanqueCubico other = (TanqueCubico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Metodo que nos permite conocer la informacion de los tanques.
     * @return Informacion
     */
    @Override
    public String toString() {
        String cadena1 = "";
        cadena1 += super.toString() + " - LADO: " + lado + " metros - VOLUMEN: " + volumen + " metros cubicos - CAPACIDAD: " + capacidad+ " metros cubicos";
        return cadena1 ;
    }
    
}
