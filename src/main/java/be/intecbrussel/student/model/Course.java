package be.intecbrussel.student.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue()
    private Integer id ;
    private  String name;
    @Lob
    private String description ;
    private String code;
   private String imageURL ;
   private Boolean active;
    @OneToMany(mappedBy = "course")
    private List<Module> modules;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Course setCode(String code) {
        this.code = code;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Course setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public Boolean isActive() {
        return active;
    }

    public Course setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public List<Module> getModules() {
        return modules;
    }

    public Course setModules(List<Module> modules) {
        this.modules = modules;
        return this;
    }




}
