package com.example.dao3;

import com.example.entity.Course;
import com.example.entity.Student;

public abstract class AbstractDAOCourse<Entity> extends AbstractDAO<Entity> {
    @Override
    void remove(Entity t) {
        if (t instanceof Course){
            delete((Course) t);
        }
    }

    private void delete(Course course) {
        super.openManager();
        super.begin();
        Object obj = super.findManager(course.getClass(), course.getId());
        super.removeManager(obj);
        super.commit();
        super.closeManager();
    }
}
