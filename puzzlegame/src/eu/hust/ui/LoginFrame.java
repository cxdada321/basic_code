package eu.hust.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class LoginFrame extends JFrame implements MouseListener{
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("admin", "123456"));
        list.add(new User("wanglei", "123456"));
    }
    //创建输入框用于后面比较
    JTextField userName = new JTextField("");
    JPasswordField passwordField = new JPasswordField("");
    JTextField codeTextField = new JTextField();

    //表示登陆界面
    //以后所有跟登陆相关的代码都在这个类中

    //设置登录按钮用于设置事件
    String path1 = "..\\puzzlegame\\image\\login\\登录按钮.png";
    String path2 = "..\\puzzlegame\\image\\login\\注册按钮.png";
    //创建对象用于监听
    JButton login = new JButton();
    JButton register = new JButton();

    JLabel codeText = new JLabel();

    //设置验证码用于验证
    String code = yanZhengword();
    public LoginFrame() throws HeadlessException{
        //初始化界面
        initJF();

        //初始化内容
        initItem();

        //

        //使内容可见
        this.setVisible(true);
    }

    private void initItem() {
        //清除所有组件
        this.getContentPane().removeAll();

        //设置用户名
        JLabel label2 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\login\\用户名.png"));
        label2.setBounds(100, 100, 100, 100);
        this.getContentPane().add(label2);
        //设置用户名输入框，明文输入
        userName.setBounds(200, 135, 150, 30);
        this.getContentPane().add(userName);

        //设置密码
        JLabel label3 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\login\\密码.png"));
        label3.setBounds(100, 150, 100, 100);
        this.getContentPane().add(label3);
        //设置密码输入框，密文输入
        passwordField.setBounds(200, 185, 150, 30);
        this.getContentPane().add(passwordField);

        //设置验证码
        JLabel label4 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\login\\验证码.png"));
        label4.setBounds(100, 200, 100, 100);
        this.getContentPane().add(label4);
        //设置验证码输入框
        codeTextField.setBounds(200, 235, 75, 30);
        this.getContentPane().add(codeTextField);
        //设置要输入的验证码
        codeText.setText(code);
        codeText.setBounds(300, 235, 75, 30);
        this.getContentPane().add(codeText);

        //设置登录按钮
        login.setIcon(new ImageIcon(path1));
        login.setBounds(123, 310, 128, 47);
        //去掉按钮默认边框
        login.setBorderPainted(false);
        //去掉默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //设置注册按钮
        register.setIcon(new ImageIcon(path2));
        register.setBounds(256, 310, 128, 47);
        //去掉按钮默认边框
        login.setBorderPainted(false);
        //去掉默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //设置游戏背景
        JLabel lable1 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\login\\background.png"));
        lable1.setBounds(0, 0, 470, 390);
        this.getContentPane().add(lable1);


        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJF() {

        this.setSize(488, 430);
        //设置游戏界面的标题
        this.setTitle("登录界面");
        //设置置顶
        this.isAlwaysOnTop();
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置必须关闭页面后才能操作其他页面
        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        //设置关闭窗口的时候，程序退出
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消内部默认布局
        this.setLayout(null);

        //给按钮添加事件
        login.addMouseListener(this);
        register.addMouseListener(this);
        codeText.addMouseListener(this);
    }

    private String yanZhengword() {
        //验证码
        //给定一个字符串，随机生成一个验证码
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 26; i++) {
                sb.append((char)((65 + j * 32) + i ));
            }
        }
        //随机选一个位置为数字，其余为字母
        int index = new Random().nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (index == i) {
                sb1.append(arr[new Random().nextInt(10)]);
            } else {
                sb1.append(sb.charAt(new Random().nextInt(52)));
            }

        }
        return sb1.toString();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //验证用户名密码是否正确
        String username = userName.getText();
        String password = passwordField.getText();
        String code = codeTextField.getText();
        System.out.println("code: " + code);
        System.out.println("codeText: " + codeText.getText());
        Object obj = e.getSource();
        //点击验证码
        if (obj == codeText) {
            this.code = yanZhengword();
            initItem();;
            //点击登录按钮
        } else if (obj == login) {
            //判断验证码是否正确
            if (code.equalsIgnoreCase(codeText.getText())) {
                //判断用户名和密码是否正确
                if (username.equals("") || password.equals("")) {
                    showJDialog("用户账号或密码不能为空");
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (username.equals(list.get(i).getUsername()) && password.equals(list.get(i).getPassword())) {
                            showJDialog("登录成功");
                            //登录成功，关闭当前窗口，打开游戏界面
                            this.dispose();
                            new GameFrame();
                            return;
                        }
                    }
                    showJDialog("用户账号或密码错误");
                }
                userName.setText("");
                passwordField.setText("");
                codeTextField.setText("");
                this.code = yanZhengword();
                initItem();
            } else {
                codeTextField.setText("");
                //验证码错误，再次生成验证码
                System.out.println("验证码错误");
                showJDialog("验证码错误");
                this.code = yanZhengword();
                initItem();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按压");
        Object obj = e.getSource();
        if (obj == login) {
            System.out.println("登录");
            //设置鼠标点击事件，按下鼠标时图片变灰
            path1 = "..\\puzzlegame\\image\\login\\登录按下.png";
            initItem();
        } else if (obj == register) {
            System.out.println("注册");
            path2 = "..\\puzzlegame\\image\\login\\注册按下.png";
            initItem();
            //new RegiserFrame();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            //松开按键恢复
            path1 = "..\\puzzlegame\\image\\login\\登录按钮.png";
            initItem();
        }
        if (obj == register) {
            path2 = "..\\puzzlegame\\image\\login\\注册按钮.png";
            initItem();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void showJDialog(String content) {
        //创建弹窗对象
        JDialog jd = new JDialog();
        //设置大小
        jd.setSize(200, 150);
        //不关闭窗口，无法操作其他窗口
        jd.setModal(true);
        //设置居中
        jd.setLocationRelativeTo(null);
        //置顶
        jd.setAlwaysOnTop(true);

        //JLbel显示内容
        JLabel label = new JLabel(content);
        label.setBounds(0, 0, 200, 150);
        jd.getContentPane().add(label);

        //设置可见
        jd.setVisible(true);
    }
}
