package com.sshacker.tutorialpoint.jdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplete implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(String name, Integer age) {
        String sql = "insert into Student (name, age) values (? , ?)";
        jdbcTemplateObject.update(sql, name, age);
        System.out.println("inserted");
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[] { id }, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudent() {
        String sql = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        System.out.println("student list");
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from Student where id = ?";
        jdbcTemplateObject.update(sql, id);
        System.out.println("deleted");
        return;
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(sql, age, id);
        System.out.println("updated");
        return;
    }

}
