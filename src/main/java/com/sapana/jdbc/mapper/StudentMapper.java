package com.sapana.jdbc.mapper;

import com.sapana.jdbc.db.RowMapper;
import com.sapana.jdbc.model.Student;

import java.sql.ResultSet;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student map(ResultSet resultSet) throws Exception {
        return Student
                .builder()
                .id(resultSet.getLong("ID"))
                .name(resultSet.getString("NAME"))
                .address(resultSet.getString("ADDRESS"))
                .dob(resultSet.getDate("DOB"))
                .contactNo(resultSet.getString("CONTACT_NO"))
                .createDate(resultSet.getDate("CREATED_DATE"))
                .status(resultSet.getBoolean("STATUS"))
                .build();
    }
}
