package com.java.collection;

import java.util.Scanner;

public class WormPane {

    private Worm worm;
    private int  rows = 10;
    private int  cols = 32;

    public WormPane() {
        worm = new Worm();
    }

    public Worm getWorm() {
        return worm;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    System.out.print("-");
                } else if (j == 0 || j == cols - 1) {
                    System.out.print("|");
                } else if (worm.contains(i, j)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        WormPane pane = new WormPane();
        Worm worm = pane.getWorm();
        Scanner s = new Scanner(System.in);
        while (true) {
            pane.print();
            System.out.println(worm);
            String cmd = s.nextLine();
            if (cmd.equals("u")) {
                worm.step(Worm.up);
            } else if (cmd.equals("d")) {
                worm.step(Worm.down);
            } else if (cmd.equals("l")) {
                worm.step(Worm.left);
            } else if (cmd.equals("r")) {
                worm.step(Worm.right);
            } else if (cmd.equals("q")) {
                System.out.println("By.....");
                break;
            } else {
                worm.step();
            }
        }
    }
}
