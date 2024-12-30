package test;

public class Test10 {
    public static void main(String[] args) {
        /*双色球系统
        * */
        java.util.Random r = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int [] redBall = new int[6];
        //获取用户输入的红球号码
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            redBall[i] = sc.nextInt();
        }
        //获取用户输入的蓝球号码
        System.out.println("请输入蓝球号码：");
        int blueBall = sc.nextInt();
        //获取随机红球号码
        int [] redBall2 = new int[6];
        for (int i = 0; i < redBall2.length; i++) {
            int temp = r.nextInt(33) + 1;
            if (getCount(temp, redBall2) == 0){
                redBall2[i] = temp;
            } else {
                i--;
            }
        }
        //获取随机蓝球号码
        int blueBall2 = r.nextInt(16) + 1;
        //比较用户输入的号码和随机号码
        int count = 0;
        for (int i = 0; i < redBall.length; i++) {
            count += getCount(redBall[i], redBall2);
        }
        count += getCount(blueBall, blueBall2);
        boolean flag = getBlueBall(blueBall, blueBall2);
        //根据中奖号码判断中奖等级
        switch (count){
            case 7 :
                System.out.println("恭喜你中了一等奖！");
                break;
            case 6 :
                if (flag){
                    System.out.println("恭喜你中了三等奖！");
                } else {
                    System.out.println("恭喜你中了二等奖！");
                }
                break;
            case 5 :
                System.out.println("恭喜你中了四等奖！");
                break;
            case 4 :
                System.out.println("恭喜你中了五等奖！");
                break;
            case 3 :
            case 2 :
            case 1 :
                System.out.println("恭喜你中了六等奖！");
                break;
            default:
                System.out.println("很遗憾，没有中奖！");
        }
        System.out.println("中奖号码为：");
        System.out.println("红球：" + redBall2[0] + " " + redBall2[1] + " " + redBall2[2] + " " + redBall2[3] + " " + redBall2[4] + " " + redBall2[5]);
        System.out.println("蓝球：" + blueBall2);
    }

    public static int getCount(int num, int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return 1;
            }
        }
        return 0;
    }

    public static int getCount(int num, int num1){
        if (num == num1){
            return 1;
        }
        return 0;
    }

    public static boolean getBlueBall(int num, int num1){
        if (num == num1){
            return true;
        }
        return false;
    }
}
