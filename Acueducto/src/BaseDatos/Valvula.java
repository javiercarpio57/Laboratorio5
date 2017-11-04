
package BaseDatos;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
 */
@Entity
public class Valvula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String municipio;
    private int habitantes;
    private boolean estado;
    
    public Valvula(){
        
        
    }   
    
    
    public Valvula(String muni, int hab){
        municipio = muni;
        habitantes = hab;
        estado = true;
    }
    
    
    public String getMunicipio(){
        return municipio;
    }
    
    public int getHabitantes(){
        return habitantes;
    }
    
    public boolean getEstado(){
        return estado;
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
        if (!(object instanceof Valvula)) {
            return false;
        }
        Valvula other = (Valvula) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\tMunicipio: " + municipio + "\t" + "Habitantes: " + habitantes + ".";
    }
    
}
