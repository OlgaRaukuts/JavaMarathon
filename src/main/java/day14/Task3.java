package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people.txt");

        try {
            System.out.println(parseFileToObjList(file));

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Person> people = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] person = line.split(" ");

            Person person1 = new Person(person[0],Integer.parseInt(person[1]));
            people.add(person1);


        if(Integer.parseInt(person[1]) < 0)
            throw new IllegalArgumentException();

        people.add(person1);
    }

        return people;
}
}
