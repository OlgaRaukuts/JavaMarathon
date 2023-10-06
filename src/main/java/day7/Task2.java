package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int n = random(90,100);

        Player player = new Player(n);
        Player player1 = new Player(n);
        Player player2 = new Player(n);
        Player player3 = new Player(n);
        Player player4 = new Player(n);
        Player player5 = new Player(n);
        //Player player6 = new Player(n);


        System.out.println(player2.getStamina());
        System.out.println(player.getStamina());
        System.out.println(player1.getStamina());
        System.out.println(player3.getStamina());

        System.out.println(player.getStamina());

        System.out.println(Player.getCountPlayers());

        player5.run();
        player5.run();
        player5.run();
        System.out.println(player5.run());

        Player.info();

    }
    public static int random(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt(max - min) + min;
        return randomNum;
    }
}
