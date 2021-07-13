package com.example.dao2;

import com.example.entity.Course;
import com.example.util.JPA;

import javax.persistence.EntityManager;
import java.util.Map;

public class EntityDAO<T, P> extends AbstractDAO<T, P> implements DAO<T, P> {

    @Override
    public void save(T t) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public T get(P id) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        T t = (T) manager.find(getClazz(), id);
        manager.getTransaction().commit();
        manager.close();
        return t;
    }

    @Override
    public Map<P, T> getALL() {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        Map<P, T> map = (Map<P, T>) manager.getProperties();
        manager.getTransaction().commit();
        manager.close();
        return map;
    }

    @Override
    public void update(T t) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(t);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(P id) {
        EntityManager manager = JPA.getEntityManager();
        manager.getTransaction().begin();
        Object obj =  manager.find(getClazz(), id);
        manager.remove(obj);
        manager.getTransaction().commit();
        manager.close();
    }
}
