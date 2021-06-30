package com.mvc.controller;

import com.mvc.exception.errors.StudentNotFoundException;
import com.mvc.model.StudentResponseModel;
import com.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public  List<StudentResponseModel> getAllStudentDetails() throws StudentNotFoundException, InvocationTargetException, IllegalAccessException {
        return  studentService.getAllStudents();
    }


}
