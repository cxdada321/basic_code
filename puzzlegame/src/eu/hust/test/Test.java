package eu.hust.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame Jf = new JFrame();
        Jf.setSize(603, 680);
        //设置游戏界面的标题
        Jf.setTitle("事件演示");
        //设置置顶
        Jf.isAlwaysOnTop();
        //设置页面居中
        Jf.setLocationRelativeTo(null);
        //设置关闭窗口的时候，程序退出
        Jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Jf.setLayout(null);

        //创建一个按钮对象
        JButton Jtb = new JButton("我是按钮");
        //设置按钮的大小
        Jtb.setBounds(100, 100, 100, 100);
        //给按钮添加动作监听
        //Jtb:表示组件对象，表示要给哪个组件添加事件
        //ActionListener:表示事件监听器，表示监听什么事件（动作监听鼠标点击和空格）
        Jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });

        Jf.add(Jtb);
        Jf.setVisible(true);
    }
}
