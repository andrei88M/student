package com.example.dao3;

import java.io.Serializable;

public interface DAO<Entity> {
    void persist(Entity t);
    Entity find(Class<Entity> clazz ,Serializable id);
    void merge(Entity t);
    void remove(Entity t);
}
