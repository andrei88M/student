package com.example.servise;

import com.example.dao.DAO;
import com.example.entity.Course;
import com.example.entity.Student;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.Set;

public class Relations {
    public static void manyToMany(Student student, Course course) {
        DAO dao = new DAO();
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(course);
        student.setCourseSet(courseSet);
        course.setStudentSet(studentSet);
        dao.save(student);
    }
}
