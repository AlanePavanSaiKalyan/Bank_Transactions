package com.my_project.student_management.dao;

import com.my_project.student_management.model.Student;

import java.util.ArrayList;

public interface StudentDao {
    void addStudent(Student student);
    void deleteStudent(int id);
    ArrayList<Student> getStudents();
    void updateStudent(Student student);
}
