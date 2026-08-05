package com.designpatterns.creational.prototype;

/**
 * Concrete prototype copied through a copy constructor.
 */
public class Document implements Prototype<Document> {

    private String title;
    
    private String content;
    private String format;

    public Document(String title, String content, String format) {
        this.title = title;
        this.content = content;
        this.format = format;
    }

    private Document(Document source) {
        this.title = source.title;
        this.content = source.content;
        this.format = source.format;
    }

    @Override
    public Document copy() {
        return new Document(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
