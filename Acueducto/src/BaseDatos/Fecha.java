
package BaseDatos;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
 */
@Entity
public class Fecha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String FechaAbrir;
    private String FechaCerrar;
    
    public Fecha(){}
    
    public Fecha(String i, String f){
        FechaAbrir = i;
        FechaCerrar = f;
    }
    
    public String getFechaAbrir(){
        return FechaAbrir;
    }
    
    public String getFechaCerrar(){
        return FechaCerrar;
    }
    
    public String generarFecha(){
        Date fecha = new Date();
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        String cadena = formatoFecha.format(fecha) + " - " + formatoHora.format(fecha) ;
        System.out.println(cadena);
        return cadena;
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
        if (!(object instanceof Fecha)) {
            return false;
        }
        Fecha other = (Fecha) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDatos.Fecha[ id=" + id + " ]";
    }
    
}
