package com.pn.listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestListener{
    public static void main(String[] args) {
        Frame frame = new Frame("java监听");//窗体
        Panel panel = new Panel(null);//面板
        frame.setLayout(null);//布局
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.gray);
        panel.setBounds(50,50,300,300);
        panel.setBackground(Color.green);
        frame.add(panel);
        frame.setVisible(true);
        //监听窗口关闭事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}