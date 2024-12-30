package test;

public class Phone {

    //属性
    String brand;
    double price;

    //行为
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}