package com.example.dao;

import com.example.entity.Teacher;

public abstract class AbstractTeacherDAO extends AbstractDAO<Teacher>{
    @Override
    public void remove(Teacher t) {
        super.openManager();
        super.begin();
        Teacher teacher = super.findEntity(Teacher.class, t.getId());
        super.removeEntity(teacher);
        super.commit();
        super.closeManager();
    }
}
