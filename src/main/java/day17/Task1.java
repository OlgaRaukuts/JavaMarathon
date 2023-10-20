package day17;

import java.util.ArrayList;
import java.util.List;

import static day17.ChessPiece.*;

public class Task1 {
    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();
        addFigure(ROOK_WHITE.getFigureLabel(), figures,4);
        addFigure(ROOK_BLACK.getFigureLabel(), figures,4);
        System.out.println(figures.toString());
    }

    public static void addFigure(String figure, List<String> chessBoard, int quantity){
        for(int i = 0; i < quantity; i++){
            chessBoard.add(figure);
        }
    }
}