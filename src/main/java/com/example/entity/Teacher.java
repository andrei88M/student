package com.example.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table
public class Teacher {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @OneToMany(mappedBy = "teacher")
    private Set<Course> courseSet;

    public Teacher() {
    }

    public Teacher(int id, String name, String surname, Set<Course> courseSet) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.courseSet = courseSet;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name) && Objects.equals(surname, teacher.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                +'}';
    }
}
