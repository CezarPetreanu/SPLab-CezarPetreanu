package com.example.sp_lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String url;
    private List<Element> content;
    public Image(String url){
        this.url = url;
        this.content = new ArrayList<>();

        // Simulate loading
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void addContent(Element element){ this.content.add(element); }
    public Element getContent(int index){
        return content.get(index);
    }
    public void removeContent(Element element){content.remove(element);}
    public void print(){
        System.out.println("Image: " + url);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
}
