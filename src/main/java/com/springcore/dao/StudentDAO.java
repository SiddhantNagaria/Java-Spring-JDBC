package com.springcore.dao;

import com.springcore.model.Student;

import java.util.List;

public interface StudentDAO {

    public int insert(Student student);

    public int update(Student student);

    public int delete(int studentID);

    public Student getStudent(int StudentId);

    public List<Student> getAllStudents();

}
