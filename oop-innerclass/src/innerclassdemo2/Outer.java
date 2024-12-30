package innerclassdemo2;

public class Outer {
    private class Inner {
        public String name = "Inner";
        public void show() {
            System.out.println("Inner show");
        }
    }
    public Inner getInner() {
        return new Inner();
    }
    public void show() {
        System.out.println("Outer show");
    }

}
