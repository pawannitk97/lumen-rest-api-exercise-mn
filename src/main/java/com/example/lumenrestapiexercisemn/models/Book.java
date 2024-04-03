package com.example.lumenrestapiexercisemn.models;

public class Book {
    private int bookId;
    private String title;
    private int pages;
    private double price;
    private int edition;
    private String[] languages;
    private Publisher publisher;

    public Book() {
    }

    public Book(int bookId, String title, int pages, double price, int edition, String[] languages, Publisher publisher) {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
        this.price = price;
        this.edition = edition;
        this.languages = languages;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
