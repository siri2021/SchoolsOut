package be.intecbrussel.student.model;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String familyName;
    @Enumerated(EnumType.STRING)
    private GENDER gender;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", gender=" + gender +
                ", course=" + course +
                '}';
    }

    @ManyToOne
    private Course course;

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

    public Course getCourse() {
        return course;
    }

    public Person setCourse(Course course) {
        this.course = course;
        return this;
    }


}
