package day17;
import java.util.ArrayList;
import java.util.List;

import static day17.ChessPiece.*;

public class Task1 {
    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            figures.add(PAWN_WHITE.getFigureLabel());
        }
        for(int i = 0; i <4; i++){
            figures.add(ROOK_BLACK.getFigureLabel());
        }

        System.out.println(figures);
    }
}