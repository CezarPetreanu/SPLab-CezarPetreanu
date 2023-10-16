package com.example.sp_lab2;

public class Image extends Element{
    private String name;
    public Image(String name){
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}
