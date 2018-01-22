package com.library.librarySystem.repository;

import com.library.librarySystem.entity.Book;
import com.library.librarySystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Integer> {

    public Book findByName(String name);
    public Book findById(int id);
    public Book findByNameAndAuthor(String name,String author);
    public List<Book> findAll();
    @Query("Select s from Book s")
    public List<Book> findAllBooks();
}
