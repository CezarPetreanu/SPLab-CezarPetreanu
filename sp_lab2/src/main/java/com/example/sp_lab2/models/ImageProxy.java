package com.example.sp_lab2.models;

import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element{
    private String url;
    private List<Element> content;
    //private Dimension dim;
    private Image realImg;

    /*
    public ImageProxy(String url, Dimension dim){
        this.url = url;
        this.dim = dim;
    }
    */
    public ImageProxy(String url){
        this.url = url;
        this.content = new ArrayList<>();
        this.realImg = null;
    }
    public Image loadImage(){
        if(realImg == null){
            realImg = new Image(url);
        }
        return realImg;
    }


    public void addContent(Element element){ this.content.add(element); }
    public Element getContent(int index){
        return content.get(index);
    }

    public void removeContent(Element element){content.remove(element);}
    public void print(){
        System.out.println("ImageProxy: " + url);
        if(!content.isEmpty())
            for(Element element:content){
                element.print();
            }
    }
    public void accept(Visitor visitor){
        visitor.visitImageProxy(this);
    }
}
