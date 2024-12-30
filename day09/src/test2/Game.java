package test2;

public class Game {
    private String name;
    private int hp;
    private char gender;
    private String face;
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};


    java.util.Random r = new java.util.Random();

    public Game() {
    }


    public Game(String name, int hp, char gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        setFace(gender);
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

    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }

    public void setFace(char gender) {
        if (gender == '男'){
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        }else {
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        }
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void showRoleinfo(){
        System.out.println("姓名：" + name + " 血量：" + hp + "性别:" + gender + "相貌：" + face);
    }

}
