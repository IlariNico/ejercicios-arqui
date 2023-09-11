/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ilari
 */
@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column
    private String ciudad;
    
    @Column 
    private String calle;
    
    @OneToMany(mappedBy="domicilio",fetch=FetchType.LAZY)
    private List<Persona>habitantes; //preguntar por que no sale la tabla 
    
    public Direccion() {
        super();
        this.habitantes=new ArrayList();
    }

    public Direccion( String ciudad, String calle) {
        this.habitantes=new ArrayList();
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public int getId() {
        return id;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public List<Persona> getHabitante() {
        return habitantes;
    }

    public void addHabitante(Persona p){
        habitantes.add(p);
    }
    
    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", ciudad=" + ciudad + ", calle=" + calle + '}';
    }
    
    
}
