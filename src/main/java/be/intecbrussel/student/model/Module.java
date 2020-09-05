package be.intecbrussel.student.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "module")
public class Module {


     @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description ;
    @ManyToOne(cascade = CascadeType.PERSIST)
    public Course course ;

    @OneToMany(mappedBy = "module")
    private List<Exam> exams ;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Module setName(String name) {
        this.name = name;
        return this;

    }

    public String getDescription() {
        return description;
    }

    public Module setDescription(String description) {
        this.description = description;
        return this;

    }

    public Course getCourse() {
        return course;
    }

    public Module setCourse(Course course) {
        this.course = course;
        return this;

    }

    public List<Exam> getExams() {
        return exams;
    }

    public Module setExams(List<Exam> exams) {
        this.exams = exams;
        return this;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", course=" + course +
                ", exams=" + exams +
                '}';
    }
}
