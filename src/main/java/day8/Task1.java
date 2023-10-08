package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbers = " ";

        for(int i = 0; i <= 20000; i++){
        numbers = numbers + i + " ";
            System.out.println(numbers);
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы: " + (stopTime - startTime));

        System.out.println(" ============================ ");
        long startTime1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(numbers);
        System.out.println(sb.toString());
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы: " + (stopTime1 - startTime1));

    }


}
