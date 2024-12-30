package test.test1;

public class Test {
    public static void main(String[] args) {
        People feeder = new People();
        feeder.setName("老王");
        feeder.setAge(30);
        Animal a = new Dog(2, "黑");
        feeder.keepPet(a, "骨头");
        People feeder1 = new People();
        feeder1.setName("老李");
        feeder1.setAge(25);
        Animal b = new Cat(3, "灰");
        feeder1.keepPet(b, "鱼");
        Dog d = (Dog) a;
        d.lookHome();
        Cat c = (Cat) b;
        c.catchMouse();
    }
}
