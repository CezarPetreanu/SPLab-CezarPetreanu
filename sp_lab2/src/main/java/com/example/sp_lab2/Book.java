package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters;

    public Book(String title){
        this.title = title;
        this.chapters = new ArrayList<>();
    }

    public void addAuthor(Author author){
        this.author = author;
    }
    public int addChapter(String chapterTitle){
        Chapter chapter = new Chapter(chapterTitle);
        this.chapters.add(chapter);
        return chapters.indexOf(chapter);
    }
    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void print(){
        System.out.println("Title: "+title);
        if(author != null){
            author.print();
        }
        else
            System.out.print("Author unspecified");
        for(Chapter ch:chapters){
            ch.print();
        }
    }
}
