package com.example.dao;

import com.example.entity.*;

public abstract class AbstractEntityDAO<Entity> extends AbstractDAO<Entity>{
    @Override
    public void remove(Entity t) {
        if (t instanceof Course) {
            Course course = (Course) t;
            super.openManager();
            super.begin();
            course = (Course) super.findEntity(Course.class, course.getId());
            super.removeEntity(course);
            super.commit();
            super.closeManager();
        } else if (t instanceof Student) {
            Student student = (Student) t;
            super.openManager();
            super.begin();
            student = (Student) super.findEntity(Course.class, student.getId());
            super.removeEntity(student);
            super.commit();
            super.closeManager();
        } else if (t instanceof Teacher) {
            Teacher teacher = (Teacher) t;
            super.openManager();
            super.begin();
            teacher = (Teacher) super.findEntity(Course.class, teacher.getId());
            super.removeEntity(teacher);
            super.commit();
            super.closeManager();
        }
    }
}
