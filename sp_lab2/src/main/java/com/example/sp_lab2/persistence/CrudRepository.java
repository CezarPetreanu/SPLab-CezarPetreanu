package com.example.sp_lab2.persistence;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface CrudRepository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    T save(T entity);
    void deleteById(ID id);
}