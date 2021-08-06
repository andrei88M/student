package com.example.dao3;

import java.io.Serializable;

public class StudentDAO<Entity> extends AbstractDAOStudent<Entity> implements DAO<Entity> {

    @Override
    public void persist(Entity t) {
        super.persist(t);
    }

    @Override
    public Entity find(Class<Entity> clazz, Serializable id) {
        return super.find(clazz, id);
    }

    @Override
    public void merge(Entity t) {
        super.merge(t);
    }

    @Override
    public void remove(Entity t) {
        super.remove(t);
    }
}
