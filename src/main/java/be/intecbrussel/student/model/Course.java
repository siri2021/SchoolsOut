package be.intecbrussel.student.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue()
    private Long id ;
    private  String name;
    @Lob
    private String description ;
    private String code;
   private String imageURL ;
   private boolean active;
    @OneToMany(mappedBy = "course")
    private List<Module> modules;



}
