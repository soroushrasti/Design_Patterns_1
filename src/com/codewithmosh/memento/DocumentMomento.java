package com.codewithmosh.memento;

public class DocumentMomento {
    private String content;
    private String fontName;
    private int fontSize;

    public  DocumentMomento(String content, String fontname, init fontsize){
        this.content=content;
        this.fontName=fontname;
        this.fontSize=fontsize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

}
