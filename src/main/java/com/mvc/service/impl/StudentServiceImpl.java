package com.mvc.service.impl;

import com.mvc.entity.Student;
import com.mvc.exception.ExceptionController;
import com.mvc.model.StudentResponseModel;
import com.mvc.repository.StudentRepository;
import com.mvc.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExceptionController exceptionController;

    @Override
    public List<StudentResponseModel> getAllStudents() throws InvocationTargetException, IllegalAccessException {

        List<Student> student = studentRepository.findAll();
        List<StudentResponseModel> models = new ArrayList<>();

        StudentResponseModel model = null;
        for (Student s : student) {
            model = new StudentResponseModel();
            BeanUtils.copyProperties(s, model);
        }
        models.add(model);
        return models;
    }
}
