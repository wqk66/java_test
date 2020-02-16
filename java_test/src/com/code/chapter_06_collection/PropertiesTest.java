package com.code.chapter_06_collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties proper = new Properties();
        try {

            proper.setProperty("1", "a");
            proper.setProperty("2", "b");
            //            proper.load(new FileInputStream(new File("/config.ini")));

//            proper.load(new FileInputStream("D:\\workspace\\java_test\\src\\config.properties"));
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
            proper.load(in);
            System.out.println(proper.getProperty("a"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
