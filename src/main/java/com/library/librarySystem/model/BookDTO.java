package com.library.librarySystem.model;

import org.springframework.web.bind.annotation.RequestParam;

public class BookDTO {
    private final String name;
    private final String author;

    public BookDTO( String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
