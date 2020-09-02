package be.intecbrussel.student.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class userService {
EntityManagerFactory emf=EntityFactoryGenerator.generator();
EntityManager em=emf.createEntityManager();
EntityTransaction et = em.getTransaction();

//et. ;   //probem ,not able to use entity transaction


}
