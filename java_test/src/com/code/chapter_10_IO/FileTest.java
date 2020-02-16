package com.code.chapter_10_IO;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\test\\test.txt");

        System.out.println(file.getName());

        System.out.println(file.getParent());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getAbsoluteFile().getName());

        File tmpFile = File.createTempFile("bbb", ".txt", new File("D:\\\\test"));
        tmpFile.deleteOnExit();

        File newFil = new File("D:\\\\test\\" + System.currentTimeMillis() + "");
        newFil.createNewFile();

        //列出所有的磁盘根目录
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }
    }
}
