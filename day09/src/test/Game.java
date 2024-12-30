package test;

public class Game {
    String name;
    int hp;

    java.util.Random r = new java.util.Random();

    public Game() {
    }

    public Game(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int attack(int hp) {
        int hurt = r.nextInt(10) + 1;
        this.hp -= hurt;
        this.hp = this.hp < 0 ? 0 : this.hp;
        return hurt;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 设置
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
}
