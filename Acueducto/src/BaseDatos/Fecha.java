
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
 * @author Oliver Mazariegos
 * @author Javier Carpio
 * @version 5.11.2017
 */
@Entity
public class Fecha implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String FechaAbrir;
    private String FechaCerrar;
    
    /**
     * Constructor que nos conecta con la base de datos.
     */
    public Fecha(){}
    
    /**
     * Constructor que nos crea las Fechas.
     * @param i Fecha en la que se abrio la valvula.
     * @param f Fecha en la que se cerro la valvula.
     */
    public Fecha(String i, String f){
        FechaAbrir = i;
        FechaCerrar = f;
    }
    
    /**
     * Metodo que nos permite conocer la fecha en la que se abrio la valvula.
     * @return Fecha que se abre.
     */
    public String getFechaAbrir(){
        return FechaAbrir;
    }
    
    /**
     * Metodo que nos permite conocer la fecha en la que se cierra la valvula.
     * @return Fecha que se cierra.
     */
    public String getFechaCerrar(){
        return FechaCerrar;
    }
    
    /**
     * Metodo que nos permite generar las fechas en tiempo de corrida.
     * @return Fecha
     */
    public String generarFecha(){
        Date fecha = new Date();
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        String cadena = formatoFecha.format(fecha) + " - " + formatoHora.format(fecha) ;
        System.out.println(cadena);
        return cadena;
    }
    
    /**
     * Metodo que nos permite conocer el ID.
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que nos permite asignar el ID.
     * @param id 
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
