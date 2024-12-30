package innerclassdemo3;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            //new Outer().new Inner()的时候在创建Inner对象的时候会自动把Outer对象也创建出来并把地址自动给到Inner对象，即Outer.this
            System.out.println(Outer.this.a);
            //System.out.println(new Outer().a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
    public Inner getInner() {
        return new Inner();
    }
}
