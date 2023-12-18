package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("dushi.txt");

        Scanner scanner = new Scanner(file);
        String string = scanner.nextLine();
        String[] words = string.split("\\s+");

        while (scanner.hasNext())
            System.out.println(scanner.next());

        HashMap<String, Integer> book = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = book.get(word);
                if (count == null) {
                    count = 0;
                }
                book.put(word, ++count);
            }

        }
        for (String word : book.keySet())
        {
            System.out.println(word + " " + book.get(word));
        }
        }

    }

