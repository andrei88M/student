package com.example.dao;

import com.example.bd.BD;
import com.example.entity.Course;
import com.example.util.JPA;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;

public class CourseImpl implements DAO<Course, Integer> {
    @Override
    public void save(Course course) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        course.setId(BD.generateIdCourse());
        manager.persist(course);
        BD.addCourse(course.getId(), course);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public Course get(Integer id) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        Course course = manager.find(Course.class, id);
        manager.getTransaction().commit();
        manager.close();
        return course;
    }

    @Override
    public List<Course> getALL() {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        Map<String, Object> map = manager.getProperties();

        return null;
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {

    }
}
