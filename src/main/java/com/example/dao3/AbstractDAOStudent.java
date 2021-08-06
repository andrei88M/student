package com.example.dao3;

import com.example.entity.Student;

public abstract class AbstractDAOStudent<Entity> extends AbstractDAO<Entity> {
    @Override
    void remove(Entity t) {
        if (t instanceof Student) {
            delete((Student) t);
        }
    }
    private void delete(Student student){
        super.openManager();
        super.begin();
        Object obj = super.findManager(student.getClass(),student.getId());
        super.removeManager(obj);
        super.commit();
        super.closeManager();
    }
}
