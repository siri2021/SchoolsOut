package be.intecbrussel.student;

import be.intecbrussel.student.model.Course;
import be.intecbrussel.student.model.User;
import be.intecbrussel.student.service.CourseDao;
import be.intecbrussel.student.service.UserDao;

import java.util.Optional;

public class CourseApplication {
    private static CourseDao courseDao=new CourseDao();

    // standard constructors

    public static void main(String[] args) {
        saveCourse(new Course().setName("Medicine").setActive(true).setCode("ANATOMY112").setDescription("year1") );
        Course course1=getCourse(1);
        System.out.println(course1);
        updateCourse(course1);

        deleteCourse(getCourse(1));
        //getAllUsers().forEach(user -> System.out.println(user.getName()));
    }

    public static Course getCourse(Integer id) {
        Optional<Course> course = courseDao.get(id);
        return course.orElseGet(
                () -> new Course());
    }

    public static void updateCourse(Course courseToBeUpdated) {
        //find course TO BE replaced
        Course  CourseToBeReplaced=getCourse(courseToBeUpdated.getId());
        Course newCourse=new Course().setName("Masres").setCode("stats#1").setDescription("statistics for MachineLEARNING").setActive(true);
                courseDao.update(newCourse);
    }

    public static void saveCourse(Course course) {
        courseDao.save(course);
    }

    public static void deleteCourse(Course course) {
        courseDao.delete(course);
    }

}
