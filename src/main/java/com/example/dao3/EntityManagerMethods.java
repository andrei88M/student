package com.example.dao3;

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

    public void persistManager(Entity t) {
        entityManager.persist(t);
    }

    public Entity findManager(Class clazz, Serializable id) {
        Entity entity = (Entity) entityManager.find(clazz, id);
        return entity;
    }

    public void mergeManager(Entity entity){
        entityManager.merge(entity);
    }

    public void removeManager(Object obj){
        entityManager.remove(obj);
    }


}
