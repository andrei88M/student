package com.example;

import com.example.bd.BD;
import com.example.entity.*;
import com.example.util.JPA;

import javax.persistence.EntityManager;

public class DAO {
    public void save(Object obj) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(obj);
        manager.getTransaction().commit();
        manager.close();
    }

    public Object get(Class c1ass, int id) {
        Object obj;
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        obj = manager.find(c1ass, id);
        manager.getTransaction().commit();
        manager.close();
        return obj;
    }

    public void update(Object obj) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(obj);
        manager.getTransaction().commit();
        manager.close();
    }

    public void delete(Object obj) {
        if (obj instanceof Course) {
            Course course = (Course) obj;
            EntityManager manager = JPA.getEntityManager();
            manager.getTransaction().begin();
            course = manager.find(Course.class, course.getId());
            manager.remove(course);
            manager.getTransaction().commit();
            manager.close();
        } else if (obj instanceof Result) {
            Result result = (Result) obj;
            EntityManager manager = JPA.getEntityManager();
            manager.getTransaction().begin();
            result = manager.find(Result.class, result.getId());
            manager.remove(result);
            manager.getTransaction().commit();
            manager.close();
        } else if (obj instanceof Student) {
            Student student = (Student) obj;
            EntityManager manager = JPA.getEntityManager();
            manager.getTransaction().begin();
            student = manager.find(Student.class, student.getId());
            manager.remove(student);
            manager.getTransaction().commit();
            manager.close();
        } else if (obj instanceof Task) {
            Task task = (Task) obj;
            EntityManager manager = JPA.getEntityManager();
            manager.getTransaction().begin();
            task = manager.find(Task.class, task.getId());
            manager.remove(task);
            manager.getTransaction().commit();
            manager.close();
        } else if (obj instanceof Teacher) {
            Teacher teacher = (Teacher) obj;
            EntityManager manager = JPA.getEntityManager();
            manager.getTransaction().begin();
            teacher = manager.find(Teacher.class, teacher.getId());
            manager.remove(teacher);
            manager.getTransaction().commit();
            manager.close();
        }
    }
}
