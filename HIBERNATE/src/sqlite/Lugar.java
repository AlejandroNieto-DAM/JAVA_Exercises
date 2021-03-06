package sqlite;
// Generated 17-ene-2020 14:20:42 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Lugar generated by hbm2java
 */
public class Lugar  implements java.io.Serializable {


     private int id;
     private Grupo grupo;
     private String nombre;
     private String direccion;
     private Integer numeroEdif;
     private String horario;
     private Set ciudads = new HashSet(0);

    public Lugar() {
    }

	
    public Lugar(int id) {
        this.id = id;
    }
    public Lugar(int id, Grupo grupo, String nombre, String direccion, Integer numeroEdif, String horario, Set ciudads) {
       this.id = id;
       this.grupo = grupo;
       this.nombre = nombre;
       this.direccion = direccion;
       this.numeroEdif = numeroEdif;
       this.horario = horario;
       this.ciudads = ciudads;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getNumeroEdif() {
        return this.numeroEdif;
    }
    
    public void setNumeroEdif(Integer numeroEdif) {
        this.numeroEdif = numeroEdif;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Set getCiudads() {
        return this.ciudads;
    }
    
    public void setCiudads(Set ciudads) {
        this.ciudads = ciudads;
    }




}


