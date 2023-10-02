package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] twoDim = new int[12][8];
        Random random = new Random();

        for(int i=0;i<twoDim.length;i++)
            for (int j = 0; j < twoDim[i].length; j++)
                twoDim[i][j] = random.nextInt(50);

        System.out.println(Arrays.deepToString(twoDim));


        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i=0;i<twoDim.length;i++) {
            int sum = 0;
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = random.nextInt(50);
                sum = sum + twoDim[i][j];
                System.out.println(sum);
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            System.out.println(" index is " + maxSumIndex);
        }

    }

}
