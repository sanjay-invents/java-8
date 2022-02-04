package com.learn.java.defaults;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.sql.Struct;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = System.out::println;
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList) {
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        System.out.println("After Sort by name");
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        System.out.println("After Sort by gpa");
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {
        System.out.println("After comparator chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After comparator with null values");
//        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort");
        studentList.forEach(studentConsumer);
//        sortByName(studentList);
//        sortByGpa(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }

}
