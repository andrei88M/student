package com.example;

import com.example.dao.DAO;
import com.example.dao3.StudentDAO;
import com.example.entity.*;
import com.example.util.JPA;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        com.example.dao3.DAO<Student> dao = new StudentDAO<>();
        dao.persist(new Student());
        Student student = dao.find(Student.class, 1);
        System.out.println(student);
        student.setAge(44);
        dao.merge(student);
        dao.remove(student);
        JPA.close();
    }

    public static void saveEntity() {
        DAO dao = new DAO();
        for (int i = 0; i < 10; i++) {
            Teacher teacher = new Teacher();
            teacher.setName("teacher" + i);
            teacher.setSurname("teacher" + i);
            dao.save(teacher);
            Task task = new Task();
            task.setTasks("task" + i);
            dao.save(task);
            Course course = new Course();
            course.setName("course" + i);
            course.setTime("time" + i + i);
            course.setPrice(1000 + i);
            dao.save(course);
        }
    }
}
