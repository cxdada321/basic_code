package hust.edu.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    static ArrayList<String> list = new ArrayList<>();//作为全局变量不断更新
    public static void main(String[] args) {
        /*键盘录入一些1~100之间的整数，并添加到集合中
        * 直到集合中的数据和超过200为止*/
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一些1~100之间的整数：");
        String str = s.nextLine();
        getNum(str, list);//获取输入的数字
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        int sum = sumNum(list);//计算集合中的数据总和

        //判断是否超过200

        while (sum <= 200) {
            System.out.println("总和不够200，请再输入一些1~100之间的整数：");
            str = s.nextLine();
            getNum(str, list);//获取输入的数字
            sum = sumNum(list);//计算集合中的数据总和
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("总和超过200，结束输入。");
    }

    private static int sumNum(ArrayList<String> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Integer.parseInt(list.get(i));
        }
        return sum;
    }

    private static void getNum(String str, ArrayList<String> list) {
        //int index = 0;//记录str中的空格的位置
        //把str里的数字分别装入list中

        //判断哪部分是数字
        //用正则表达式获取里面的数字
        Pattern p = Pattern.compile("\\d+(?= *)");
        Matcher m = p.matcher(str);
        while(m.find()) {
            list.add(m.group());
        }

        /*for (int i = 0; i < str.length(); i++) {
            //外层嵌套用于获取最后一个数字
            if (i != str.length() - 1) {
                if (str.charAt(i) == ' ') {
                    list.add(str.substring(index, i));
                    index = i + 1;
                }
            } else {
                list.add(str.substring(index, i+1));
            }
        }*/

    }
}
