package com.sshacker.tutorialpoint.jdbc;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplete implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    @Override
    public void insert(String name, Integer age) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "insert into Student (name, age) values (?, ?)";
        jdbcTemplate.update(sql, name, age);
        System.out.println(name + " " + age);
        return;
    }

    @Override
    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        student.getId();
        return student;
    }

    @Override
    public List<Student> listStudent() {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}