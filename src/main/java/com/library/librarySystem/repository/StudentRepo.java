package com.library.librarySystem.repository;

import com.library.librarySystem.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Integer> {
    public Student findByName(String name);
    public Student findById(int id);
    @Query("Select s from Student s")
    public List<Student> findAllStudents();
}
