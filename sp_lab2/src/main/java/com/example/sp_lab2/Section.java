package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String name;
    private List<Element> content;
    public Section(String name){
        this.name = name;
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
        System.out.println(name);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
}
