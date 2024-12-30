package oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        hasky hk = new hasky();
        hk.eat();
        hk.drink();
        hk.protect();
        hk.behavior();

        sapiDog sd = new sapiDog();
        sd.lunch();
        sd.drink();
        sd.protect();

        chineseDog cd = new chineseDog();
        cd.eat();
        cd.drink();
        cd.protect();
    }
}

class animal {
    public void eat() {
        System.out.println("吃狗粮");
    }
    public void drink() {
        System.out.println("喝水");
    }
    public void protect() {
        System.out.println("看家");
    }
}

class hasky extends animal {
    public void behavior() {
        System.out.println("拆家");
    }
}

class sapiDog extends animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void lunch() {
        this.eat();
        super.eat();
    }
}

class chineseDog extends animal {

    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}

