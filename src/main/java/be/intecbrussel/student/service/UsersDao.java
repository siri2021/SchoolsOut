package be.intecbrussel.student.service;

import be.intecbrussel.student.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class UsersDao {

    EntityManagerFactory emf= EntityFactoryGenerator.generator();

    public User get(String id) {
        System.out.println(id);
        EntityManager entityManager=emf.createEntityManager();
        System.out.println(id);
        User user1=entityManager.find(User.class, id);
        System.out.println(user1);
        return user1;
    }

    public void save(User user) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(user);
        et.commit();
    }


    public void update( User user){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(user);
        et.commit();
    }


    public void delete(User user) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(user);
        et.commit();
    }
}
