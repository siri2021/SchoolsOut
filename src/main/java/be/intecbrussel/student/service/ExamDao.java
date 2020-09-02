package be.intecbrussel.student.service;

import be.intecbrussel.student.model.Course;
import be.intecbrussel.student.model.Exam;
import be.intecbrussel.student.model.GENDER;
import be.intecbrussel.student.model.Person;
//need to make changes
import java.util.Optional;

public class ExamDao {
    private static ExamDao examDao=new ExamDao();

    public static void main(String[] args) {
        Exam exam1=new Exam(). ;
        System.out.println(exam1);
        saveExam(exam1);
        Exam exam2= getExam(1);

        deleteExam(exam2);
        updateExam(getExam(3);


    }

    private static void updateExam(Exam exam) {
    }

    private static void deleteExam(Exam exam2) {
    }

    private static Exam getExam(int i) {
        return null;
    }

    private static void saveExam(Exam exam1) {
    }

  /*  private static void deletePerson(Person person) {
        personDao.delete(person);
    }

    private static Person getPerson(long id) {
        Optional<Person> user = personDao.get(id);
        return user.orElseGet(
                () -> new Person());
    }

    private static void savePerson(Person person) {
        personDao.save(person);
    }






    public static void updatePerson(Person personToBeUpdated) {
        //find User TO BE replaced
        Person PersonToBeReplaced=getPerson(2);
        Person newPerson=new Person().setFirstName("Tanmay").setFamilyName("Kulkarni").setGender(GENDER.MALE)
                .setCourse(new Course().setName("Medicine").setActive(true).setCode("ANATOMY112").setDescription("year1")) ;
        personDao.update(newPerson);
    }*/



}
