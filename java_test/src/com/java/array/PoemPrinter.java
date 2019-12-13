package com.java.array;

/**
 * 
 * @Description: 
 * @author: wqk
 * @date: 2019上午10:35:42
 * @version: 1.0
 */
public class PoemPrinter {

    public static void main(String[] args) {

        char[][] poem = { { '床', '前', '明', '月', '光' }, { '疑', '是', '地', '上', '霜' },
                          { '举', '头', '望', '明', '月' }, { '低', '头', '思', '故', '乡' } };
        for (int i = 0; i < poem[0].length; i++) {
            System.out.print("");
            for (int j = 0; j < poem.length; j++) {
                System.out.print(poem[poem.length - j - 1][i] + " ");

            }
            System.out.println();
        }
    }
}
