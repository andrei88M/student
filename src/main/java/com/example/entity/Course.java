package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
