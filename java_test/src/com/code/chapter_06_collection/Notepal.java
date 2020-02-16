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

    //定义一个文本框
    JTextArea      jTextArea      = null;
    //定义一个菜单栏
    JMenuBar       jMenuBar       = null;
    //定义一个菜单
    JMenu          jMenu1         = null;
    //顶一个一个打开子选项
    JMenuItem      jMenuItem1     = null;
    //定义一个保存子选项
    JMenuItem      jMenuItem2     = null;
    //定义一个文本选择
    JFileChooser   jFielChooser   = null;
    //定义一个文件输入流
    FileReader     fileReader     = null;
    //定义一个文件输出流
    FileWriter     fileWriter     = null;
    //定义 一个缓冲区输入流
    BufferedReader bufferedReader = null;
    //定义一个缓冲区输出流
    BufferedWriter bufferedWriter = null;
    JFileChooser   jFileChooser   = null;

    public Notepal() {
        //实例化jTextArea
        jTextArea = new JTextArea();
        //实例化jMenuBar
        jMenuBar = new JMenuBar();
        //实例化就jMenu1，并设置其名字为“文件”
        jMenu1 = new JMenu("文件");
        //实例化就MenuItem1，并将其命名为“打开”
        jMenuItem1 = new JMenuItem("打开");
        //实现对jMenuItem1的监听
        jMenuItem1.addActionListener(this);
        jMenuItem1.setActionCommand("打开");
        //实例化就MenuItem2，并将其命名为“保存”
        jMenuItem2 = new JMenuItem("保存");
        //实现对jMenuItem2的监听
        jMenuItem2.addActionListener(this);
        jMenuItem2.setActionCommand("保存");

        //设置jTextArea的背景颜色为
        jTextArea.setBackground(Color.CYAN);

        //将组件添加上各自的位置
        //将jMenuBar添加到JFrame中
        this.setJMenuBar(jMenuBar);
        //将jMenu添加到jMenuBar中
        jMenuBar.add(jMenu1);
        //将jMenuTItem1添加到Jmenu1中
        jMenu1.add(jMenuItem1);
        //将jMenuTItem2添加到Jmenu1中
        jMenu1.add(jMenuItem2);
        //将jTextArea添加到JFrame中
        this.add(jTextArea);

        //设置窗体的标题
        this.setTitle("记事本（简易版）");
        //设置窗体的大小
        this.setSize(800, 600);
        //当关闭窗口的时候，关闭进程
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗口
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("打开")) {
            jFileChooser = new JFileChooser();
            jFileChooser.setDialogTitle("请选择文件......");
            //设置文件窗口的路径
            jFileChooser.showOpenDialog(null);
            //显示文件窗口
            jFileChooser.setVisible(true);
            //保存用户编辑的绝对路径
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

        } else if (e.getActionCommand().equals("保存")) {
            //创建一个保存窗口
            JFileChooser jFileChooser1 = new JFileChooser();
            jFileChooser1.setDialogTitle("另存为.....");
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
