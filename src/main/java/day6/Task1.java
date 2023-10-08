package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car("BMW","Black",2003);
        car.info();
        int yearDifference = car.yearDifference(2020);
        System.out.println(yearDifference);
        Motorbike motorbike = new Motorbike("Harley Davidson","Black",1998);
        motorbike.info();
        motorbike.yearDifference(2023);
        System.out.println(motorbike.yearDifference);
    }
}
