package FinalProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ship {
 private Scanner scanner = new Scanner(System.in);
    public void putShip(int shipDeck, String [][] shipCoordinate){
        for (int i = 4; i >= 1; i--) {
            // растановка самих кораблей
            for (int k = i; k <= 5 - i; k++) {
                System.out.println("Расставляем " + i + "-палубный корабль. Осталось расставить: " + (q + 1));

                System.out.println("Input x coord: ");
                x = scanner.nextInt();

                System.out.println("Input y coord: ");
                y = scanner.nextInt();

                System.out.println("1 - horizontal; 2 - vertical ?");
                position = scanner.nextInt();

                // если корабль располагаем горизонтально
                if (position == 1) {
                    // заполняем '1' столько клеток по горизонтали, сколько палуб у корабля
                    for (int q = 0; q < i; q++) {
                        playerField[y][x + q] = '1';
                    }
                }

                // если корабль располагаем вертикально
                if (position == 2) {
                    // заполняем столько клеток по вертикали, сколько палуб у корабля
                    for (int m = 0; m < i; m++) {
                        playerField[y + m][x] = '1';
                    }
                }
                // печатаем в консоли поле игрока, на котором будет видно, где игрок уже поставил корабли
                // о реализации метода - см. ниже
                printField(playerField);
            }
        }
    }
}
