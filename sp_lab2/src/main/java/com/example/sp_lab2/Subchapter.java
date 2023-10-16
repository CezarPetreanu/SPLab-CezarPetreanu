package com.example.sp_lab2;

import java.util.List;
import java.util.ArrayList;

public class Subchapter {
    private String name;
    private List<Element> elements;
    public Subchapter(String name){
        this.name = name;
    }
    public int addParagraph(String paragraphText){
        Paragraph paragraph = new Paragraph(paragraphText);
        this.elements.add(paragraph);
        return elements.indexOf(paragraph);
    }
    public int addImage(String imageName){
        Image image = new Image(imageName);
        this.elements.add(image);
        return elements.indexOf(image);
    }
    public int addTable(String tableTitle){
        Table table = new Table(tableTitle);
        this.elements.add(table);
        return elements.indexOf(tableTitle);
    }
    public Element getElement(int index){
        return elements.get(index);
    }
    public void print(){
        System.out.println(name);
        for(Element elem:elements){
            elem.print();
        }
    }
}
