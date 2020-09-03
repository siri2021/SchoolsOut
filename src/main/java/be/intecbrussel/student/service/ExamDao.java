package be.intecbrussel.student.service;


import be.intecbrussel.student.model.Exam;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public class ExamDao implements DaoInterface<Exam> {
    EntityManagerFactory emf=EntityFactoryGenerator.generator();

    @Override
    public Optional get(String s) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Exam.class, s));
    }

    @Override
    public Optional get(Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Exam.class, id ));

    }


    @Override
    public List getAll() {
        return null;
    }



    @Override
    public void save(Exam exam) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(exam);
        et.commit();
    }

    @Override
    public void update( Exam exam){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(exam);
        et.commit();
    }

    @Override
    public void delete(Exam exam) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(em.contains(exam) ? exam : em.merge(exam));
        et.commit();
    }







}
