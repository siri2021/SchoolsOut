package be.intecbrussel.student.repos;

import be.intecbrussel.student.model.Grade;
import be.intecbrussel.student.model.Module;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public class GradeDao implements DaoInterface<Grade> {

        EntityManagerFactory emf=EntityFactoryGenerator.generator();

        @Override
        public Optional get(String s) {
            EntityManager entityManager=emf.createEntityManager();
            return Optional.ofNullable(entityManager.find(Grade.class, s));

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
        public void save(Grade grade) {
            EntityManager em=emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
            em.persist(grade);
            et.commit();
        }

        @Override
        public void update(Grade grade){
            EntityManager em=emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
            em.merge(grade);
            et.commit();
        }

        @Override
        public void delete(Grade grade) {
            EntityManager em=emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
            em.remove(em.contains(grade) ? grade : em.merge(grade));
            et.commit();
        }



    }


