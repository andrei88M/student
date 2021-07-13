package com.example;

import com.example.entity.*;
import com.example.util.JPA;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        Student student = new Student();
        student.setName("andrey");
        student.setSurname("Mikhalchuk");
        student.setAge(33);

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
