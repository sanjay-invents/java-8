package com.learn.java.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Mulitplier mulitplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println("Result : " + mulitplier.multiply(integerList));
        System.out.println("Default Method size : " + mulitplier.size(integerList));
        System.out.println("Static method is empty : " + Mulitplier.isEmpty(integerList));

    }

}
