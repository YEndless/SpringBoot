package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Integer id){
        return studentService.get(id);
    }
}
