package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private String text;
    private List<Element> content;
    private AlignStrategy alignment;
    public Paragraph(String name){
        this.text = name;
        this.content = new ArrayList<>();
        alignment = null;
    }
    public void addContent(Element element){
        this.content.add(element);
    }
    public Element getContent(int index){
        return content.get(index);
    }
    public void removeContent(Element element){content.remove(element);}
    public void setAlignStrategy(AlignStrategy newAlignment){
        this.alignment = newAlignment;
    }
    public void print(){
        if(alignment != null)
            alignment.render();
        System.out.println("Paragraph: " + text);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
}
