package chess;

import boardgame.Board;

public class ChessMatch {

    Board board;

    public ChessMatch() {
        board = new Board(8, 8);

    }

    public ChessPiece[][] getPiece() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
        for (int i = 0; i < board.getColums(); i++) {
            for (int j = 0; j < board.getColums(); j++) {
            mat[i][j] = (ChessPiece) board.peace(i,j);
            }
        }
        return mat;
    }
}
