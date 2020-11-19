package com.example.demo.Service.imp;

import com.example.demo.Service.StudentService;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimp implements StudentService {

    @Autowired
    StudentRepository studentRep;

    @Override
    public Student getStuById(int sid) {
        return studentRep.findById(sid).get();
    }

}
