package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student2);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integerList));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
        System.out.println(result.isPresent());
        result.ifPresent(System.out::println);

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(new ArrayList<>());
        System.out.println(result1.isPresent());
        result1.ifPresent(System.out::println);

        Optional<Student> studentOptional = getHighestGpaStudent();
        studentOptional.ifPresent(System.out::println);
    }

}
