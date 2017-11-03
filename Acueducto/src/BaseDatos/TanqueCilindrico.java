
package BaseDatos;

import java.io.Serializable;
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
    private Long id;

    private int radio;
    private int altura;
    private double volumen;
    
    public TanqueCilindrico(){
        
    }

    
    
    public TanqueCilindrico(int R, int H, double vol){
        radio = R;
        altura = H;
        volumen = vol;
    }
    
    public int getRadio(){
        return radio;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public double getVolumen(){
        return volumen;
    }
    
    public void setVolumen(double vol){
        volumen = vol;
    }
    
    @Override
    public double calcularVolumen(int radio, int altura){
        double vol;
        vol = radio * altura * Math.PI;
        
        return vol;
    }
    public Long getId() {
        return id;
    }

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
        return "BaseDatos.TanqueCilindrico[ id=" + id + " ]";
    }
    
}
