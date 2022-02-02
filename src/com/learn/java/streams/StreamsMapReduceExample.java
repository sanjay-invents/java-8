package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsMapReduceExample {

    private static int numberOfNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                //.reduce(0, (a,b) -> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(numberOfNotebooks());
    }

}
