package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();

    }

    public ChessPiece[][] getPiece() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
        for (int i = 0; i < board.getColums(); i++) {
            for (int j = 0; j < board.getColums(); j++) {
                mat[i][j] = (ChessPiece) board.peace(i, j);
            }
        }
        return mat;
    }
    // to set the coordinates  to chess no the matrix 
    private  void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1,new King(board, Color.WHITE));
    }
}
