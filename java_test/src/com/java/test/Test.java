package com.java.test;

public class Test {

    public static void main(String[] args) {

        int num = 4;
        aa: for (int i = 0; i < num; i++) {
            System.out.println("-----------");
            for (int j = 0; j <= 4; j++) {
                if (j == 2) {
                    System.out.println("+++++++++");
                    continue aa;
                }
            }
        }
    }

}
