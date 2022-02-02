package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();

    }

    public static Optional<Student> findFirstStudent() {

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();

    }

    public static void main(String[] args) {

        Optional<Student> studentOptionalFindAny = findAnyStudent();
        studentOptionalFindAny.ifPresent(System.out::println);

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        studentOptionalFindFirst.ifPresent(System.out::println);

    }

}
