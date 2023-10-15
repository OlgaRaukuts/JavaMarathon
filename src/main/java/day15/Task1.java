package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file1 = new File("src/main/resources/missing_shoes.txt");
        file1.getParentFile().mkdirs();
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String[] shoes = scanner.nextLine().split(";");

            if (Integer.parseInt(shoes[2]) == 0) {

                printWriter.println(shoes[0] + ";" + shoes[1] + ";" + shoes[2]);

            }
        }
            printWriter.close();
            scanner.close();
        }
    }

