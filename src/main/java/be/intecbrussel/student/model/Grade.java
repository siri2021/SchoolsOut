package be.intecbrussel.student.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="grade")
public class Grade {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Person person;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Exam exam;
    private BigDecimal gradeValue;
    private String comment;
    private String internalComment ;
    private Boolean  absent;
    private Boolean  postponed;
    private LocalDate date;


    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Grade setPerson(Person person) {
        this.person = person;
        return this;
    }

    public Exam getExam() {
        return exam;
    }

    public Grade setExam(Exam exam) {
        this.exam = exam;
        return this;
    }

    public BigDecimal getGradeValue() {
        return gradeValue;
    }

    public Grade setGradeValue(BigDecimal gradeValue) {
        this.gradeValue = gradeValue;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Grade setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getInternalComment() {
        return internalComment;
    }

    public Grade setInternalComment(String internalComment) {
        this.internalComment = internalComment;
        return this;
    }

    public Boolean getAbsent() {
        return absent;
    }

    public Grade setAbsent(Boolean absent) {
        this.absent = absent;
        return this;
    }

    public Boolean getPostponed() {
        return postponed;
    }

    public Grade setPostponed(Boolean postponed) {
        this.postponed = postponed;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Grade setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", person=" + person +
                ", exam=" + exam +
                ", gradeValue=" + gradeValue +
                ", comment='" + comment + '\'' +
                ", internalComment='" + internalComment + '\'' +
                ", absent=" + absent +
                ", postponed=" + postponed +
                ", date=" + date +
                '}';
    }
}
