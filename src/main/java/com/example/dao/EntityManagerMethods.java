package com.example.dao;

import com.example.util.JPA;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class EntityManagerMethods<Entity> {
    private EntityManager entityManager;

    public void openManager() {
        entityManager = JPA.getEntityManager();
    }

    public void begin() {
        entityManager.getTransaction().begin();
    }

    public void commit() {
        entityManager.getTransaction().commit();
    }

    public void closeManager() {
        entityManager.close();
    }

    public void persistEntity(Entity t) {
        entityManager.persist(t);
    }

    public Entity findEntity(Class clazz, Serializable id) {
        Entity entity = (Entity) entityManager.find(clazz, id);
        return entity;
    }

    public void mergeEntity(Entity entity){
        entityManager.merge(entity);
    }

    public void removeEntity(Object obj){
        entityManager.remove(obj);
    }


}
