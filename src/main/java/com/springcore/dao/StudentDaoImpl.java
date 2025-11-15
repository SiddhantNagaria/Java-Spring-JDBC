package com.springcore.dao;

import com.springcore.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city) values (?,?,?)";
        int rows = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return rows;
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int rows = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return rows;
    }

    @Override
    public int delete(int studentID) {
        String query = "delete from student where id=?";
        int rows = this.jdbcTemplate.update(query, studentID);
        return rows;
    }

    @Override
    public Student getStudent(int StudentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, StudentId);
        return student;
    }
}
