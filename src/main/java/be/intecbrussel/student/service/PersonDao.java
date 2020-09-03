package be.intecbrussel.student.service;

import be.intecbrussel.student.model.Person;
import be.intecbrussel.student.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public class PersonDao implements DaoInterface<Person> {

    EntityManagerFactory emf=EntityFactoryGenerator.generator();

    @Override
    public Optional get(String s) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Person.class, s));

    }

    @Override
    public Optional get(Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Person.class, id ));

    }


    @Override
    public List getAll() {
        return null;
    }



    @Override
    public void save(Person person) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(person);
        et.commit();
    }

    @Override
    public void update( Person person){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(person);
        et.commit();
    }

    @Override
    public void delete(Person person) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(em.contains(person) ? person : em.merge(person));
        et.commit();
    }



}
