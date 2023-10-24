package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private String text;
    private List<Element> content;
    public Paragraph(String name){
        this.text = name;
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
        System.out.println("Paragraph: " + text);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
}
