package skiploop;

public class SkiploopDemo2 {
    public static void main(String[] args) {
        //结束整个循环
        for(int i = 1; i <= 5; i++) {
            if(i == 3){
                //结束整个循环
                break;
            }
                System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
