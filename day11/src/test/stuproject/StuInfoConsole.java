package test.stuproject;

import java.util.ArrayList;

import java.util.Scanner;

public class StuInfoConsole {
    //主要这里的main方法要改名字
    public static void studentSystem() {
        /*学生管理系统
         * 添加
         * 删除
         * 修改
         * 查询
         * 退出*/
        //初始菜单
        final int ADD_STUDENT = 1;
        final int REMOVE_STUDENT = 2;
        final int UPDATE_STUDENT = 3;
        final int FIND_STUDENT = 4;
        final int EXIT = 5;
        System.out.println("欢迎使用学生管理系统");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        ArrayList<StuInfo> list = new ArrayList<>();
        int count = 0;
        int select;
        boolean flag = true;
        //选择功能
        loop: while (flag) {
            //判断是否是第一次选择
            if (count == 0) {
                System.out.println("请选择进行的操作：");
                select = new Scanner(System.in).nextInt();
            } else {
                System.out.println("请继续选择要进行的操作：");
                select = new Scanner(System.in).nextInt();
            }
            //判断选择的功能
            switch (select) {
                //添加学生信息
                case ADD_STUDENT: {
                    list = addStu(list);
                    break;
                }
                //删除学生信息
                case REMOVE_STUDENT: {
                    System.out.println("请输入要删除的学生学号：");
                    String id = new Scanner(System.in).next();
                    removeStuinfo(list, id);
                    break;
                }
                case UPDATE_STUDENT: {
                    System.out.println("请输入要修改学生的学号：");
                    String id = new Scanner(System.in).next();
                    updateStuinfo(list, id);
                    break;
                }
                case FIND_STUDENT: {
                    findStuinfo(list);
                    break;
                }
                case EXIT: {
                    System.out.println("退出成功");
                    break loop;
                }
                default: {
                    //退出整个外循环体，也可以用加标号的形式，即loop:while    break loop;
                    //flag = false;
                    //break;
                    break loop;
                    //System.exit(0);即结束整个程序
                }
            }
        }

    }

    public static ArrayList<StuInfo> addStu(ArrayList<StuInfo> list) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        //反复操作
        while (flag) {
            StuInfo stu = new StuInfo();
            System.out.println("请输入学生学号：");
            stu.setId(sc.next());
            boolean flag1 = true;
            //判断id是否存在
            while (flag1) {
                //list初始没有值的时候for循环进不去
                if (list == null || list.size() == 0) {
                    System.out.println("学号可用");
                    break;
                }
                for (int i = 0; i < list.size(); i++) {
                    if (stu.getId().equals(list.get(i).getId())) {
                        System.out.println("学号重复，请重新输入");
                        stu.setId(sc.next());
                    } else {
                        System.out.println("学号可用");
                        flag1 = false;
                        break;
                    }
                }
            }
            System.out.println("请输入学生姓名：");
            stu.setName(sc.next());
            System.out.println("请输入学生年龄：");
            stu.setAge(sc.nextInt());
            System.out.println("请输入学生地址：");
            stu.setAdress(sc.next());
            list.add(stu);
            System.out.println("是否继续添加学生信息？（y/n）");
            String str = sc.next();
            if (str.equals("n")) {
                flag = false;
            }
        }
        return list;
    }

    public static void removeStuinfo(ArrayList<StuInfo> list, String id) {
        if (list.size() == 0) {
            System.out.println("学生信息为空");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (id.equals(list.get(i).getId())) {
                    list.remove(i);
                    System.out.println("删除成功");
                    return;
                }
            }
            System.out.println("id不存在");
        }
    }

    public static void updateStuinfo(ArrayList<StuInfo> list, String id) {
        Scanner sc = new Scanner(System.in);
        StuInfo stu = new StuInfo();
        if (list.size() == 0) {
            System.out.println("学生信息为空");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (id.equals(list.get(i).getId())) {
                    stu.setId(id);
                    System.out.println("请输入学生姓名：");
                    stu.setName(sc.next());
                    System.out.println("请输入学生年龄：");
                    stu.setAge(sc.nextInt());
                    System.out.println("请输入学生地址：");
                    stu.setAdress(sc.next());
                    list.set(i, stu);
                    return;
                }
            }
            System.out.println("id不存在");
        }

    }

    public static void findStuinfo(ArrayList<StuInfo> list) {
        if (list.size() == 0) {
            System.out.println("学生信息为空，请添加后再查询");
        } else {
            System.out.println("id\t姓名\t年龄\t地址");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%s\t%s\t\t%d\t\t%s\n", list.get(i).getId(), list.get(i).getName(), list.get(i).getAge(), list.get(i).getAdress());
                System.out.println();
            }
        }
    }
}
