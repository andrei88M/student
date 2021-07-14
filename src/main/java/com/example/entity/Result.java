package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
