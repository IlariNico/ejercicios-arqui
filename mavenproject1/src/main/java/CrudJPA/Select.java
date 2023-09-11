/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudJPA;

import Entities.Persona;
import Entities.Turno;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ilari
 */
public class Select {
    
    public List<Persona> getPersonasTurno(EntityManager em){
        
        List<Turno> lista=new ArrayList();
        lista=em.createQuery(
                "SELECT t FROM Turno t JOIN t.jugadores p distinct t.turnos_id").getResultList();
        for(Turno t:lista) {
        	System.out.println(t.getId());
        	System.out.println("Jugadores");
        	for(Persona p:t.getJugadores()) {
        		System.out.println(p);
        	}
        }
        return null;
    }
    
    public static void main(String[] args){
    	Select s=new Select();
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ejemplito");
        EntityManager em=emf.createEntityManager();
        List lista=new ArrayList();
        lista=s.getPersonasTurno(em);
        System.out.println(lista);
    }
    
}
