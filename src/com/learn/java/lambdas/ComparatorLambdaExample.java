package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2
                // 1 -> o1 > o2
                // -1 -> o1 < o2
            }
        };

        System.out.println("Result of comparator is : " + comparator.compare(3, 2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of comparator using lambda is : " + comparatorLambda.compare(3, 2));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

        System.out.println("Result of comparator 1 using lambda is : " + comparatorLambda1.compare(3, 2));
    }

}
