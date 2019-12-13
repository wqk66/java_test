package com.java.game;

import java.util.Random;

public class CardDispatch {

    public static int[][] dispatch(int players, int cards) {

        if (players <= 0 || cards <= 0) {
            System.out.println("无效的发牌参数");
            return null;
        }

        if (players * cards > 52) {
            System.out.println("无效的发牌参数：发牌总数不能超过总牌数");
            return null;
        }

        int[] allCards = new int[52];

        int k = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= 14; j++) {
                allCards[k] = i * 100 + j;
                k++;
            }
        }

        int[] dispatchCards = new int[players * cards];
        int num = 0;
        Random r = new Random();
        outer: while (num < dispatchCards.length) {

            //            int index = (int) (Math.random() * allCards.length);
            int index = r.nextInt(allCards.length - 1);
            for (int i = 0; i < num; i++) {
                if (dispatchCards[i] == allCards[index]) {
                    continue outer;
                }
            }
            dispatchCards[num++] = allCards[index];
        }

        int[][] cs = new int[players][cards];
        int index = 0;
        for (int i = 0; i < cs[0].length; i++) {
            for (int j = 0; j < cs.length; j++) {
                cs[j][i] = dispatchCards[index++];
            }
        }
        return cs;
    }

    public static void main(String[] args) {

        int[][] dispatchCards = dispatch(1, 10);

        if (dispatchCards == null) {
            return;
        }
        for (int i = 0; i < dispatchCards.length; i++) {
            for (int j = 0; j < dispatchCards[i].length; j++) {
                System.out.print(dispatchCards[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
