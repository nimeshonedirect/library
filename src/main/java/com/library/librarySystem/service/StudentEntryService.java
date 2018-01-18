package com.library.librarySystem.service;

import com.library.librarySystem.entity.Book;
import com.library.librarySystem.entity.Student;
import com.library.librarySystem.model.BookResult;
import com.library.librarySystem.model.StudentResult;
import com.library.librarySystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentEntryService {
    @Autowired
    StudentRepo studentEntry;
    public int insert(String name){
        try{
            Student student=new Student(name);
            studentEntry.save(student);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }
    public List<StudentResult> fetchAllStudents() {
        //User user = userRepository.findByUsernameAndAndPassword(username,password);
        List<Student> students = studentEntry.findAllStudents();
        ArrayList<StudentResult> res = new ArrayList<StudentResult>();
        try{
            for(Student s : students ){
                ArrayList<BookResult> books = new ArrayList<>();
                for(Book b : s.getBooks()){
                    books.add(new BookResult(b.getName()));
                }
                res.add(new StudentResult(s.getId(),s.getName(),books));
            }
            return res;
        }catch(Exception e){
            return null;
        }
    }
}
