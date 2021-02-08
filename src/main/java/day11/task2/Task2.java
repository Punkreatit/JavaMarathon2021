package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Palladin palladin1 = new Palladin();
        Shaman shaman1 = new Shaman();
        Magician magician1=new Magician();


        warrior1.physicalAttack(palladin1);
        System.out.println(palladin1);

        palladin1.physicalAttack(magician1);
        System.out.println(magician1);

        shaman1.healTeammate(magician1);
        System.out.println(magician1);

        magician1.magicalAttack(palladin1);
        System.out.println(palladin1);

        shaman1.physicalAttack(warrior1);
        System.out.println(warrior1);

        palladin1.healHimself();
        System.out.println(palladin1);

        for(int i=0; i<5;i++){
        warrior1.physicalAttack(magician1);
        System.out.println(magician1);}
    }
}
