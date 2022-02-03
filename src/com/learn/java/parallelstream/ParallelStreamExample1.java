package com.learn.java.parallelstream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintUniqueSortedStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime) );
        return  studentActivities;

    }

    public static List<String> parallelPrintUniqueSortedStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();

        System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime) );
        return  studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintUniqueSortedStudentActivities();
        parallelPrintUniqueSortedStudentActivities();
    }

}
