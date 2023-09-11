/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import com.google.protobuf.Timestamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author ilari
 */
@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Persona> jugadores;
    
    @Column
    private LocalDate fecha;

    public int getId() {
        return id;
    }

    public List<Persona> getJugadores() {
        return jugadores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Turno() {
    }

    public Turno(LocalDate fecha) {
        this.fecha = fecha;
        this.jugadores=new ArrayList();
    }

    public void addPersona(Persona p) {
    	jugadores.add(p);
    }
    
    @Override
    public String toString() {
        return "Turno{" + "id=" + id + ", jugadores=" + jugadores + ", fecha=" + fecha + '}';
    }
    
    
}
