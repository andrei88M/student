package com.example.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Task {
    @Id
    private int id;

    @Column
    private String tasks;

    @OneToOne(mappedBy = "task")
    private Course course;

    public Task() {
    }

    public Task(int id, String tasks,Course course) {
        this.id = id;
        this.tasks = tasks;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", tasks='" + tasks + '\'' +
                ", course=" + course +
                '}';
    }
}
