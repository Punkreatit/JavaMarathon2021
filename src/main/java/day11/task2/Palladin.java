package day11.task2;

public class Palladin extends Hero implements Healer,PhysAttack {

    public Palladin() {
        physDef=0.5;
        magicDef=0.20;
        physAtt=15;

    }

    @Override
    public void healHimself() {
        if(health<=75){
            health+=25;
        }else
            health=MAXHP;
        }


    @Override
    public void healTeammate(Hero hero) {
        if(hero.health<=90){
            hero.health+=10;
        }else if(hero.health>90){
            hero.health=MAXHP;
        }

    }

    @Override
    public String toString() {
        return "Palladin{" +
                "health=" + health +
                '}';
    }
}
