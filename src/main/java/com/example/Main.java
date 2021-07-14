package com.example;

import com.example.dao.DAO;
import com.example.entity.*;
import com.example.servise.Relations;
import com.example.util.JPA;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        Student student = new Student();
        student.setName("andrey");
        student.setSurname("Mikhalchuk");
        student.setAge(54);

        Course course = new Course();
        course.setName("asa");
        Course course2 = new Course();
        course.setName("asawee");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(course);
        courseSet.add(course2);

        student.setCourseSet(courseSet);
        course.setStudentSet(studentSet);
        dao.save(student);

        Student student1 = (Student) dao.get(Student.class, 1);
        Set<Course> set = student1.getCourseSet();
        System.out.println("-----------");
        set.forEach(x-> System.out.println(x.getId()));
        System.out.println(set.size());
        System.out.println(student1);
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
