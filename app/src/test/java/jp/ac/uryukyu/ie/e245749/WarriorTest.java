package jp.ac.uryukyu.ie.e245749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void attackTest() {
        int defaultWarriorAttack = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", defaultWarriorAttack * 3/2 , 10);
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(0, slime.getHitPoint());
    }
}