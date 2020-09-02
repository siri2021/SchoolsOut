package be.intecbrussel.student.service;

import be.intecbrussel.student.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;


public class UserDao implements DaoInterface<User> {

EntityManagerFactory emf=EntityFactoryGenerator.generator();

    @Override
    public Optional get(long id) {
        EntityManager entityManager=emf.createEntityManager();
         user user =entityManager.find(User.class, id));

    }

    @Override
    public List getAll() {
        return null;
    }



    @Override
    public void save(User user) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(user);
        et.commit();
    }

    @Override
    public void update(User user) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(user);
        et.commit();
    }

    @Override
    public void delete(User user) {

    }


}
