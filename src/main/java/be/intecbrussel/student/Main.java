package be.intecbrussel.student;


import be.intecbrussel.student.model.User;
import be.intecbrussel.student.service.EntityFactoryGenerator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
       EntityManagerFactory emf= EntityFactoryGenerator.generator();
        EntityManager em  = emf.createEntityManager();

        EntityTransaction et= em.getTransaction();
        User user1=new User().setLogin("siri").setActive(true).setPassword("adiyogi");
    et.begin();
    em.persist(user1);
    et.commit();





    }
}

