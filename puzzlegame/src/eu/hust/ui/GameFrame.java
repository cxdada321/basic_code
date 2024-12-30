package eu.hust.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameFrame extends JFrame implements KeyListener, ActionListener {
    //表示游戏界面
    //以后所有跟游戏相关的代码都在这个类中

    int[][] arr = new int[4][4];
    //定义一个空白块的位置
    int x;
    int y;
    String path = "..\\puzzlegame\\image\\animal\\animal3\\";
    boolean flag = false;
    int count = 0;

    //创建选项下面的条目对象，方便按键的时候对比

    JMenuItem restartItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem exitItem = new JMenuItem("关闭游戏");
    JMenuItem authorItem = new JMenuItem("作者信息");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem beautifulGirl = new JMenuItem("美女");
    JMenuItem sport = new JMenuItem("运动");



    //利用构造方法，初始化游戏界面
    public GameFrame() {
        //初始化界面
        initJF();

        //初始化菜单栏
        initMenuBar();

        //打乱数据
        arr = initDate();

        //初始化图片
        initImage(arr);

        //设置游戏界面可见
        this.setVisible(true);
    }

    //初始化图片
    private void initImage(int[][] arr) {
        //清空已经存在的图片
        this.getContentPane().removeAll();

        JLabel count = new JLabel("移动次数：" + this.count);
        count.setBounds(50, 20, 100, 40);
        this.add(count);

        outLabel:
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                if (i != 3 && i1 != 3) {
                    if (arr[i][i1] != 1 + i * 4 + i1 ) {
                        flag = false;
                        break outLabel;
                    }
                } else {
                    flag = true;
                }
            }
        }
        if (flag) {
            this.getContentPane().removeAll();
            JLabel lable = new JLabel(new ImageIcon("..\\puzzlegame\\image\\win.png"));
            lable.setBounds(203, 283, 197, 73);
            this.add(lable);
            this.getContentPane().repaint();
        }

        //双重循环放置图片
        for (int i1 = 1; i1 < 5; i1++) {
            for (int i2 = 0; i2 < 4; i2++) {
                    //相对路径：是相对于当前项目而言的，在当前项目下找文件夹
                    StringBuilder sb = new StringBuilder(path);
                    sb.append(arr[i1-1][i2]).append(".jpg");
                    //创建一个图片ImageIcon对象
                    JLabel lable2 = new JLabel(new ImageIcon(sb.toString()));
                    //设置图片的位置
                    lable2.setBounds(i2 * 105 + 83, (i1-1) * 105 + 134, 105, 105);
                    //给图片添加边框
                    //0:图片凸起来的边框，1：图片凹下去的边框
                    lable2.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    //把管理容器添加到界面中
                    this.add(lable2);
            }
        }
        //后添加的图片在下面
        JLabel lable1 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\background.png"));
        lable1.setBounds(40, 40, 508, 560);
        this.add(lable1);

        //刷新界面
        this.getContentPane().repaint();
    }

    private  int[][] initDate() {
        //创建二维数组保存有利用之后移动图片的位置
        java.util.Random r = new java.util.Random();
        int count = 0;
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                arr[i][i1] = count++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                temp = arr[i][i1];
                int temp1 = r.nextInt(4);
                int temp2 = r.nextInt(4);
                arr[i][i1] = arr[temp1][temp2];
                arr[temp1][temp2] = temp;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                if (arr[i][i1] == 0) {
                    x = i;
                    y = i1;
                }
            }
        }
        return arr;
    }

    //初始化菜单栏
    private void initMenuBar() {
        //初始化菜单栏
        //创建菜单栏
        JMenuBar menuBar = new JMenuBar();

        //创建菜单选项（功能 关于我们）
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");

        JMenu changeImage = new JMenu("更换图片");

        //给条目添加监听
        restartItem.addActionListener(this);
        restartItem.addActionListener(this);
        exitItem.addActionListener(this);
        authorItem.addActionListener(this);
        animal.addActionListener(this);
        beautifulGirl.addActionListener(this);
        sport.addActionListener(this);

        //将每一个选项组合到一起
        functionMenu.add(changeImage);
        functionMenu.add(restartItem);
        functionMenu.add(reloginItem);
        functionMenu.add(exitItem);

        //给条目添加子条目

        aboutMenu.add(authorItem);

        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        changeImage.add(animal);
        changeImage.add(beautifulGirl);
        changeImage.add(sport);

        //将菜单栏添加到游戏界面
        this.setJMenuBar(menuBar);
    }

    //初始化界面
    private void initJF() {
        //设置游戏界面的大小
        //this也可以不写
        this.setSize(603, 680);
        //设置游戏界面的标题
        this.setTitle("拼图单机版");
        //设置置顶
        this.isAlwaysOnTop();
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置关闭窗口的时候，程序退出
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认布局方式吗，设置自己的布局方式
        setLayout(null);

        //设置按键触发
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        if (i == 66) {
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel lable = new JLabel(new ImageIcon(path + "all.jpg"));
            lable.setBounds(83, 134, 420, 420);
            this.add(lable);
            //添加背景图片
            JLabel lable1 = new JLabel(new ImageIcon("..\\puzzlegame\\image\\background.png"));
            lable1.setBounds(40, 40, 508, 560);
            this.add(lable1);
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利就不再移动
        if (flag) {
            return;
        }
        //获取当前释放的那个按键的编号
        int i = e.getKeyCode();
        if (i == 37) {
            //移动图片
            System.out.println("左");
            if (y != 3) {
                int temp = arr[x][y];
                arr[x][y] = arr[x][y + 1];
                arr[x][y + 1] = temp;
                y++;
                count++;
            }
            initImage(arr);
        } else if (i == 38) {
            System.out.println("上");
            if (x != 3) {
                int temp = arr[x][y];
                arr[x][y] = arr[x + 1][y];
                arr[x + 1][y] = temp;
                x++;
                count++;
            }
            initImage(arr);
        } else if (i == 39) {
            System.out.println("右");
            if (y != 0) {
                int temp = arr[x][y];
                arr[x][y] = arr[x][y - 1];
                arr[x][y - 1] = temp;
                y--;
                count++;
            }
            initImage(arr);
        } else if (i == 40) {
            System.out.println("下");
            if (x != 0) {
                int temp = arr[x][y];
                arr[x][y] = arr[x - 1][y];
                arr[x - 1][y] = temp;
                x--;
                count++;
            }
            initImage(arr);
        } else if (i == 65) {
            System.out.println("A");
            int a = 1;
            for (int i1 = 0; i1 < 4; i1++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    if (i1 == 3 && i2 == 3) {
                        arr[i1][i2] = 0;
                    } else {
                        arr[i1][i2] = a++;
                    }
                }
            }
            initImage(arr);
            //一键胜利
        } else if (i == 66){
            initImage(arr);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //当前被点击的条目对象
        Object obj = e.getSource();
        if (obj == restartItem) {
            restartGame();
        } else if (obj == reloginItem) {
            //关闭游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginFrame();
        } else if (obj == exitItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (obj == authorItem) {
            System.out.println("作者信息");
            //用弹框加入二维码
            JDialog jd = new JDialog();
            JLabel label = new JLabel(new ImageIcon("..\\puzzlegame\\image\\about.png"));
            label.setBounds(0, 0, 258, 258);
            jd.getContentPane().add(label);
            //设置弹框大小
            jd.setSize(270, 300);
            //设置标题
            jd.setTitle("作者信息");
            //设置置顶
            jd.isAlwaysOnTop();
            //取消布局
            jd.setLayout(null);
            //设置居中
            jd.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面的界面
            jd.setModal(true);
            //设置关闭窗口的时候，程序不退出
            jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            //设置可见
            jd.setVisible(true);

            /*JFrame jf = new JFrame();
            //设置窗面大小
            jf.setSize(270, 300);
            //标题
            jf.setTitle("作者信息");
            //设置置顶
            jf.isAlwaysOnTop();
            //设置居中
            jf.setLocationRelativeTo(null);

            //加入二维码
            JLabel label = new JLabel(new ImageIcon("..\\puzzlegame\\image\\about.png"));
            label.setBounds(0, 0, 258, 258);
            jf.getContentPane().add(label);

            //取消默认布局
            jf.setLayout(null);
            //关闭窗口的时候，程序不退出
            jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            //设置窗口可见
            jf.setVisible(true);*/
        } else if (obj == animal) {
            Random r = new Random();
            int i = r.nextInt(3) + 1;
            path = "..\\puzzlegame\\image\\animal\\animal" + i + "\\";
            restartGame();
        } else if (obj == beautifulGirl) {
            Random r = new Random();
            int i = r.nextInt(13) + 1;
            path = "..\\puzzlegame\\image\\girl\\girl" + i + "\\";
            restartGame();
        } else if (obj == sport) {
            Random r = new Random();
            int i = r.nextInt(10) + 1;
            path = "..\\puzzlegame\\image\\sport\\sport" + i + "\\";
            restartGame();
        }

    }
    private void restartGame() {
        initDate();
        count = 0;
        flag = false;
        initImage(arr);
    }
}
