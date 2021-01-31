package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane samolet = new Airplane("Boeing", 2006, 150, 20);
        samolet.info();
        System.out.println();
        samolet.setYear(2001);
        samolet.setLength(120);
        samolet.fillUp(2000);
        samolet.fillUp(500);
        samolet.info();


    }
}
