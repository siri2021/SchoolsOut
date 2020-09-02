package be.intecbrussel.student.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue
    private Long id ;
    private String name ;
    @Lob
    private String description;
    private LocalDate date ;
    private int weight ;
    private int total ;
    @ManyToOne
    private Module module ;
}
