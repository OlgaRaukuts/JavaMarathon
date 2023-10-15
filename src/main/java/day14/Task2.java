package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("people.txt");

        try {
            parseFileToStringList(file);

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        List<String> people = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] person = line.split(" ");
            if(Integer.parseInt(person[1]) < 0)
                throw new IllegalArgumentException();

            people.add(line);
        }


        for(String persons : people){
            System.out.println(persons);
        }
        return people;
    }

}
