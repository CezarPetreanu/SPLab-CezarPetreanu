package com.example.sp_lab2.services;

public interface Command<T> {
    T execute();
}
