package com.sshacker.tutorialpoint.transaction;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(String name, Integer age, Integer marks, Integer year) {
        try {
            String sql1 = "insert into Student(name, age) values(?, ?)";
            jdbcTemplateObject.update(sql1, name, age);

            String sql2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject(sql2, Integer.class);

            String sql3 = "insert into Marks(sid, marks, year) values(?, ?, ?)";
            jdbcTemplateObject.update(sql3, sid, marks, year);

            // to simulate the exception.
            // throw new RuntimeException("simulate Error condition");
        } catch (Exception ex) {
            System.out.println("Error in creating record, rolling back");
            throw ex;
        }
    }

    @Override
    public List<StudentMarks> listStudentMarks() {
        String sql = "select * from Student, Marks where Student.id = Marks.sid";
        List<StudentMarks> studentMarksList = jdbcTemplateObject.query(sql, new StudentMarksMapper());
        return studentMarksList;
    }
}
