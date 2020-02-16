package com.java.collection.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CollectionsTest {

    public static void main(String[] args) {

        //        LIST<STRING> LIST = NEW ARRAYLIST<STRING>();
        //        ADDALL(LIST, "12", "33", "44");
        //        SYSTEM.OUT.PRINTLN(LIST.SIZE());

        //        List<String> list1 = Collections.emptyList();
        //        System.out.println(list1.size());

        List<String> list = new ArrayList<String>();
        listShuffle(list);

    }

    public static boolean addAll(List<String> list, String... elements) {
        return Collections.addAll(list, elements);
    }

    public static void listSort(List<String> list) {
        list.add("11");
        list.add("22");
        list.add("55");
        list.add("44");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void listShuffle(List<String> list) {
        list.add("11");
        list.add("22");
        list.add("55");
        list.add("44");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, -5, -190 })
    public void testV(int x) {
        assertEquals(-x, Math.abs(x));
    }

}
