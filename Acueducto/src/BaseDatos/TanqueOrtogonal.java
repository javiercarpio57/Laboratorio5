
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
public class TanqueOrtogonal extends Tanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private int base;
    private int altura;
    private int profundidad;
    
    private static final Valvula[] valv = new Valvula[10];
    
    public TanqueOrtogonal(){
        super(0, valv, 0, 0);
        base = 0;
        altura = 0;
        profundidad = 0;
    }
    
    public TanqueOrtogonal(int a, Valvula[] val, int b, int H, int p, double vol, double cap){
        super(a, val, vol, cap);
        base = b;
        altura = H;
        profundidad = p;
    }
    
    @Override
    public double calcularVolumen(int radio, int altura, int profundidad, int ancho) {
        double vol = altura * ancho * profundidad;
        
        vol = vol * 100;
        vol = Math.round(vol);
        vol = vol / 100;
        
        return vol;
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
        cadena1 += super.toString() + "\nBASE: " + base + " metros\nALTURA: " + altura + " metros\nPROFUNDIDAD: " + profundidad + " metros\nVOLUMEN: " + volumen + " metros cubicos\nCAPACIDAD: " + capacidad+ " metros cubicos";
        return cadena1 ;
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
        if (!(object instanceof TanqueOrtogonal)) {
            return false;
        }
        TanqueOrtogonal other = (TanqueOrtogonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String cadena1 = "";
        cadena1 += super.toString() + " - BASE: " + base + " metros - ALTURA: " + altura + " metros - PROFUNDIDAD: " + profundidad + " metros - VOLUMEN: " + volumen + " metros cubicos - CAPACIDAD: " + capacidad+ " metros cubicos";
        return cadena1 ;
    }
    
}
