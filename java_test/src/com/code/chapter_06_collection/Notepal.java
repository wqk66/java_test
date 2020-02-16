package com.code.chapter_06_collection;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Notepal extends JFrame implements ActionListener {

    //����һ���ı���
    JTextArea      jTextArea      = null;
    //����һ���˵���
    JMenuBar       jMenuBar       = null;
    //����һ���˵�
    JMenu          jMenu1         = null;
    //��һ��һ������ѡ��
    JMenuItem      jMenuItem1     = null;
    //����һ��������ѡ��
    JMenuItem      jMenuItem2     = null;
    //����һ���ı�ѡ��
    JFileChooser   jFielChooser   = null;
    //����һ���ļ�������
    FileReader     fileReader     = null;
    //����һ���ļ������
    FileWriter     fileWriter     = null;
    //���� һ��������������
    BufferedReader bufferedReader = null;
    //����һ�������������
    BufferedWriter bufferedWriter = null;
    JFileChooser   jFileChooser   = null;

    public Notepal() {
        //ʵ����jTextArea
        jTextArea = new JTextArea();
        //ʵ����jMenuBar
        jMenuBar = new JMenuBar();
        //ʵ������jMenu1��������������Ϊ���ļ���
        jMenu1 = new JMenu("�ļ�");
        //ʵ������MenuItem1������������Ϊ���򿪡�
        jMenuItem1 = new JMenuItem("��");
        //ʵ�ֶ�jMenuItem1�ļ���
        jMenuItem1.addActionListener(this);
        jMenuItem1.setActionCommand("��");
        //ʵ������MenuItem2������������Ϊ�����桱
        jMenuItem2 = new JMenuItem("����");
        //ʵ�ֶ�jMenuItem2�ļ���
        jMenuItem2.addActionListener(this);
        jMenuItem2.setActionCommand("����");

        //����jTextArea�ı�����ɫΪ
        jTextArea.setBackground(Color.CYAN);

        //���������ϸ��Ե�λ��
        //��jMenuBar��ӵ�JFrame��
        this.setJMenuBar(jMenuBar);
        //��jMenu��ӵ�jMenuBar��
        jMenuBar.add(jMenu1);
        //��jMenuTItem1��ӵ�Jmenu1��
        jMenu1.add(jMenuItem1);
        //��jMenuTItem2��ӵ�Jmenu1��
        jMenu1.add(jMenuItem2);
        //��jTextArea��ӵ�JFrame��
        this.add(jTextArea);

        //���ô���ı���
        this.setTitle("���±������װ棩");
        //���ô���Ĵ�С
        this.setSize(800, 600);
        //���رմ��ڵ�ʱ�򣬹رս���
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //��ʾ����
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("��")) {
            jFileChooser = new JFileChooser();
            jFileChooser.setDialogTitle("��ѡ���ļ�......");
            //�����ļ����ڵ�·��
            jFileChooser.showOpenDialog(null);
            //��ʾ�ļ�����
            jFileChooser.setVisible(true);
            //�����û��༭�ľ���·��
            String address = jFileChooser.getSelectedFile().getAbsolutePath();

            try {
                fileReader = new FileReader(address);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            String strAll = "";
            try {
                while ((str = bufferedReader.readLine()) != null) {
                    strAll += str + "\r\n";
                }
                jTextArea.setText(strAll);
            } catch (IOException e1) {
                e1.printStackTrace();
            } finally {
                try {

                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }

        } else if (e.getActionCommand().equals("����")) {
            //����һ�����洰��
            JFileChooser jFileChooser1 = new JFileChooser();
            jFileChooser1.setDialogTitle("���Ϊ.....");
            jFileChooser1.showSaveDialog(null);
            jFileChooser1.setVisible(true);
            try {
                fileWriter = new FileWriter(jFileChooser1.getSelectedFile().getAbsoluteFile());
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(this.jTextArea.getText());
            } catch (IOException e1) {
                e1.printStackTrace();
            } finally {

                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (fileWriter != null) {
                        fileWriter.close();
                    }

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }

        }

    }

    public static void main(String[] args) {
        Notepal pal = new Notepal();
    }

}
