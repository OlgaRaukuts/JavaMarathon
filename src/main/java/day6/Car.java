package day6;

public class Car {
    private String make;
    private String color;
    private int year;

    public Car(String make, String color, int year) {
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference;
    int yearDifference(int inputYear){

        return yearDifference = inputYear - this.year;
    }
}
