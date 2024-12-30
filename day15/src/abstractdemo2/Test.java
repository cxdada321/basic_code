package abstractdemo2;

public class Test {
    public static void main(String[] args) {

        Animal a = new Frog("Frog", 1);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a.drink();
        Dog d = new Dog("Dog", 2);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.drink();
        Sheep s = new Sheep("Sheep", 3);
        System.out.println(s.getName() + "," + s.getAge());
        s.eat();
        s.drink();
    }
}
