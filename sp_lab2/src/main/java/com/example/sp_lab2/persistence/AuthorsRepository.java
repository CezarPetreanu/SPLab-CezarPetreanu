package com.example.sp_lab2.persistence;

import com.example.sp_lab2.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}