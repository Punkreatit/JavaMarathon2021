package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private Warehouse w;
    private boolean isPayed;


    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


    @Override
    public void doWork() {
        salary += 100;
        w.setCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус сборщику пока не доступен");
            return;
        }

        if (isPayed = true) {
            System.out.println("Бонус сборщику уже выплачен");
        }

        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", w=" + w +
                ", isPayed=" + isPayed +
                '}';
    }
}


