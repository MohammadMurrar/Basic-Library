package com.example.myapplication;

import androidx.annotation.NonNull;

public class Book {
    private String title;
    private String author;
    private String category;
    private int price;
    private boolean available;

    public Book(String title, String author, String category, int price, boolean available) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @NonNull
    @Override
    public String toString() {
        return "Book name : " + title + " Author : " + author + " Category : " + category + " Price : " + price + " Available ? : " + available +"\n";
    }

}
