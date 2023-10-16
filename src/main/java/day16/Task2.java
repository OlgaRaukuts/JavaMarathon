package day16;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file1.txt");
        PrintWriter printWriter = new PrintWriter(file);

        Random random = new Random();

        for (int i = 0; i < 1000; i++)
            printWriter.println(random.nextInt(100));
        printWriter.close();

        File file2 = new File("file2.txt");
        PrintWriter printWriter1 = new PrintWriter(file2);

        Scanner scanner = new Scanner(file);

        int counter = 0;
        int average = 0;
        while (scanner.hasNextLine()) {
            average += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20) {
                printWriter1.println(average / 20);
                counter = 0;
                average = 0;
            }

        }

        printWriter1.close();


        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double sum = 0;

        while (scanner2.hasNextLine()) {
            sum += (int) Double.parseDouble(scanner2.nextLine());
        }
        System.out.println(sum);
    }

}