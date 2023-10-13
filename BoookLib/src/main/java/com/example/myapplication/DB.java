package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private ArrayList<Book> books = new ArrayList<>();

    public DB(){
        books.add(new Book("Pro Android Dev", "John",
                "Programming",120, true));
        books.add(new Book("Graphs", "Steve",
                "Programming",500, false));
        books.add(new Book("Algorithms", "Iyad",
                "Programming",300, true));
        books.add(new Book("Basic DB", "Basem",
                "DataBase",190, true));
        books.add(new Book("Advanced DB", "Mark",
                "DataBase",200, false));
        books.add(new Book("Transactions", "Mohammad",
                "DataBase",250, true));
        books.add(new Book("HTML", "Johny",
                "Web",300, true));
        books.add(new Book("JS", "Cena",
                "Web",12, false));
        books.add(new Book("Software Engineering", "Adel",
                "SoftWare Engineer",290, true));
        books.add(new Book("NetWork", "Abed",
                "Networking",100, false));
    }

    //method to get the books from cate. this method will return lest of books because there is a lot of books
    public List<Book> getBooks(String cat){
        ArrayList<Book> result = new ArrayList<>();
        for (Book b:books) {
            if(b.getCategory().equals(cat)){
                result.add(b);
            }
        }
        return result;
    }
}
