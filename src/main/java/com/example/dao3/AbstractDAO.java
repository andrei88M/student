package com.example.dao3;

import java.io.Serializable;

public abstract class AbstractDAO<Entity> extends EntityManagerMethods<Entity> {

    public void persist(Entity t) {
        super.openManager();
        super.begin();
        super.persistManager(t);
        super.commit();
        super.closeManager();
    }

    public Entity find(Class<Entity> clazz, Serializable id) {
        Entity entity = null;
        super.openManager();
        super.begin();
        entity = super.findManager(clazz, id);
        super.commit();
        super.closeManager();
        return entity;
    }

    public void merge(Entity t) {
        super.openManager();
        super.begin();
        super.mergeManager(t);
        super.commit();
        super.closeManager();
    }

    abstract void remove(Entity t);
}
