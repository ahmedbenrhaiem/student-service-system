package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Student;
import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);
}
