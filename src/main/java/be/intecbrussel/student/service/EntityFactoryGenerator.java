package be.intecbrussel.student.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactoryGenerator {
    public static EntityManagerFactory generator(){
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("datasource");
        return emfactory;
    }
}
