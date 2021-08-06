package com.example.dao;

import com.example.entity.Student;

public abstract class AbstractStudentDAO extends AbstractDAO<Student> {
    @Override
    public void remove(Student t) {
        super.openManager();
        super.begin();
        Student student = super.findEntity(Student.class, t.getId());
        super.removeEntity(student);
        super.commit();
        super.closeManager();
    }
}
