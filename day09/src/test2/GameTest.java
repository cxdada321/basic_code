package test2;

public class GameTest {
    /*文字版格斗游戏
    * 格斗游戏，每个游戏角色的姓名、血量都不相同，在选定人物的时候（new对象的时候）
    * 这些信息就应该确定下来*/
    public static void main(String[] args) {
        Game player1 = new Game("player1", 100, '男');
        Game player2 = new Game("player2", 100 , '女');

        //attack 攻击描述：
        String[] attacks_desc={
                "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
                "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
                "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
                "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
                "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
                "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
        };

        //injured 受伤描述：
        String[] injureds_desc={
                "结果%s退了半步，毫发无损",
                "结果给%s造成一处瘀伤",
                "结果一击命中，%s痛得弯下腰",
                "结果%s痛苦地闷哼了一声，显然受了点内伤",
                "结果%s摇摇晃晃，一跤摔倒在地",
                "结果%s脸色一下变得惨白，连退了好几步",
                "结果『轰』的一声，%s口中鲜血狂喷而出",
                "结果%s一声惨叫，像滩软泥般塌了下去"
        };

        player1.showRoleinfo();
        player2.showRoleinfo();


        boolean flag = true;
        while (flag){
            flag = isFlag(player1, player2, flag, attacks_desc, injureds_desc);
            if (flag == true){
                flag = isFlag(player2, player1, flag, attacks_desc, injureds_desc);
            }
        }


    }

    private static boolean isFlag(Game player1, Game player2, boolean flag, String[] attacks_desc, String[] injureds_desc) {
        java.util.Random r = new java.util.Random();
        if (player2.getHp() > 0) {
            int hurt = player1.attack(player1.getHp());
            //输出一个攻击描述
            System.out.printf("\n" + attacks_desc[r.nextInt(attacks_desc.length)] + "\n", player2.getName(), player1.getName());
            System.out.println(player2.getName() + "攻击" + player1.getName() + "造成了" + hurt + "点伤害, " + player1.getName() + "剩余血量：" + player1.getHp());
            switch (hurt) {
                case 0:
                    System.out.printf(injureds_desc[0] + "\n", player1.getName());
                    break;
                case 1:
                    System.out.printf(injureds_desc[1] + "\n", player1.getName());
                    break;
                case 2:
                    System.out.printf(injureds_desc[2] + "\n", player1.getName());
                    break;
                case 3:
                    System.out.printf(injureds_desc[3] + "\n", player1.getName());
                    break;
                case 4:
                    System.out.printf(injureds_desc[4] + "\n", player1.getName());
                    break;
                case 5:
                    System.out.printf(injureds_desc[5] + "\n", player1.getName());
                    break;
                case 6:
                    System.out.printf(injureds_desc[6] + "\n", player1.getName());
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.printf(injureds_desc[7] + "\n", player1.getName());
                    break;
            }
        }else {
            System.out.println(player2.getName() + "已经死亡");
            flag = false;
        }
        return flag;
    }
}


