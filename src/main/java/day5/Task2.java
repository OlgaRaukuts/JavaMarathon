package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("BMW","Black",2008);

        System.out.println("the Motorbike make " + motorbike.getMake() + " of " + motorbike.getColor() + " color is available." + "manufactured " + motorbike.getYear());
    }
}
