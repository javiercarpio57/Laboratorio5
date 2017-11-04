
package BaseDatos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
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
    
    public TanqueCilindrico(){
        super(0, valv, 0, 0);
        radio = 0;
        altura = 0;
        volumen = 0;
    }
    
    public TanqueCilindrico(int a, Valvula[] valv, int R, int H, double vol, double cap){
        super(a, valv, vol, cap);
        radio = R;
        altura = H;
    }
    
    public int getRadio(){
        return radio;
    }
    
    public int getAltura(){
        return altura;
    }
    
    @Override
    public double getCapacidad(){
        return capacidad;
    }
    
    @Override
    public double getVolumen(){
        return volumen;
    }
    
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
