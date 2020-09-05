package be.intecbrussel.student.service;

import be.intecbrussel.student.model.Exam;
import be.intecbrussel.student.model.Grade;
import be.intecbrussel.student.repos.EntityFactoryGenerator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ExamService {

    EntityManagerFactory emf= EntityFactoryGenerator.generator();
    EntityManager em=emf.createEntityManager();


    public void outputExam(Long id){

        Grade grade =em.find(Grade.class , id);

            Exam exam=new Exam();
        exam.setName(grade.getExam().getName());
        System.out.println( "EXAM: "+ exam.getName() + "Grade : " + grade.getGradeValue());

    }
}
