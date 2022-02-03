package com.learn.java.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("hello Optional");
        System.out.println(stringOptional.isPresent());
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        stringOptional.ifPresent(System.out::println);
    }

}
