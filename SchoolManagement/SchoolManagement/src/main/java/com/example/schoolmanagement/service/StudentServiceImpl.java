package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.studentDao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDao studentDao;
    @Override
    public Student addStudent(Student student) {
        if(student.getEmail()==null||student.getId()==0||student.getFirstName()==null||student.getLastName()==null)
            return null;
        else {
            studentDao.save(student);
            return student;}
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>)studentDao.findAll();
    }

    @Override
    public String deleteStudent(int id) {
        if(studentDao.findById(id).isEmpty())
            return null;
        else {
            studentDao.deleteById(id);
            return "Student deleted";}
    }
}
