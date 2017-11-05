
package BaseDatos;

import java.io.Serializable;
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
public class Valvula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String municipio;
    private int habitantes;
    private boolean estado;
    
    /**
     * Construtor que nos permite conectar con la base de datos.
     */
    public Valvula(){}   
    
    /**
     * Constructor que nos permite crear el objeto de tipo valvula.
     * @param muni Nombre del municipio
     * @param hab Cantidad de habitantes.
     */
    public Valvula(String muni, int hab){
        municipio = muni;
        habitantes = hab;
        estado = true;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del municipio.
     * @return municipio
     */
    public String getMunicipio(){
        return municipio;
    }
    
    /**
     * Metodo que nos permite conocer la cantidad de habitantes.
     * @return habitantes
     */
    public int getHabitantes(){
        return habitantes;
    }
    
    /**
     * Metodo que nos permite conocer el estado de la valvula.
     * @return estado
     */
    public boolean getEstado(){
        return estado;
    }
    
    /**
     * Metodo que nos permite conocer el ID.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que nos permite asiganrle el ID.
     * @param id ID
     */
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

    /**
     * Metodo que nos permite conocer la informacion de las valvulas.
     * @return Informacion
     */
    @Override
    public String toString() {
        return "\tMunicipio: " + municipio + "\t" + "Habitantes: " + habitantes + ".";
    }
    
}
