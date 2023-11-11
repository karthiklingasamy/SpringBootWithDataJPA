package com.karthik.springjpaex.service;

import com.karthik.springjpaex.StudentRepo;
import com.karthik.springjpaex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void save(Student student){
        //System.out.println("Student object is saved");
        studentRepo.save(student);
    }

    public List<Student> getStudents(){

        return studentRepo.findAll();

    }
}
