package com.code.chapter_06_collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("jim");
        set.add("tom");
        set.add("marry");
        System.out.println(set);
    }

}
