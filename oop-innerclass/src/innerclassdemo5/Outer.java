package innerclassdemo5;

public class Outer {
    int b = 20;
    public void show() {
        int a = 10;
        class Inner {
            public void show() {
                System.out.println(a);
                System.out.println(b);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
