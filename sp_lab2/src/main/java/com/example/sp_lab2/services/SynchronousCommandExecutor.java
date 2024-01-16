package com.example.sp_lab2.services;

import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Component("synchronousCommandExecutor")
public class SynchronousCommandExecutor implements CommandExecutor {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Override
    public <T> T execute(Command<T> command) {
        try {
            return command.execute();
        } catch (Exception e) {
            // Handle exceptions
            throw new RuntimeException(e);
        }
    }
}