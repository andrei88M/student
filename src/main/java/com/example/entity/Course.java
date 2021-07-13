package com.example.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table
public class Course {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String time;

    @Column
    private double price;

    @ManyToMany(mappedBy = "courseSet")
    private Set<Student> studentSet;

    @ManyToOne
    //@JoinColumn(name="teacher_id", nullable=false)
    private Teacher teacher;

    @OneToOne(cascade = CascadeType.ALL)
    private Task task;

    @OneToOne(cascade = CascadeType.ALL)
    private Result result;


    public Course() {
    }

    public Course(int id, String name, String time, double price, Set<Student> studentSet, Teacher teacher, Task task, Result result) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
        this.studentSet = studentSet;
        this.teacher = teacher;
        this.task = task;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
