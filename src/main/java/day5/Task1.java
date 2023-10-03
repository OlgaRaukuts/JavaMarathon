package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setColor("Green");
        car.setYear(2020);

        System.out.println("the car make " + car.getMake() + " of " + car.getColor() +" color is available." + "manufactured " + car.getYear());
    }
}
