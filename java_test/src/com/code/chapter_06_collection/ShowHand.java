package com.code.chapter_06_collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.code.utils.ArrayUtils;

public class ShowHand {

    private final int      PLAY_NUM     = 5;
    private String[]       types        = { "方块", "草花", "红心", "黑桃" };
    private String[]       values       = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                                            "K", "A" };

    //cards是同一局游戏中剩下的扑克牌
    private List<String>   cards        = new LinkedList<String>();

    //定义所有玩家
    private String[]       players      = new String[PLAY_NUM];

    //定义玩家手上的扑克牌
    private List<String>[] playersCards = new LinkedList[PLAY_NUM];

    /**
     * 初始化扑克牌，放入52张扑克牌
     */
    public void initCard() {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i] + values[j]);
            }
        }
        //随机排列
        Collections.shuffle(cards);
    }

    /**
     * 
     * @Description: 初始化玩家
     * @param names
     * @return: void
     */
    public void initPlayer(String... names) {
        if (names.length > PLAY_NUM || names.length < 2) {
            return;
        } else {
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }

    }

    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && !players[i].equals("")) {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    public void deliverCard(String first) {
        int firstPos = ArrayUtils.Search(players, first);
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        for (int i = 0; i < firstPos; i++) {
            if (players[i] != null) {
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }

    public void showPlayerCards() {
        for (int i = 0; i < PLAY_NUM; i++) {
            if (players[i] != null) {
                System.out.println(players[i] + ":");

                for (String card : playersCards[i]) {
                    System.out.println(card + "\t");
                }
            }

            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initPlayer("电脑玩家", "孙悟空");
        sh.initCard();
        sh.initPlayerCards();

        sh.deliverCard("孙悟空");
        sh.showPlayerCards();

        sh.deliverCard("电脑玩家");
        sh.showPlayerCards();
    }

}
