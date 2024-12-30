package test;

public class Test5 {
    public static void main(String[] args) {
        /*评委打分
        * 歌唱比赛中，6名评委打分，范围是[0-100]的整数
        * 选手最后得分是去掉最高分和最低分的平均分，完成上述过程并计算选手得分*/
        int [] score = new int [6];
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数：");
            java.util.Scanner s = new java.util.Scanner(System.in);
            score[i] = s.nextInt();
            if (score[i] < 0 || score[i] > 100) {
                System.out.println("输入错误，请重新输入！");
            }else {
                i++;
            }
        }
        int max = score[0];
        for (int i = 1; i <= 5; i++) {
            max = max > score[i] ? max : score[i];
        }
        int min = score[0];
        for (int i = 1; i <= 5; i++) {
            min = min < score[i] ? min : score[i];
        }
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += score[i];
        }
        System.out.println("选手的得分是：" + (sum - max - min) / 4);
    }
}
