package be.intecbrussel.student;

import be.intecbrussel.student.model.Exam;
import be.intecbrussel.student.model.Module;
import be.intecbrussel.student.model.User;
import be.intecbrussel.student.service.ExamDao;

import java.time.LocalDate;
import java.util.Optional;

public class ExamApplication {
    private static ExamDao examDao=new ExamDao();

    public static void main(String[] args) {
        Exam exam1=new Exam().setDate(LocalDate.of(2020, 03,12))
                .setName("OCA839").setDescription("exam during corona").setWeight(40)
                .setTotal(88);
        System.out.println(exam1);
        saveExam(exam1);
        Exam exam2= getExam(1);

        deleteExam(exam2);
        updateExam(getExam(3));


    }
    public static Exam getExam(Integer id) {
        Optional<Exam> exam = examDao.get(id);
        return exam.orElseGet(
                () -> new Exam());
    }

    private static void updateExam(Exam exam) {
        //find User TO BE replaced
        Exam examToBeReplaced=getExam(1);
        Exam newExam=new Exam().setDate(LocalDate.of(2018, 12,21))
                .setDescription("CAT").setTotal(91).setWeight(50);
        examDao.update(newExam);

    }

    private static void deleteExam(Exam exam2) {
        examDao.delete(exam2);
    }

    private static Exam getExam(int id) {
        Optional<Exam> exam = examDao.get(id);
        return exam.orElseGet(
                () -> new Exam());
    }

    private static void saveExam(Exam exam1) {
        examDao.save(exam1);
    }

}
//.setModule(new Module().setDescription("semster1").setName("java"))