package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
     Student addStudent(Student student);
     List<Student> getAllStudents();
     String deleteStudent(int id);
}
