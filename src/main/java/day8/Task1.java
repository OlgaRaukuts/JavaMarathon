package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbers = " ";

        for(int i = 0; i <= 20000; i++){
        numbers = numbers + i + " ";
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы c классом String : " + (stopTime - startTime));
        System.out.println(numbers);

        System.out.println(" ============================ ");
        StringBuilder sb = new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++){
            sb.append(i).append(" ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder: " + (stopTime1 - startTime1));
        System.out.println(sb);
    }


}
