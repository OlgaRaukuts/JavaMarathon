package day17;
import java.util.Arrays;

import static day17.ChessPiece.*;

public class ChessBoard {
    ChessPiece[][] chessBoard;
    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j].getFigureLabel());
        }
            System.out.println();
    }
}
}
