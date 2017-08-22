package com.theironyard.installparty;

public class Main {

    public static void main(String[] args) {
	    GamePiece gamePiece = new GamePiece();



	    gamePiece.move(1, 2);
	    gamePiece.freeze();
	    gamePiece.move(2, 5);
	    gamePiece.unfreeze();
	    gamePiece.move(10, 3);


    }
}
