package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    int magicAtt;

    public Magician() {
        physDef = 0.0;
        magicDef = 0.8;
        physAtt = 5;
        this.magicAtt = 20;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}


