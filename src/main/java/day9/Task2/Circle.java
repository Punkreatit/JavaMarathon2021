package day9.Task2;

public class Circle extends Figure {
    private double radius;
    private double radius1;
    private double perimeter1;

    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }

    @Override
    public double area() {
        return (Math.PI*(radius*radius));

    }

    @Override
    public double perimeter() {
        return (2*Math.PI*radius);

    }
}
