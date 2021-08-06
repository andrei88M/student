package com.example.dao;

import java.io.Serializable;

public abstract class AbstractDAO<Entity> extends EntityManagerMethods<Entity> implements DAO<Entity> {
    @Override
    public void persist(Entity t) {
        super.openManager();
        super.begin();
        super.persistEntity(t);
        super.commit();
        super.closeManager();
    }

    @Override
    public Entity find(Class<Entity> clazz, Serializable id) {
        Entity entity = null;
        super.openManager();
        super.begin();
        entity = super.findEntity(clazz, id);
        super.commit();
        super.closeManager();
        return entity;
    }

    @Override
    public void merge(Entity t) {
        super.openManager();
        super.begin();
        super.mergeEntity(t);
        super.commit();
        super.closeManager();
    }

}
