package com.library.librarySystem.controller;


import com.library.librarySystem.entity.Student;
import com.library.librarySystem.model.Result;
import com.library.librarySystem.model.StudentResult;
import com.library.librarySystem.service.StudentEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentEntryService studentEntryService;

    @RequestMapping(value = "/getstudents",method = RequestMethod.GET)
    @ResponseBody
    public List<StudentResult> handleGetStudent(){
        List<StudentResult> students = studentEntryService.fetchAllStudents();
        try{
            return students;
        }catch (NullPointerException e){
            return null;
        }
    }

    @RequestMapping(value = "/insertstudent",method = RequestMethod.POST)
    @ResponseBody
    public Result handleInsert(@RequestParam String name){
        int res = studentEntryService.insert(name);
        Result result = new Result("","fail");
        try{
            if(res==0)
                return result;
            result.setName(name);
            result.setResult("success");
            return result;
        }catch (NullPointerException e){
            return result;
        }
    }
}
