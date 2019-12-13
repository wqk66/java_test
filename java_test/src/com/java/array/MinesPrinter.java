package com.java.array;

public class MinesPrinter {

    private static int[][] bz;

    /**
     * 
     * @Description: 根据行数列数以及雷数布置地雷
     * @param row 雷区的行
     * @param col 雷区的列
     * @param mines 设置的雷数
     * @return: void
     */
    public static void layMines(int row, int col, int mines) {

        //如果雷数为0或者所布置的雷数超过雷区点数的75%，则布置的地雷无效
        if (mines < 0 || mines > row * col * 0.75) {
            System.out.println("指定的地雷数无效");
            return;
        }

        //所布置的地雷排列必须大于或者等于3x3
        if (col < 2 || row < 2) {
            System.out.println("指定的列数和行数无效");
            return;
        }

        //初始化布雷点数组
        bz = new int[row][col];
        //当前已布的地雷数
        int currentMines = 0;
        //当前布雷的数量小于设置的雷数，才能继续布雷
        while (currentMines < mines) {
            int r = (int) (Math.random() * row);
            int c = (int) (Math.random() * col);
            //雷区布雷点没有地雷时，在该点布雷，并统计当前布雷数量
            if (bz[r][c] != -1) {
                bz[r][c] = -1;
                currentMines++;
            }
        }
    }

    /**
     * 
     * @Description: 打印布置的地雷
     * @return: void
     */
    public static void print() {
        if (bz == null || bz.length == 0) {
            return;
        }
        for (int i = 0; i < bz.length; i++) {
            for (int j = 0; j < bz[i].length; j++) {
                System.out.print(bz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void accountMines() {
        for (int i = 0; i < bz.length; i++) {
            for (int j = 0; j < bz[i].length; j++) {
                //当前位置是地雷，则跳过该位置，统计下一个位置
                if (bz[i][j] == -1) {
                    continue;
                }

                //周围 地雷数量
                int numOfSurroundingMines = 0;
                //左上角位置
                if (i - 1 >= 0 && j - 1 >= 0 && bz[i - 1][j - 1] == -1) {
                    numOfSurroundingMines++;
                }
                //正上位置
                if (i - 1 > 0 && bz[i - 1][j] == -1) {
                    numOfSurroundingMines++;
                }
                //右上角位置
                if (i - 1 >= 0 && j + 1 <= (bz[i].length - 1) && bz[i - 1][j + 1] == -1) {
                    numOfSurroundingMines++;
                }

                //正左位置
                if (j - 1 > 0 && bz[i][j - 1] == -1) {
                    numOfSurroundingMines++;
                }
                //正右位置
                if (j + 1 <= (bz[i].length - 1) && bz[i][j + 1] == -1) {
                    numOfSurroundingMines++;
                }
                //左下角位置
                if (i + 1 <= (bz.length - 1) && j - 1 >= 0 && bz[i + 1][j - 1] == -1) {
                    numOfSurroundingMines++;
                }

                //正 下位置
                if (i + 1 <= (bz.length - 1) && bz[i + 1][j] == -1) {
                    numOfSurroundingMines++;
                }
                //右下角位置
                if (i + 1 <= (bz.length - 1) && j + 1 <= (bz[i].length - 1)
                    && bz[i + 1][j + 1] == -1) {
                    numOfSurroundingMines++;
                }
                bz[i][j] = numOfSurroundingMines;
            }
        }

    }

    public static void main(String[] args) {
        layMines(10, 10, 10);
        print();
        accountMines();
        System.out.println("----------------------");
        print();
    }
}
