package jp.ac.uryukyu.ie.e245749;

public class Warrior extends LivingThing{

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(opponent.isDead() != true){
            int damage = getAttack() *  3/2 ;
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}