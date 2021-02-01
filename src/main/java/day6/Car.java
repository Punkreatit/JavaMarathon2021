package day6;


public class Car {
    private int yearOfRelease;
    private String color;
    private String model;
    private int yearDifference;


    public void setModel(String z) {
        model = z;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfRelease(int x) {
        yearOfRelease = x;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setColor(String a) {
        color = a;
    }

    public String getColor() {
        return color;
    }

    void print() {
        System.out.println("Модель брички: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("год выпуска: " + yearOfRelease);
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        //System.out.println("Разница с указанным годом: " + yearDifference + " лет.");
        return Math.abs(inputYear - yearOfRelease);
    }


}





