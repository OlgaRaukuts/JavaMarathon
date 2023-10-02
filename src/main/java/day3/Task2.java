package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();


            double result = a/b;
            System.out.println(result);
            if(b==0){
                System.out.println("работа программы завершается");
                break;
            }
        }

    }
}
