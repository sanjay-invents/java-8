package com.learn.java.streamterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()))
                .forEach(System.out::println);
        System.out.println();
        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()))
                .forEach(System.out::println);
    }

}
