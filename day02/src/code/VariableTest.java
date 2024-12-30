package code;

public class VariableTest {
    public static void main(String[] args) {
        //一开始没乘客
        //1：上一
        //2：上二下一
        //3：上二下一
        //4：下一
        //5：上一
        //请问：到了终点共多少乘客

        int passenger = 0;
        passenger +=  1;

        passenger +=  2 - 1;
        passenger = passenger + 2 - 1;
        passenger = passenger - 1;
        passenger = passenger + 1;
        System.out.println(passenger);
        System.out.println(0b11);
    }
}
