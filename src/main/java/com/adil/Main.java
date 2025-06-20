package com.adil;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMessage());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    private static String getMessage() {
        return "Hello qa.guru!";
    }
}