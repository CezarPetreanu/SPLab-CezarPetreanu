package com.example.sp_lab2;

public class Paragraph extends Element{
    private String text;
    public Paragraph(String text){
        this.text = text;
    }
    public void print(){
        System.out.println(text);
    }
}
