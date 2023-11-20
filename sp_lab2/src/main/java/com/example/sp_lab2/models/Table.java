package com.example.sp_lab2.models;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element{
    private String title;
    private List<Element> content;
    public Table(String title) {
        this.title = title;
        this.content = new ArrayList<>();
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
