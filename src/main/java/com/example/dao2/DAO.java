package com.example.dao2;

import java.util.List;
import java.util.Map;

public interface DAO<T, P>{
    void save(T t);
    T get(P id);
    Map<P, T> getALL();
    void update(T t);
    void delete(P p);
}
