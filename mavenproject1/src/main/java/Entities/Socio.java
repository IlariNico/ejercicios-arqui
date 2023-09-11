/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author ilari
 */
public class Socio {
    @Id
    private int id;
    
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private Persona persona;
    @Column
    private String tipo;

    public int getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Socio() {
    }

    public Socio(int id, Persona persona, String tipo) {
        this.id = id;
        this.persona = persona;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", persona=" + persona + ", tipo=" + tipo + '}';
    }
    
    
}
