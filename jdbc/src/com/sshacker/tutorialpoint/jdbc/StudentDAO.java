package com.sshacker.tutorialpoint.jdbc;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
    public void setDataSource(DataSource ds);

    public void insert(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudent();

    public void delete(Integer id);

    public void update(Integer id, Integer age);
}
