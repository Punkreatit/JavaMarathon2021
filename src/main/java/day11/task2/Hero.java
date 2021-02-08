package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MINHP = 0;
    final int MAXHP=100;
    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if (hero.health-physAtt < 0) {
            hero.health = MINHP;
        } else
            hero.health -= attack;
    }

}
