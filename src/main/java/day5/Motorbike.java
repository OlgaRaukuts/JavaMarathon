package day5;

public class Motorbike {
    private String make;
    private String color;
    private int year;

    public Motorbike(String make, String color, int year){
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
