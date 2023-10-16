package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("textfile.txt");

        printResult(file);

    }

    public static void printResult(File file){
        double average = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (String number: numbers)
                average += (int) Double.parseDouble(number);

            System.out.println("Среднее арифметическое в файле: " + average/numbers.length);

            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println("Среднее арифметическое в файле: " + df.format(average/numbers.length));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

