package com.example.sp_lab2.models;

public interface Visitor {
    public void visitBook(Book book);
    public void visitSection(Section section);
    public void visitTableOfContents(TableOfContents toc);
    public void visitParagraph(Paragraph paragraph);
    public void visitImageProxy(ImageProxy imageProxy);
    public void visitImage(Image image);
    public void visitTable(Table table);
}
