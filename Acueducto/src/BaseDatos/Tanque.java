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
public class Tanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    //private 
    protected int num;
    protected Valvula[] valvula;
    protected double volumen;
    protected double capacidad;
    
    
       
    public Tanque(){
        
    }
    
    public Tanque(int a, Valvula[] valv, double vol, double cap){
        num = a;
        valvula = valv;
        volumen = vol;
        capacidad = cap;
    }
    
    public double calcularVolumen(int radio, int altura, int profundidad, int ancho){
        
        return 1.0;
    }
    
    public boolean verificacion(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        
        boolean verificar;
        
        if(a.equals("")){
            verificar = false;
        }else if(b.equals("")){
            verificar = false;
        }else if(c.equals("")){
            verificar = false;
        }else if(d.equals("")){
            verificar = false;
        }else if(e.equals("")){
            verificar = false;
        }else if(f.equals("")){
            verificar = false;
        }else if(g.equals("")){
            verificar = false;
        }else if(h.equals("")){
            verificar = false;
        }else if(i.equals("")){
            verificar = false;
        }else if(j.equals("")){
            verificar = false;
        }else{
            verificar = true;
        }
        
        System.out.println(verificar);
        
        return verificar;
    }
    
    public String InstanceOf(Tanque tanque){
        String tipo = "";
        if(tanque instanceof TanqueCilindrico){
            tipo = "Tanque cilindrico:";
        }else if(tanque instanceof TanqueOrtogonal){
            tipo = "Tanque ortogonal:";
        }else if(tanque instanceof TanqueCubico){
            tipo = "Tanque cubico:";
        }
        return tipo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public int getNum(){
        return num;
    }
    
    public double getCapacidad(){
        return capacidad;
    }
    
    public double getVolumen(){
        return volumen;
    }
    
    public void setVolumen(double vol){
        volumen = vol;
    }

    public String mostrar(){
        return "";
    }
    
    public String getValvula(){
        String cadena = "";
        
        for(Valvula valv: valvula){
            cadena += valv.toString() + "\n";
        }
        
        return cadena;
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
        if (!(object instanceof Tanque)) {
            return false;
        }
        Tanque other = (Tanque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "ID: " + num; 
                
        return cadena;
    }

    
}
