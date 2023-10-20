package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(recursionNum(357774267));
    }

    public static int recursionNum(int number){
        if (number == 0)
            return 0;

        if (number % 10  ==7 )
            return 1 + recursionNum(number/10);
        else
            return  recursionNum(number/10);
    }
}
