package com.learn.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("java8"));
        System.out.println("Result of and then : " + function.andThen(addSomeString).apply("java8"));
        System.out.println("Result of compose : " + function.compose(addSomeString).apply("java8"));
    }

}
