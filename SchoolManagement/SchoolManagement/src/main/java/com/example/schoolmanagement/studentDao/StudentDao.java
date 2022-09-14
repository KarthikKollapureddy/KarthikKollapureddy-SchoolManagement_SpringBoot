package com.example.schoolmanagement.studentDao;

import com.example.schoolmanagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
}
