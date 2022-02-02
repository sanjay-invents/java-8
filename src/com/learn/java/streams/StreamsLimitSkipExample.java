package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> limitResult = limit(integerList);

        limitResult.ifPresent(System.out::println);

        Optional<Integer> skipResult = skip(integerList);

        skipResult.ifPresent(System.out::println);
    }

}
