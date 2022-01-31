package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
            return new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"));
        };

        System.out.println("Student is : " + studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> {
            return StudentDataBase.getAllStudents();
        };

        System.out.println("Student List is : " + listSupplier.get());

    }

}
