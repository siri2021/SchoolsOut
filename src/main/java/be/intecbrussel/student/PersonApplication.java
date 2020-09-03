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
        Person person1=new Person().setFirstName("Shravan").setFamilyName("Kulkarni").setGender(GENDER.MALE);
        System.out.println(person1);
        savePerson(person1);
        Person person2= getPerson(9);
        deletePerson(person2);
        //updatePerson(getPerson(2));


    }

    private static void deletePerson(Person person) {
        personDao.delete(person);
    }

    private static Person getPerson(Integer id) {
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
        Person newPerson=new Person().setFirstName("Tanmay").setFamilyName("Kulkarni").setGender(GENDER.MALE);

        personDao.update(newPerson);
        }



//new Course().setName("MBA").setActive(true).setDescription("management")
            //            .setCode("IIM_A")

    //.setCourse(new Course().setName("Medicine").setActive(true).setCode("ANATOMY112").setDescription("year1")) ;
}
