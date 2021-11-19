package com.sapana.jdbc.service;

import com.sapana.jdbc.model.Student;
import com.sapana.jdbc.response.Response;
import jdk.jfr.consumer.RecordedStackTrace;

import java.util.List;

public interface StudentService {
    Response add(Student student)  ;   //Create
    Response update(Student student) ; //update
    Response delete(Long id)   ;       //delete

    Response  getAll()  ;       //Read

    Response getById(Long id)  ;     // Read


}
