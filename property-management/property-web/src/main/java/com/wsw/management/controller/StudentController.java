package com.wsw.management.controller;


import com.wsw.management.domain.Student;
import com.wsw.management.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping(value = "/home",method = RequestMethod.GET)
public List<Student> find(){
        return studentService.findAll();
}
}
