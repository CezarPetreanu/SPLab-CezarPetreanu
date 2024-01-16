package com.example.sp_lab2.services;

public interface CommandExecutor {
    <T> T execute(Command<T> command);
}