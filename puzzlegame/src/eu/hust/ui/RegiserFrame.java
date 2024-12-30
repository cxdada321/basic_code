package eu.hust.ui;

import javax.swing.*;

public class RegiserFrame extends JFrame {
    //表示注册界面
    //以后所有跟注册相关的代码都在这个类中

    public RegiserFrame() {
        this.setSize(488, 500);
        //设置游戏界面的标题
        this.setTitle("注册界面");
        //设置置顶
        this.isAlwaysOnTop();
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭窗口的时候，程序退出
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
