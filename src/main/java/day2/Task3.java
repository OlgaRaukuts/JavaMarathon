package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        int i = a+1;
        while (i<b){
            i++;if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }else if (a >= b) {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
