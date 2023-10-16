package com.example.sp_lab2;

import java.util.List;
import java.util.ArrayList;

public class Chapter {
    private String name;
    private List<Subchapter> subchapters;
    public Chapter(String name){
        this.name = name;
    }
    public int addSubchapter(String subchapterTitle){
        Subchapter subchapter = new Subchapter(subchapterTitle);
        this.subchapters.add(subchapter);
        return subchapters.indexOf(subchapter);
    }
    public Subchapter getSubchapter(int index){
        return subchapters.get(index);
    }
    public void print(){
        System.out.println(name);
        for(Subchapter subch:subchapters){
            subch.print();
        }
    }
}
