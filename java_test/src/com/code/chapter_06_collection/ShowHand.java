package com.code.chapter_06_collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.code.utils.ArrayUtils;

public class ShowHand {

    private final int      PLAY_NUM     = 5;
    private String[]       types        = { "����", "�ݻ�", "����", "����" };
    private String[]       values       = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                                            "K", "A" };

    //cards��ͬһ����Ϸ��ʣ�µ��˿���
    private List<String>   cards        = new LinkedList<String>();

    //�����������
    private String[]       players      = new String[PLAY_NUM];

    //����������ϵ��˿���
    private List<String>[] playersCards = new LinkedList[PLAY_NUM];

    /**
     * ��ʼ���˿��ƣ�����52���˿���
     */
    public void initCard() {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i] + values[j]);
            }
        }
        //�������
        Collections.shuffle(cards);
    }

    /**
     * 
     * @Description: ��ʼ�����
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
        sh.initPlayer("�������", "�����");
        sh.initCard();
        sh.initPlayerCards();

        sh.deliverCard("�����");
        sh.showPlayerCards();

        sh.deliverCard("�������");
        sh.showPlayerCards();
    }

}
