package test;

public class GameTest {
    /*文字版格斗游戏
    * 格斗游戏，每个游戏角色的姓名、血量都不相同，在选定人物的时候（new对象的时候）
    * 这些信息就应该确定下来*/
    public static void main(String[] args) {
        Game player1 = new Game("player1", 100);
        Game player2 = new Game("player2", 100);
        boolean flag = true;
        while (flag){
            flag = isFlag(player1, player2, flag);
            if (flag == true){
                flag = isFlag(player2, player1, flag);
            }
        }
    }

    private static boolean isFlag(Game player1, Game player2, boolean flag) {
        if (player2.hp > 0) {
            int hurt = player1.attack(player1.hp);
            System.out.println(player2.getName() + "攻击" + player1.getName() + "造成了" + hurt + "点伤害, " + player1.getName() + "剩余血量：" + player1.getHp());
        }else {
            System.out.println(player2.getName() + "已经死亡");
            flag = false;
        }
        return flag;
    }
}


