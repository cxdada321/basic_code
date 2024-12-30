package interfacedemo3;

public class BasketballAthlete extends People implements English{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }
    @Override
    public void work() {
        System.out.println("学打篮球");
    }
    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
