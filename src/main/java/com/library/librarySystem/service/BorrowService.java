package com.library.librarySystem.service;

import com.library.librarySystem.repository.BookRepo;
import com.library.librarySystem.repository.BorrowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowService {
    @Autowired
    BorrowRepo borrowRepo;
    public int borrow(int id,int bookId){
        return borrowRepo.insert(id,bookId);
    }
}
