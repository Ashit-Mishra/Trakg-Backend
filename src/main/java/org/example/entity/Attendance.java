package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;
    @Min(0)
    private Integer classAttended;
    @Min(0)
    private Integer totalClasses;

    public Attendance(Long id, Student student, Subject subject, Integer classAttended, Integer totalClasses) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.classAttended = classAttended;
        this.totalClasses = totalClasses;
    }

    public Attendance() {
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public Integer getClassAttended() {
        return classAttended;
    }

    public Integer getTotalClasses() {
        return totalClasses;
    }
}
