package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public void info() {
        System.out.println("Производитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel(int a) {
        return this.fuel;
    }

    public void fillUp(int f) {
        fuel = fuel + f;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        {
            System.out.println(Math.max(a.length, b.length));

        }


    }


}


