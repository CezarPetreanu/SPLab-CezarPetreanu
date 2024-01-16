package com.example.sp_lab2.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section implements Element{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(targetEntity = BaseElement.class)
    private List<Element> content;
    public Section(String name){
        this.name = name;
        this.content = new ArrayList<>();
    }

    public Section() {

    }

    public void addContent(Element element){
        this.content.add(element);
    }
    public Element getContent(int index){
        return content.get(index);
    }

    public void removeContent(Element element){content.remove(element);}
    public void print(){
        System.out.println(name);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
    public void accept(Visitor visitor){
        visitor.visitSection(this);
    }
}
