package com.example.schoolmanagement.Controller;

import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("students")
    public ResponseEntity<List<Student>> getALlStudents(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
    }
    @PostMapping("student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student s = studentService.addStudent(student);
        if (s==null){
            return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
        }
        else
            return new ResponseEntity<>(s,HttpStatus.CREATED);

    }
    @DeleteMapping("student/{studentId}")
    public ResponseEntity<Object> deleteStudent(@PathVariable int studentId){
        String s = studentService.deleteStudent(studentId);
        if(s!=null){
            return new ResponseEntity<Object>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);

    }
}
