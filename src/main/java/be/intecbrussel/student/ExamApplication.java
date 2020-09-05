package be.intecbrussel.student;

import be.intecbrussel.student.model.Exam;
import be.intecbrussel.student.model.Grade;
import be.intecbrussel.student.model.Module;
import be.intecbrussel.student.repos.EntityFactoryGenerator;
import be.intecbrussel.student.repos.ExamDao;
import be.intecbrussel.student.service.ExamService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExamApplication {
    private static EntityManagerFactory emf=EntityFactoryGenerator.generator();

    private static ExamDao examDao=new ExamDao();
    private static ExamService examService=new ExamService();
    public static void main(String[] args) {
        List<Exam> subExams=new ArrayList<>();

       Exam exam1=new Exam().setModule(new Module().setName("Git").setDescription("reactive programming"))
               .setDate(LocalDate.of(2001, 3,2))
                .setName("Ajile").setDescription("Inclass").setWeight(70).setTotal(90);
Exam examgrp=new Exam().setName("engineering");
      Exam  subExam1= new Exam().setName("IIT").setDate(LocalDate.of(2015,5,4));
        Exam  subExam2= new Exam().setName("JEE").setDate(LocalDate.of(2015,5,5));
        Exam  subExam3= new Exam().setName("JEE_PRELIMS").setDate(LocalDate.of(2015,5,3));
        subExams.add(subExam1);
        subExams.add(subExam2);
        subExams.add(subExam3);

        saveExam(exam1);

        Exam exam2=new Exam().setName("Jee-entrance").setExamGroup(examgrp).setSubexams(subExams);


        System.out.println(exam1);

        System.out.println(exam2);

          // exam2.setSubexams(subExams);

            saveExam(exam2);
       // deleteExam(exam2);
        updateExam(getExam(88L));


       // examService.outputExam(49L);
        EntityManager em= emf.createEntityManager();
        Exam exam88=em.find(Exam.class, 88L);
        exam88.setSubexams(subExams);
    }
    public static Exam getExam(Long id) {
        Optional<Exam> exam = examDao.get(id);
        return exam.orElseGet(
                () -> new Exam());
    }

    private static void updateExam(Exam exam) {
        //find User TO BE replaced
        Exam examToBeReplaced=getExam(88L);
        Exam newExam=new Exam().setName("EAMCET").setDate(LocalDate.of(2000, 2,20))
                .setDescription("EAMCET").setTotal(91).setWeight(50);
        examDao.update(newExam);

    }

    private static void deleteExam(Exam exam2) {
        examDao.delete(exam2);
    }




    private static void saveExam(Exam exam1) {
        examDao.save(exam1);
    }

}


