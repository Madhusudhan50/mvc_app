package com.mvc.service.impl;

import com.mvc.constants.ErrorConstants;
import com.mvc.entity.Student;
import com.mvc.exception.ExceptionController;
import com.mvc.exception.errors.StudentNotFoundException;
import com.mvc.model.StudentResponseModel;
import com.mvc.repository.StudentRepository;
import com.mvc.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExceptionController exceptionController;

    @Override
    public List<StudentResponseModel> getAllStudents() throws StudentNotFoundException {

        List<Student> student = studentRepository.findAll();

        if(student.isEmpty() || student==null){
            throw new StudentNotFoundException(ErrorConstants.RECORD_NOT_FOUNDS);
        }
        List<StudentResponseModel> models = new ArrayList<>();
        StudentResponseModel studentModel = null;

        for (Student studentEntity : student) {
            studentModel = new StudentResponseModel();
            BeanUtils.copyProperties(studentEntity, studentModel);
        }
        models.add(studentModel);
        return models;
    }
}
