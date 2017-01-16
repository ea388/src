public class ConnectFour{
	//This is a testing program to make sure all your code works well enough
	
	public static void main(String[] args){
		
		//Create new board object
		Board game = new Board();
		//Set player tokens for player 1 and player 2
		//game.setPlayerOne('r');
		game.setPlayerOne('t');
		//Create Player objects
		//Note, the code below works because of the interface Player. All classes that "implement" Player can be
		// typed as Player. Makes switching from Human to AI Players really easy. For a challenge, you might
		// consider:
		//		1. asking the user whether he/she wants to play against a human or a computer
		//		2. implementing multiple AI players (easy, med, hard) that the user can choose to play against
		
		//Player p1 = new HumanPlayer(1,6,7);
		//Player p2 = new HumanPlayer(1,6,7); //comment this line when testing AIPlayer
		
		Player ai = new AIPlayer(1,6,7); //uncomment this line when testing AIPlayer
		
		
		//Print your empty board
		game.printBoard();
		
		//WHILE the board is still playable
		//	get a column to play from player 1
		//	play that token on the board
		//  print the board
		//		has anyone won yet?
		// do the above for player 2
		
		// Get the status code from the board (isFinished())
		
		// Print out the results of the game
		/*while(game.isFinished() == -1){
			game.play(1, ai.playToken());
			game.printBoard();
			game.isFinished();
		}*/
		game.play(1, ai.playToken());
		game.play(1, ai.playToken());
		game.play(1, ai.playToken());
		game.printBoard();
		ai.reset();
		game.printBoard();
	}
	
}