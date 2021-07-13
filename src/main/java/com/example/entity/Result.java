package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int appraisal;

    @Column
    private String review;

    @OneToOne(mappedBy = "result")
    private Course course;

    public Result() {
    }

    public Result(int id, int appraisal, String review, Course course) {
        this.id = id;
        this.appraisal = appraisal;
        this.review = review;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int appraisal) {
        this.appraisal = appraisal;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return id == result.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", appraisal=" + appraisal +
                ", review='" + review + '\'' +
                '}';
    }
}
