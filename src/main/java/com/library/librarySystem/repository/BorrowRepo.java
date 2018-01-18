package com.library.librarySystem.repository;

import com.library.librarySystem.entity.Book;
import com.library.librarySystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BorrowRepo{
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    BookRepo bookRepo;
    public int insert(int studentId,int bookId){
        try {
            Book book = bookRepo.findById(bookId);
//            System.out.println(book.getName());
            Student student = studentRepo.findById(studentId);
            student.getBooks().add(book);
            book.setStudent(student);
            Student y  = studentRepo.save(student);
            //System.out.println(y.getName());
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
}
