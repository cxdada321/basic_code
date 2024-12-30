package interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙", 2);
        frog.eat();
        frog.swim();
        Rabbit rabbit = new Rabbit("兔子", 3);
        rabbit.eat();
        Dog dog = new Dog("狗", 4);
        dog.eat();
        dog.swim();
    }
}
