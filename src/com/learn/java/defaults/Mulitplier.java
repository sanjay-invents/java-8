package com.learn.java.defaults;

import java.util.List;

public interface Mulitplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList) {
        System.out.println("Inside multiplier interface");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList) {
        return integerList != null && integerList.size() > 0;
    }

}
