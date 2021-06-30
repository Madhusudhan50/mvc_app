package com.mvc.exception;

import com.mvc.exception.errors.StudentNotFoundException;
import com.mvc.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @Autowired
    private StudentServiceImpl studentService;

    @ExceptionHandler(value= StudentNotFoundException.class)
    public StudentNotFoundException studentNotFoundException(){
        return  new StudentNotFoundException("records not founds in db");

    }
}
