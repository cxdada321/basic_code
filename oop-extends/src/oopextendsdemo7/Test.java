package oopextendsdemo7;

public class Test {
    public static void main(String[] args) {
        Lectuer le = new Lectuer();
        le.work();
        le.setId("001");
        le.setName("John");
        System.out.println("Lectuer: " + le.getId() + " " + le.getName());
    }
}
