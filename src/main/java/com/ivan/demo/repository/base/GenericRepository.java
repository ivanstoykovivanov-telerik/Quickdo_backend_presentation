package com.ivan.demo.repository.base;

import java.util.List;

public interface GenericRepository<T> {
    List<T> listAll();

    T findById(int id);

    void create(T object);

    void update(int id, T object);

    void delete(int id);
}
