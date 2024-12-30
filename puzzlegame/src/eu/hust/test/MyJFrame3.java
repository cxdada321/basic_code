package eu.hust.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    public MyJFrame3() {

        this.setSize(603, 680);
        this.setTitle("事件演示");
        this.isAlwaysOnTop();
        //设置页面居中
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //给整个窗体添加键盘监听
        //调用者this：本类对象，当前的窗体对象，表示要给整个窗体添加监听
        //addKeyListener：表示添加键盘监听
        //参数this：当事件被触发后，会调用当前类的方法
        this.addKeyListener(this);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //细节1：
    //当键盘按下没有松开的时候，会反复调用这个方法
    //细节2：
    //键盘那么多按键怎么区分
    //每个按键都有对应编号区分
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("释放");
        //获取当前释放的那个按键的编号
        int i = e.getKeyCode();
        System.out.println(i);
    }
}
