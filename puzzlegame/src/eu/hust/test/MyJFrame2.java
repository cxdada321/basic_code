package eu.hust.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    JButton jtb = new JButton("我是按钮");
    public MyJFrame2() {
        JFrame jf = new JFrame();
        jf.setSize(603, 680);
        jf.setTitle("事件演示");
        jf.isAlwaysOnTop();
        //设置页面居中
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtb.setBounds(0, 0, 100, 100);
        jtb.addMouseListener(this);

        jf.add(jtb);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == jtb) {
            System.out.println("按钮被点击了");
        }
        System.out.println("按压");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("进入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("退出");
    }
}
