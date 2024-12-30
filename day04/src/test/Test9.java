package test;

public class Test9 {
    public static void main(String[] args) {
        /*需求：实际开发中，如果要获取一个范围中的每个数据，会用到循环
        大多数情况下不会获取所有数据，而是获取其中的一部分
        例如：打印1~100之间的偶数和
         */
        int sum = 0;
        for(int i = 1; i <= 100 ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1~100之间的偶数和为：" + sum);
    }
}
