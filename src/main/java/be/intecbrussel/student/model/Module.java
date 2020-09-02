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
@ManyToOne
    public Course course ;


  @OneToMany(mappedBy = "module")
    private List<Exam> exams ;
}
