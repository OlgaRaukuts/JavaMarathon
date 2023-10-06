package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run(){
        stamina--;
        if(stamina == MIN_STAMINA){
            System.out.println("The player needs rest");
        }
        return stamina;
    }

    public static void info(){
        int maxPlayers = 6;
        int needPlayers = maxPlayers - countPlayers ;

        if(needPlayers > 0) {
            System.out.println("Команды неполные. На поле еще есть" + needPlayers + " свободных мест");
        }else{
            System.out.println("На поле нет свободных мест");
        }

    }

}
