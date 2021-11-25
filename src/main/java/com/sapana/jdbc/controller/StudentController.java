package com.sapana.jdbc.controller;

import com.sapana.jdbc.exception.Ex;
import com.sapana.jdbc.model.Student;
import com.sapana.jdbc.response.Response;
import com.sapana.jdbc.service.StudentService;
import com.sapana.jdbc.service.impl.StudentServiceImpl;
import com.sapana.jdbc.util.DateUtil;
import com.sapana.jdbc.util.JacksonUtil;

import java.sql.Date;

import static com.sapana.jdbc.util.DateUtil.formatDate;

public class StudentController {
    private final static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        Ex.caught(() -> {

//            add();
            update();
          //  delete();
            getAll();
//            getOne();
        });
    }

    public static void getAll() throws Exception {
        Response studentAllResponse = studentService.getAll();
        System.out.println(JacksonUtil.toJson(studentAllResponse));
    }

    public static void getOne() throws Exception {
        Response getByIdResponse = studentService.getById(5L);
        System.out.println(JacksonUtil.toJson(getByIdResponse));
    }

    public static void add() throws Exception {
        Student student = Student
                .builder()
                .name("Maniraj Joshi")
                .dob((Date) formatDate("1998-03-31", "yyyy-MM-dd"))
                .address("Lalitpur")
                .contactNo("9841494167")
                .build();

        Response studentAddResponse = studentService.add(student);
        System.out.println(JacksonUtil.toJson(studentAddResponse));
    }

    public static void update() throws Exception {
        Student student = Student
                .builder()
                .id(4L)
                .name("Sapana Maharjan")
                .dob((Date) formatDate("1998-03-31", "yyyy-MM-dd"))
                .address("Lalitpur")
                .contactNo("9841494167")
                .build();
        Response studentUpdate = studentService.update(student);
        System.out.println(JacksonUtil.toJson(studentUpdate));
    }

    public static void delete() throws Exception {
        Response studentDelete = studentService.delete(7L);
        System.out.println(JacksonUtil.toJson(studentDelete));
    }
}
