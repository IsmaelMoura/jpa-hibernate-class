package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        Person person1 = new Person(null, "Carlos da Silva", "calos@gmail.com");
        Person person2 = new Person(null, "Marina Silva", "marina@gmail.com");
        Person person3 = new Person(null, "Ana Maria Bragança", "ana@gmail.com");

        em.getTransaction().begin();
        em.persist(person1);
        em.persist(person2);
        em.persist(person3);
        em.getTransaction().commit();

        System.out.println("End!");
        em.close();
        emf.close();
    }
}
