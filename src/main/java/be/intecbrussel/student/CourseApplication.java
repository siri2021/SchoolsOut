package be.intecbrussel.student;

import be.intecbrussel.student.model.Course;
import be.intecbrussel.student.repos.CourseDao;

import java.util.Optional;

public class CourseApplication {
    private static CourseDao courseDao=new CourseDao();

    // standard constructors

    public static void main(String[] args) {
       // saveCourse(new Course().setName("HOMOEOPATHY").setActive(true).setCode("ANATOMY112").setDescription("year1") );
        Course course1=getCourse(4L);
        System.out.println(course1);
      updateCourse(course1);

       // deleteCourse(getCourse(1l));
        //getAllUsers().forEach(user -> System.out.println(user.getName()));
    }

    public static Course getCourse(Long id) {
        Optional<Course> course = courseDao.get(id);
        return course.orElseGet(
                () -> new Course());
    }

    public static void updateCourse(Course courseToBeUpdated) {
        //find course TO BE replaced
        Course  CourseToBeReplaced=getCourse(courseToBeUpdated.getId());
        Course newCourse=new Course().setName("Masters").setCode("stats#1").setDescription("statistics for MachineLEARNING").setActive(true);
                courseDao.update(newCourse);
    }

    public static void saveCourse(Course course) {
        courseDao.save(course);
    }

    public static void deleteCourse(Course course) {
        courseDao.delete(course);
    }

}
