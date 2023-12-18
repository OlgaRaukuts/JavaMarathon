package FinalProject;

import java.util.Scanner;

public class BattleField {

    private int [][] battleField;
    String playerName;
    Scanner scanner = new Scanner(System.in);

    private boolean playerFieldArranged;
    public BattleField(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public int[][] getBattleField() {
        return battleField;
    }

    public boolean isPlayerFieldArranged() {
        return playerFieldArranged;
    }

    public void enterPlayers(){
            System.out.println("Player 1, please, input your name");
            String playerName = scanner.nextLine();
            System.out.println("Hello, " + playerName + "!");
            System.out.println("Player 2, please, input your name");
            String player1Name = scanner.nextLine();
            System.out.println("Hello, " + player1Name + "!");

    }
    public void putShips(){

    }
    public void printField() {

    }

}
