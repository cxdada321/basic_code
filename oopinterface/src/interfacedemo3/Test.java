package interfacedemo3;

public class Test {
    public static void main(String[] args) {
        BasketballAthlete basketballAthlete = new BasketballAthlete("姚明", 20);
        basketballAthlete.work();
        basketballAthlete.speakEnglish();
        BasketballTeacher basketballTeacher = new BasketballTeacher("大姚", 20);
        basketballTeacher.work();
        PingPangTeacher pingPangTeacher = new PingPangTeacher("黎明", 30);
        pingPangTeacher.work();
        PingPangAthlete pingPangAthlete = new PingPangAthlete("刘翔", 25);
        pingPangAthlete.work();
        pingPangAthlete.speakEnglish();

    }
}
