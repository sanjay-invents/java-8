package com.learn.java.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 50).sum());
        IntStream.rangeClosed(1, 50).max().ifPresent(System.out::println);
        LongStream.rangeClosed(50, 100).min().ifPresent(System.out::println);
        IntStream.rangeClosed(1, 50).average().ifPresent(System.out::println);
    }

}
