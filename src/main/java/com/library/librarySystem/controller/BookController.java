package com.library.librarySystem.controller;

import com.library.librarySystem.entity.Book;
import com.library.librarySystem.model.BookDTO;
import com.library.librarySystem.model.Result;
import com.library.librarySystem.service.BookEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class BookController {

    @Autowired
    BookEntryService bookEntryService;

    @RequestMapping(value = "/getbooks",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> handleGetBook(){
        List<Book> books = bookEntryService.fetchAllBooks();
        try{
            return books;
        }catch (NullPointerException e){
            return null;
        }
    }
    @RequestMapping(value = "/insertbook",method = RequestMethod.POST)
    @ResponseBody
    public Result handleBook(@RequestBody BookDTO bookDTO){
        int res = bookEntryService.insert(bookDTO.getName(), bookDTO.getAuthor());
        Result result = new Result("","fail");
        try{
            if(res==0)
                return result;
            result.setName(bookDTO.getName());
            result.setResult("success");
            return result;
        }catch (NullPointerException e){
            return result;
        }
    }
}
