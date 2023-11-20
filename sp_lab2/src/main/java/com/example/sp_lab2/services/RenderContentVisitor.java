package com.example.sp_lab2.services;

import com.example.sp_lab2.models.*;

public class RenderContentVisitor implements Visitor{
    public void visitBook(Book book){
        book.print();
    };
    public void visitSection(Section section){
        section.print();
    };
    public void visitTableOfContents(TableOfContents toc){
        toc.print();
    };
    public void visitParagraph(Paragraph paragraph){
        paragraph.print();
    };
    public void visitImageProxy(ImageProxy imageProxy){
        imageProxy.print();
    };
    public void visitImage(Image image){
        image.print();
    };
    public void visitTable(Table table){
        table.print();
    };
}
