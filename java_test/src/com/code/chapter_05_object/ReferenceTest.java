package com.code.chapter_05_object;

import java.lang.ref.WeakReference;

public class ReferenceTest {

    public static void main(String[] args) {

        String str = new String("·è¿ñjava½²Òå");
        WeakReference<String> wr = new WeakReference<String>(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        //        System.runFinalization();
        System.out.println(wr.get());
    }

}
