package com.example.sp_lab2;

import com.example.sp_lab2.difexample.ClientComponent;
import com.example.sp_lab2.difexample.SingletonComponent;
import com.example.sp_lab2.difexample.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.sp_lab2.models.*;
import com.example.sp_lab2.services.*;



@SpringBootApplication
public class SpLab2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpLab2Application.class, args);
    }
}
