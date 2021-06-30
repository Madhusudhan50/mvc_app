package com.mvc.service;


import com.mvc.exception.errors.StudentNotFoundException;
import com.mvc.model.StudentResponseModel;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface StudentService {

    List<StudentResponseModel> getAllStudents() throws  StudentNotFoundException;
}
