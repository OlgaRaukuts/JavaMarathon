package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("textfile.txt");

        try {
            printSumDigits(file);

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        int sum = 0;
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        for (String number: numbers)
            sum += Integer.parseInt(number);

        System.out.println("Сумма чисел в файле: " + sum);

        if(numbers.length != 10){
            throw new IllegalArgumentException();
        }
    }
}
