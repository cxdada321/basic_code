package interfacedemo3;

public class PingPangAthlete extends People implements English{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void work() {
        System.out.println("学打乒乓球");
    }
}
