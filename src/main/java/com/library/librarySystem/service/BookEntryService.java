package com.library.librarySystem.service;

import com.library.librarySystem.entity.Book;
import com.library.librarySystem.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookEntryService {
    @Autowired
    BookRepo bookEntry;
    public int insert(String name,String author){
        try{
            Book book=new Book(name,author);
            bookEntry.save(book);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
    public List<Book> fetchAllBooks() {
        //User user = userRepository.findByUsernameAndAndPassword(username,password);
        List<Book> books = bookEntry.findAllBooks();
        try{
            return books;
        }catch(Exception e){
            return null;
        }
    }
}
