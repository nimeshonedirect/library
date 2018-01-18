package com.library.librarySystem.model;

public class BookResult {
    String bookName;

    public BookResult(String bookName) {
        this.bookName = bookName;

    }

    public BookResult() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
