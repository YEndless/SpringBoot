package com.example.service.impl;

import com.example.dao.StudentRepository;
import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentRepository studentRepository;
    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student get(int id) {
        return studentRepository.findById(id).get();
    }


}
