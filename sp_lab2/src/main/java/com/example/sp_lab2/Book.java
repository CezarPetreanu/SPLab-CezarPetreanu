package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Element> content;
    public Book(String title){
        this.title = title;
        this.content = new ArrayList<>();
    }

    public void addAuthor(Author author){
        this.author = author;
    }
    public void addContent(Element element){
        this.content.add(element);
    }
    public Element getContent(int index){
        return content.get(index);
    }
    public void print(){
        System.out.println("Title: "+title);
        if(author != null){
            author.print();
        }
        else
            System.out.print("Author unspecified");
        for(Element element:content){
            element.print();
        }
    }
}
