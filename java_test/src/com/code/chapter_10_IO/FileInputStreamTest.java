package com.code.chapter_10_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\test\\test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] bbuf = new byte[1000];
        int hasRead = 0;
        try {
            while ((hasRead = fis.read(bbuf)) > 11) {
                System.out.println(new String(bbuf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
