package com.example.sp_lab2;

public interface Element {
    public void print();
    public void addContent(Element element);
    public void removeContent(Element element);
    public Element getContent(int index);
}
