package com.sapana.jdbc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapana.jdbc.dao.StudentDao;
import com.sapana.jdbc.dao.impl.StudentDaoMemoryImpl;
import com.sapana.jdbc.model.Student;
import com.sapana.jdbc.response.Response;
import com.sapana.jdbc.service.StudentService;
import com.sapana.jdbc.service.impl.StudentServiceImpl;
import com.sapana.jdbc.util.JacksonUtil;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        StudentService studentService =new StudentServiceImpl();

        studentService.add(Student
                .builder()
                        .id(1l)
                        .name("Sapana Rimal")
                        .address("Chakrapath")
                        .contactNo("9813299876")
                        .dob(new Date(2056-9-12))
                        .build()
        );
        studentService.add(Student
                .builder()
                .id(2l)
                .name("Bipana Rimal")
                .address("kritipur")
                .contactNo("9834125556")
                .dob(new Date(2056-9-12))
                .build()
        );
         Response addResponse= studentService.add(Student

                .builder()
                .id(3l)
                .name("Puja Rimal")
                .address("Nuwakot")
                .contactNo("9813227765")
                .dob(new Date(2056-9-12))
                .build()
        );
        System.out.println(JacksonUtil.toJson(addResponse));
        StudentService studentService2 =new StudentServiceImpl();

      Response updateResponse= studentService2.update((Student
                .builder()
                .id(3l)
                .name("Manjit Shakya")
                .build()));

              System.out.println(JacksonUtil.toJson(updateResponse));

        Response getByIdResponse=studentService.getById(1L);
        System.out.println(JacksonUtil.toJson(getByIdResponse));

        Response studentAllResponse=studentService.getAll();
         System.out.println(JacksonUtil.toJson(studentAllResponse));
}
}

