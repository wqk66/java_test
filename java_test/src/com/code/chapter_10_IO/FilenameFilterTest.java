package com.code.chapter_10_IO;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {

    public static void main(String[] args) {

        File file = new File("D:\\test");
        //        String[] names = file.list(new FilenameFilter() {
        //            @Override
        //            public boolean accept(File dir, String name) {
        //                return name.endsWith(".java");
        //            }
        //        });

        //        for (String name : names) {
        //            System.out.println(name);
        //        }

        String[] names = file.list();
        for (String name : names) {
            if (name.endsWith(".java")) {
                System.out.println(name);
            }

        }
    }

}

class MyFilenameFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        System.out.println(dir.getAbsolutePath());
        return name.endsWith(".java");
    }
}
