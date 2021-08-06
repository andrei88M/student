package com.example.dao;

import com.example.entity.Course;

public abstract class AbstractCourseDAO extends AbstractDAO<Course>{
    @Override
    public void remove(Course t) {
        super.openManager();
        super.begin();
        Course course = super.findEntity(Course.class, t.getId());
        super.removeEntity(course);
        super.commit();
        super.closeManager();
    }
}
