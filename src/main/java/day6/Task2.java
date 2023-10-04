package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boing", 2020,35.9,879);
        airplane.setFuel(500);
        airplane.info();
        airplane.fillUp(50);
        airplane.setYear(1998);
        airplane.info();
        airplane.setLength(78.9);
        airplane.info();
        airplane.fillUp(80);
        airplane.info();
    }
}
