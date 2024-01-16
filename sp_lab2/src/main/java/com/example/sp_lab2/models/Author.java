package com.example.sp_lab2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Author(String name){
        this.name = name;
    }

    public Author() {

    }

    public void print(){
        System.out.println("Author: "+name);
    }
}
