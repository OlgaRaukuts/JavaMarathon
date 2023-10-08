package day9.Task2;

public class Triangle extends Figure{

    private double lengthA;
    private double lengthB;
    private double lengthC;
    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double halfP = perimeter()/2;
        return Math.sqrt(halfP * (halfP - lengthA) * (halfP - lengthB) * (halfP - lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}
