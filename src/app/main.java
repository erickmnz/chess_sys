package app;

import chess.ChessMatch;

public class main {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}

}
