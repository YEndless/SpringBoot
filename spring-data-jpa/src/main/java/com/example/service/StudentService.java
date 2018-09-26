package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> getAll();
    Student get(int id);
    void delete(int id);
}
