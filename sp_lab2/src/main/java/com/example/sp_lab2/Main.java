package com.example.sp_lab2;

import com.example.sp_lab2.models.*;
import com.example.sp_lab2.services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Book c = new Book("Carte");
        Section cap1 = new Section("Capitolul 1");
        c.addContent(cap1);
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addContent(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addContent(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addContent(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addContent(p4);

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        c.accept(new RenderContentVisitor());
    }
}
