package be.intecbrussel.student;

import be.intecbrussel.student.model.Exam;
import be.intecbrussel.student.model.GENDER;
import be.intecbrussel.student.model.Grade;
import be.intecbrussel.student.model.Person;
import be.intecbrussel.student.repos.GradeDao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public class GradeApplication {

        private static GradeDao gradeDao=new GradeDao();

        // standard constructors

        public static void main(String[] args) {
            saveGrade(new Grade().setAbsent(false).setInternalComment("firstRANK").setComment("ULTIMATE")
                    .setGradeValue(BigDecimal.valueOf(100)).setDate(LocalDate.of(2020,6,22))
                    .setAbsent(false).setComment("EXCELLENT")
                    .setPerson(new Person().setFirstName("CHETANA").setFamilyName("MISHRA").setGender(GENDER.FEMALE))
                    .setExam(new Exam().setName("SAT").setDate(LocalDate.of(2019,12,31))));
      //     Grade grade1=getGrade(22L);
        // System.out.println(grade1);
          //  updateCourse(grade1);

        //   deleteCourse(getGrade(24l));
            //getAllUsers().forEach(user -> System.out.println(user.getName()));
        }

        public static Grade getGrade(Long id) {
            Optional<Grade> course = gradeDao.get(id);
            return course.orElseGet(
                    () -> new Grade());
        }

        public static void updateCourse(Grade gradeToBeUpdated) {
            //find course TO BE replacedse
                    Grade gradeToBeReplaced=getGrade(gradeToBeUpdated.getId());
            Grade newGrade=new Grade().setDate(LocalDate.of(2000,9,19))
                    .setPerson(new Person().setFirstName("praseeta")) ;
            gradeDao.update(newGrade);



        }

        public static void saveGrade(Grade grade) {
            gradeDao.save(grade);
        }

        public static void deleteCourse(Grade grade) {
            gradeDao.delete(grade);
        }

    }

//new Exam().setModule(new Module().setName("Streams").setDescription("functional programming")).setDate(LocalDate.of(2021, 11,10))
  //      .setName("OCP888").setDescription("online").setWeight(75).setTotal(90)