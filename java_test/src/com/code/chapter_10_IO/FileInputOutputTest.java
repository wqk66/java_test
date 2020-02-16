package com.code.chapter_10_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @Description: 实现复制功能
 * @author: wqk
 * @date: 2020上午12:34:04
 * @version: 1.0
 */
public class FileInputOutputTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\test\\test.txt");
            fos = new FileOutputStream("D:\\test\\test2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buf = new byte[32];
        int hasRead = 0;
        try {
            //读多少，写多少
            while ((hasRead = fis.read(buf)) > 0) {

                fos.write(buf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
