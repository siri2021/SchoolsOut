package be.intecbrussel.student.repos;

import be.intecbrussel.student.model.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public class CourseDao implements DaoInterface<Course> {

    EntityManagerFactory emf= EntityFactoryGenerator.generator();

    @Override
    public Optional get(String s) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Course.class, s));

    }

    @Override
    public Optional get(Long id) {
        EntityManager entityManager=emf.createEntityManager();
        return Optional.ofNullable(entityManager.find(Course.class, id ));

    }


    @Override
    public List getAll() {
        return null;
    }



    @Override
    public void save(Course course) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(course);
        et.commit();
    }

    @Override
    public void update( Course course){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(course);
        et.commit();
    }

    @Override
    public void delete(Course course) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(em.contains(course) ? course : em.merge(course));
        et.commit();
    }




}
