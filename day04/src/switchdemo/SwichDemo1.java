package switchdemo;

public class SwichDemo1 {
    public static void main(String[] args) {
        //兰州拉面、武汉热干面、重庆小面、沙县小吃

        String mian = "重庆小面";
        switch(mian){
            case"兰州拉面":
                System.out.println("兰州拉面");
                break;
            case"武汉热干面":
                System.out.println("武汉热干面");
                break;
            case"重庆小面":
                System.out.println("重庆小面");
                break;
            case"沙县小吃":
                System.out.println("沙县小吃");
                break;
            default:
                System.out.println("没有这个");
        }
    }
}
