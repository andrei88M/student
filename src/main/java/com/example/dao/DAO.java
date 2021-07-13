package com.example.dao;

import java.util.List;

public interface DAO<T, P>{
    void save(T t);
    T get(P id);
    List<T> getALL();
    void update(T t);
    void delete(T t);
}
