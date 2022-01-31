package com.learn.java.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * prior java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 3.12");
        };
        new Thread(runnableLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1");
            }
        }).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }

}
