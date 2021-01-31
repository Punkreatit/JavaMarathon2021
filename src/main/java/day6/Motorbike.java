package day6;


public class Motorbike {
    private String model;
    private String color;
    private int year;
    //private int yearDifference;


    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void print() {
        System.out.println("год: " + year);
        System.out.println("цвет: " + color);
        System.out.println("модель: " + model);
        //System.out.println("Разница с указанным годом: " + yearDifference + " лет.");

    }

    public void info() {
        System.out.println("Это мотоцикл");
    }


    public int yearDifference(int inputYear) {
            return Math.abs(inputYear-year);
        }

    }