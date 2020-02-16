package com.java.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomTest {

    public static void main(String[] args) {
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom();
            e.printStackTrace();
        }

        byte[] buffer = new byte[10];
        sr.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
    }
}
