package com.sshacker.tutorialpoint.transaction;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
    public void setDataSource(DataSource dataSource);

    public void insert(String name, Integer age, Integer mark, Integer year);

    public List<StudentMarks> listStudentMarks();
}
