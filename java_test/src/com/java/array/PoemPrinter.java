package com.java.array;

/**
 * 
 * @Description: 
 * @author: wqk
 * @date: 2019����10:35:42
 * @version: 1.0
 */
public class PoemPrinter {

    public static void main(String[] args) {

        char[][] poem = { { '��', 'ǰ', '��', '��', '��' }, { '��', '��', '��', '��', '˪' },
                          { '��', 'ͷ', '��', '��', '��' }, { '��', 'ͷ', '˼', '��', '��' } };
        for (int i = 0; i < poem[0].length; i++) {
            System.out.print("");
            for (int j = 0; j < poem.length; j++) {
                System.out.print(poem[poem.length - j - 1][i] + " ");

            }
            System.out.println();
        }
    }
}
