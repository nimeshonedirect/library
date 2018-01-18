package com.library.librarySystem.model;

import com.library.librarySystem.entity.Book;

import java.util.List;

public class StudentResult {
    int id;
    String name;
    List<BookResult> books;

    public StudentResult(int id, String name, List<BookResult> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }
    public StudentResult(){}
    public StudentResult(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookResult> getBooks() {
        return books;
    }

    public void setBooks(List<BookResult> books) {
        this.books = books;
    }
}
