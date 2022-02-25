package com.sshacker.tutorialpoint.jdbc;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
    public void setDataSource(DataSource dataSource);

    public void insert(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudent();

}