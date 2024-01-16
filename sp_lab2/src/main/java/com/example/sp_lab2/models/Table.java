package com.example.sp_lab2.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Table implements Element{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(targetEntity = BaseElement.class)
    private List<Element> content;
    public Table(String title) {
        this.title = title;
        this.content = new ArrayList<>();
    }

    public Table() {

    }

    public void addContent(Element element){
        this.content.add(element);
    }
    public Element getContent(int index){
        return content.get(index);
    }

    public void removeContent(Element element){content.remove(element);}
    public void print(){
        System.out.println("Table: " + title);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
    public void accept(Visitor visitor){
        visitor.visitTable(this);
    }
}
