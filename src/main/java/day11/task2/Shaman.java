package day11.task2;

public class Shaman extends Hero implements Healer,PhysAttack,MagicAttack {
    int magicAtt;

    public Shaman() {
        physDef = 0.20;
        magicDef = 0.20;
        physAtt = 10;
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health<=50){
            health+=50;
        }else if(health>50){
            health=MAXHP;
        }
    }


    public void healTeammate(Hero hero) {
        if(hero.health<=70){
            hero.health+=30;
        }else
            hero.health=MAXHP;
        }


    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt*(1-hero.magicDef);
        if(hero.health<0){
            hero.health=MINHP;
        }else
            hero.health-=attack;


    }

    @Override
    public String toString() {
        return "Shaman " +
                "health=" + health;
    }
}
