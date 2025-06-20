package com.adil;

public class Main {

    private static String msg = "Hello qa.guru!12312321";

    public static void main(String[] args) {
        System.out.println(getMessage());

        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
    }

    private static String getMessage() {
        return msg;
    }
}
