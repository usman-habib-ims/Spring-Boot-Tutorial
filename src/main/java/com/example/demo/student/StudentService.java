package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService
{
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Anonymous",
                        "Anonymous @gmail.com",
                        LocalDate.of(2000 , Month.FEBRUARY , 29),
                        14
                )
        );
    }
}
