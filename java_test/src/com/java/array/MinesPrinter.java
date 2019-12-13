package com.java.array;

public class MinesPrinter {

    private static int[][] bz;

    /**
     * 
     * @Description: �������������Լ��������õ���
     * @param row ��������
     * @param col ��������
     * @param mines ���õ�����
     * @return: void
     */
    public static void layMines(int row, int col, int mines) {

        //�������Ϊ0���������õ�������������������75%�����õĵ�����Ч
        if (mines < 0 || mines > row * col * 0.75) {
            System.out.println("ָ���ĵ�������Ч");
            return;
        }

        //�����õĵ������б�����ڻ��ߵ���3x3
        if (col < 2 || row < 2) {
            System.out.println("ָ����������������Ч");
            return;
        }

        //��ʼ�����׵�����
        bz = new int[row][col];
        //��ǰ�Ѳ��ĵ�����
        int currentMines = 0;
        //��ǰ���׵�����С�����õ����������ܼ�������
        while (currentMines < mines) {
            int r = (int) (Math.random() * row);
            int c = (int) (Math.random() * col);
            //�������׵�û�е���ʱ���ڸõ㲼�ף���ͳ�Ƶ�ǰ��������
            if (bz[r][c] != -1) {
                bz[r][c] = -1;
                currentMines++;
            }
        }
    }

    /**
     * 
     * @Description: ��ӡ���õĵ���
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
                //��ǰλ���ǵ��ף���������λ�ã�ͳ����һ��λ��
                if (bz[i][j] == -1) {
                    continue;
                }

                //��Χ ��������
                int numOfSurroundingMines = 0;
                //���Ͻ�λ��
                if (i - 1 >= 0 && j - 1 >= 0 && bz[i - 1][j - 1] == -1) {
                    numOfSurroundingMines++;
                }
                //����λ��
                if (i - 1 > 0 && bz[i - 1][j] == -1) {
                    numOfSurroundingMines++;
                }
                //���Ͻ�λ��
                if (i - 1 >= 0 && j + 1 <= (bz[i].length - 1) && bz[i - 1][j + 1] == -1) {
                    numOfSurroundingMines++;
                }

                //����λ��
                if (j - 1 > 0 && bz[i][j - 1] == -1) {
                    numOfSurroundingMines++;
                }
                //����λ��
                if (j + 1 <= (bz[i].length - 1) && bz[i][j + 1] == -1) {
                    numOfSurroundingMines++;
                }
                //���½�λ��
                if (i + 1 <= (bz.length - 1) && j - 1 >= 0 && bz[i + 1][j - 1] == -1) {
                    numOfSurroundingMines++;
                }

                //�� ��λ��
                if (i + 1 <= (bz.length - 1) && bz[i + 1][j] == -1) {
                    numOfSurroundingMines++;
                }
                //���½�λ��
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
