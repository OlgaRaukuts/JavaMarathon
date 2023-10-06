package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boing",2004,90,990);
        Airplane airplane1 = new Airplane("Boing", 1998,90,990);
        Airplane.compareAirplanes(airplane,airplane1);
    }
}