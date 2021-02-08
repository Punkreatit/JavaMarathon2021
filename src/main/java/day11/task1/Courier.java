package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;

    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        w.setCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус курьеру пока не доступен");
            return;
        }

        if (isPayed = true) {
            System.out.println("Бонус курьеру уже выплачен");
        }

        salary += 50000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", w=" + w +
                '}';
    }
}
