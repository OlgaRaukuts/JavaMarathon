package day19.task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<Integer,Point> coordinates = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("taxi_cars.txt")));


        }catch (Exception e) {
            System.out.println(e);
        }


    }
}

