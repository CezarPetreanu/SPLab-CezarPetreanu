package com.example.sp_lab2.models;
import jakarta.persistence.*;
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
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }
}
