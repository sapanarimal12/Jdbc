package com.sapana.jdbc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.sql.Date;
import java.util.PrimitiveIterator;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Student {

    private  Long id;
    private String name;
    private  String  address;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-mm-dd" )
    private Date dob;
    private  String contactNo;




}
