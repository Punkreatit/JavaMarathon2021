package day7;

public class Player {

    private int stamina;
    private static final int MAXSTAMINA = 100;
    private static final int MINSTAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


    public void run() {

        if (stamina == MINSTAMINA) {
            return;}

        stamina--;

        if(stamina==MINSTAMINA){
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные, на поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
        //System.out.println(countPlayers);
    }
}


