package com.code.chapter_10_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        inputReaderContent();
    }

    /**
     * 
     * @Description: ���������ֵ���
     * @return: void
     */
    public static void inputContent() {
        InputStreamReader reader = new InputStreamReader(System.in);

        //��reader��װ�ɻ���reader
        BufferedReader br = new BufferedReader(reader);

        String content = null;

        try {
            while ((content = br.readLine()) != null) {
                if (content.equals("exit")) {
                    System.exit(1);
                }
                System.out.println("��������ݣ�" + content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputReaderContent() {

        try {
            FileReader reader = new FileReader(new File("D:\\test\\test.txt"));
            BufferedReader br = new BufferedReader(reader);
            String content = null;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
