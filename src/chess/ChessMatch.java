package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		iSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i<board.getRows(); i++) {
			for(int j = 0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			} 
			
		}
		return mat;
	}
	
	public void iSetup() {
		for (int i = 0; i<8; i++) {
			board.placePiece(new Rook(board, Color.WHITE), new Position(2,i));
			board.placePiece(new Rook(board, Color.BLACK), new Position(5,i));

		}
		board.placePiece(new King(board, Color.WHITE), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,3));
	}
}