package com.example.dao2;

import com.example.entity.Course;

public abstract class AbstractDAO<T, P> implements DAO<T, P> {
    Class getClazz(){
        T t = null;
        if (t instanceof Course){
            return Course.class;
        }
        System.out.println(t);
        return t.getClass();
    }
}
