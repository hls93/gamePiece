package com.theironyard.installparty;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

		Random rand = new Random();
		int answer = rand.nextInt(50) + 1;


	    GamePiece gamePiece = new GamePiece();



	    gamePiece.move(answer, 5);
	    gamePiece.freeze();
	    gamePiece.move(answer, 6);
	    gamePiece.unfreeze();
	    gamePiece.move(answer, 7);
	    gamePiece.move(answer, 8);



    }
}
