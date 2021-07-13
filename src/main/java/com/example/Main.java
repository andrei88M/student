package com.example;

import com.example.bd.BD;
import com.example.dao2.EntityDAO;
import com.example.entity.*;
import com.example.util.JPA;

public class Main {
    public static void main(String[] args) {
         EntityDAO<Course,Integer> dao = new EntityDAO<>();
        Course course = new Course();
        course.setId(BD.generateIdCourse());
        dao.save(course);
        dao.update(course);
        dao.get(course.getId());
        JPA.close();

        System.out.println(Course.class);
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
