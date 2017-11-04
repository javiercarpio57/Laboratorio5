
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
        super(valv, 0);
        base = 0;
        altura = 0;
        profundidad = 0;
    }
    
    public TanqueOrtogonal(Valvula[] val, int b, int H, int p, double vol){
        super(val, vol);
        base = b;
        altura = H;
        profundidad = p;
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
        return "BaseDatos.TanqueOrtogonal[ id=" + id + " ]";
    }
    
}
