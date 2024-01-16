package com.example.sp_lab2.services;

public class AlignRight implements AlignStrategy{
    public void render(String text){
        System.out.println(">"+text);
    }
}
