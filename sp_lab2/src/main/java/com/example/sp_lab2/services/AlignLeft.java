package com.example.sp_lab2.services;

public class AlignLeft implements AlignStrategy{
    public void render(String text){
        System.out.println(text+"<");
    }
}
