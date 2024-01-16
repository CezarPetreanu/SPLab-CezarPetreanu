package com.example.sp_lab2.services;

import org.springframework.stereotype.Component;

import java.util.concurrent.*;
@Component("asynchronousCommandExecutor")
public class AsynchronousCommandExecutor implements CommandExecutor {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Override
    public <T> T execute(Command<T> command) {
        try {
            Future<T> future = executorService.submit(command::execute);
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            // Handle exceptions
            throw new RuntimeException(e);
        }
    }
}