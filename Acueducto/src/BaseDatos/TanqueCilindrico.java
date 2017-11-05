
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
public class TanqueCilindrico extends Tanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private int radio;
    private int altura;
    
    private static final Valvula[] valv = new Valvula[10];
    
    /**
     * Constructor que nos permite conectar con la base de datos.
     */
    public TanqueCilindrico(){
        super(0, valv, 0, 0);
        radio = 0;
        altura = 0;
        volumen = 0;
    }
    
    /**
     * Constructor que nos permite crear los objetos del tanque cilindrico.
     * @param a Contiene el numero del tanque.
     * @param valv Contiene las valvulas del tanque.
     * @param R Contiene la medida del radio del tanque.
     * @param H Contiene la medida de la altura del tanque.
     * @param vol Contiene el volumen del tanque.
     * @param cap Contiene la capacidad del tanque.
     */
    public TanqueCilindrico(int a, Valvula[] valv, int R, int H, double vol, double cap){
        super(a, valv, vol, cap);
        radio = R;
        altura = H;
    }
    
    /**
     * Metodo que nos permite conocer la medida del radio.
     * @return radio
     */
    public int getRadio(){
        return radio;
    }
    
    /**
     * Metodo que nos permite conocer la altura del tanque.
     * @return altura
     */
    public int getAltura(){
        return altura;
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
     * Metodo que nos permite asignarle el volumen al tanque.
     * @param vol Volumen nuevo.
     */
    @Override
    public void setVolumen(double vol){
        volumen = vol;
    }

    
    @Override
    public String mostrar(){
        String cadena1 = "";
        cadena1 += super.toString() + "\nRADIO: " + radio + " metros\nALTURA: " + altura + " metros\nVOLUMEN: " + volumen + "  metros cubicos\nCAPACIDAD: " + capacidad+ " metros cubicos" ;
        return cadena1 ;
    }
    
    @Override
    public double calcularVolumen(int radio, int altura, int profundidad, int ancho) {
        double vol = radio * radio * altura * Math.PI;
        
        vol = vol * 100;
        vol = Math.round(vol);
        vol = vol / 100;
        return vol;
    }
    
    
    @Override
    public Long getId() {
        return id;
    }

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
        if (!(object instanceof TanqueCilindrico)) {
            return false;
        }
        TanqueCilindrico other = (TanqueCilindrico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String cadena1 = "";
        cadena1 += super.toString() + " - RADIO: " + radio + " metros - ALTURA: " + altura + " metros - VOLUMEN: " + volumen + "  metros cubicos - CAPACIDAD: " + capacidad+ " metros cubicos";
        return cadena1 ;
    }
    
    
    
}
