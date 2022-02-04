package com.learn.java.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam", "Eve", "Jenny", "Alex", "Dan", "Mike", "Eric");
        //Prior java 8
//        Collections.sort(stringList);
//        System.out.println("Sorted list using Collections.Sort() " + stringList);

        //Java 8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() : " + stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.sort() reverse : " + stringList);
    }

}
