package com.example.demo.controller;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowPage {

    @Autowired
    StudentService studentServ;

    @RequestMapping("/")
    public String showMessage() {
        return "zhang";
    }

    @RequestMapping("/getstu")
    public Student getStuByid(int sid) {
        return studentServ.getStuById(sid);
    }
}
