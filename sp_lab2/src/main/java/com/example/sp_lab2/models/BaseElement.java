package com.example.sp_lab2.models;

import jakarta.persistence.*;

@Entity
@Inheritance
public abstract class BaseElement implements Element{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
