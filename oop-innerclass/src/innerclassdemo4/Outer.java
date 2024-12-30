package innerclassdemo4;

public class Outer {
    int a =10;
    static int b = 20;
    public void show1() {
        System.out.println("Outer show1");
    }
    static class Inner {
        public void show() {
            System.out.println(new Outer().a);
            System.out.println("Inner show");
        }
        public static void show2() {
            System.out.println("Inner show2");
        }
    }
}
