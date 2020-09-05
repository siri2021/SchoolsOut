package be.intecbrussel.student.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String familyName;
    @Enumerated(EnumType.STRING)
    private GENDER gender;
    @OneToOne
    private Course courseActive;

    @OneToMany
    private List<Course>  courseHistory;

    public void setId(Long id) {
        this.id = id;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }



    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Person setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public GENDER getGender() {
        return gender;
    }

    public Person setGender(GENDER gender) {
        this.gender = gender;
        return this;
    }

    public Course getCourseActive() {
        return courseActive;
    }

    public Person setCourseActive(Course course) {
        this.courseActive = course;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", gender=" + gender +
                ", courseActive=" + courseActive +
                ", courseHistory=" + courseHistory +
                '}';
    }
}
