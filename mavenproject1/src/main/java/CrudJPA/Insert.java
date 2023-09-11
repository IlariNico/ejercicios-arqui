
package CrudJPA;

import Entities.Direccion;
import Entities.Persona;
import Entities.Turno;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.protobuf.Timestamp;

/**
 *
 * @author ilari
 */
public class Insert {
    public static void main(String[] args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ejemplito");
        EntityManager em=emf.createEntityManager();
       
        em.getTransaction().begin();
        Direccion d=new Direccion ("tandil","que se yo 800");
        Persona n=new Persona(9,"otro ignacio 2",21,d);
        Persona p=new Persona(10,"otro peter 2",21,d);
        LocalDate time=LocalDate.now();
        Turno t=new Turno(time);
        t.addPersona(p);
        t.addPersona(n);
        n.addTurno(t);
        p.addTurno(t);
        d.addHabitante(p);
        d.addHabitante(n);
        em.persist(t);
        em.persist(d);
        em.persist(n);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
