package be.intecbrussel.student;

import be.intecbrussel.student.model.Course;
import be.intecbrussel.student.model.GENDER;
import be.intecbrussel.student.model.Person;
import be.intecbrussel.student.model.User;
import be.intecbrussel.student.service.PersonDao;

import java.util.Optional;

public class PersonApplication {
    private static PersonDao personDao=new PersonDao();

    public static void main(String[] args) {
        Person person1=new Person().setFirstName("Prasanna").setFamilyName("Kulkarni").setGender(GENDER.MALE)
                .setCourse(new Course().setName("MBA").setActive(true).setDescription("management")
                        .setCode("IIM_A"));
        System.out.println(person1);
        savePerson(person1);
      //  Person person2= getPerson(1);
        //deletePerson(person2);
        //updatePerson(getPerson(2));


    }

    private static void deletePerson(Person person) {
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
        }




}
