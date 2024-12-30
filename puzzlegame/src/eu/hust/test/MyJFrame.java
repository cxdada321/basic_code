package eu.hust.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {

    //创建一个按钮对象
    JButton jib = new JButton("我是按钮");

    //创建一个按钮对象
    JButton jib1 = new JButton("我也是按钮");
    public MyJFrame() {
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


        //设置按钮的大小
        jib.setBounds(100, 100, 100, 100);

        jib.addActionListener(this);


        //设置按钮的大小
        jib1.setBounds(200, 200, 100, 100);

        jib1.addActionListener(this);


        Jf.add(jib);
        Jf.add(jib1);
        Jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取当前被操作的那个按钮对象
        Object source = e.getSource();

        if (source == jib) {
            System.out.println("按钮1被点击了");
        } else if (source == jib1) {
            System.out.println("按钮2被点击了");
        }
    }
}
