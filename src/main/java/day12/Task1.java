package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> listAuto = new ArrayList<>();
        listAuto.add("BMW");
        listAuto.add("Tesla");
        listAuto.add("Volkswagen");
        listAuto.add("Porshe");
        listAuto.add("KIA");

        System.out.println(listAuto);

        listAuto.set(2,"Toyota");
        listAuto.remove(0);

        System.out.println(listAuto);
    }
}
