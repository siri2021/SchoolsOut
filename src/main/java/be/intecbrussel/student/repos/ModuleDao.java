package be.intecbrussel.student.repos;

import be.intecbrussel.student.model.Module;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;


public class ModuleDao implements DaoInterface<Module> {
    EntityManagerFactory emf=EntityFactoryGenerator.generator();

    @Override
    public Optional get(String s) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Module.class, s));

    }

    @Override
    public Optional get(Long id) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Module.class, id ));

    }


    @Override
    public List getAll() {
        return null;
    }



    @Override
    public void save(Module module) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(module);
        et.commit();
    }

    @Override
    public void update(Module module){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(module);
        et.commit();
    }

    @Override
    public void delete(Module module) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(em.contains(module) ? module : em.merge(module));
        et.commit();
    }



}
