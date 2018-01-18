package com.library.librarySystem.controller;

import com.library.librarySystem.model.Result;
import com.library.librarySystem.service.BookEntryService;
import com.library.librarySystem.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BorrowController {
    @Autowired
    BorrowService borrowService;
    @RequestMapping(value = "/borrow",method = RequestMethod.POST)
    @ResponseBody
    public Result handleBorrow(@RequestParam int id, @RequestParam int bookId){
        Result result = new Result("","false");
        try{
            if(borrowService.borrow(id,bookId)==1){
                result.setResult("true");
                result.setName("Completed");
            }

            return result;
        }catch(Exception e){
            return result;
        }
    }
}
