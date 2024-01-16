package com.example.sp_lab2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class SpringDataCrudRepositoryAdapter<T, ID> implements CrudRepository<T,ID> {

    private final JpaRepository<T, ID> jpaRepository;

    public SpringDataCrudRepositoryAdapter(JpaRepository<T, ID> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public T findById(ID id) {
        return jpaRepository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public T save(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        jpaRepository.deleteById(id);
    }
}