package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();


       for(int i=0;i<array.length;i++)
           array[i] = random.nextInt(10000);

       int max = 0;
       for(int numbers:array){
           if(numbers>max)
           max = numbers;
       }
        System.out.println(max);

       int min = 10000;
       for(int numbers:array){
           if(numbers<min)
               min = numbers;
       }
        System.out.println(min);

       int counter =0;
       for (int element:array){
           if(element % 10 ==0)
               counter++;
       }
        System.out.println(counter);

       int sum =0;
       for(int element:array){
           sum = sum+element;
       }
        System.out.println(sum);
    }

}
