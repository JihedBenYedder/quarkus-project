package org.tat.quarkus.starting.entity;

public class Book {

    public int id;
    public String title;
    public String author;
    public int yearOfPublication;

    public Book(String title, String author, int yearOfPublication, int id) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.id = id;
    }
}
