public class HumanPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	private int player;
	private int numRow;
	private int numCol;
	private int lastMove;
	private int tokenDrop;
	private Board b1;
	
	
	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public HumanPlayer(int playerID, int row, int col){
		if(playerID ==1 || playerID == 2){
			this.player = playerID;
		}
		else this.player = 2;
		if(row > 0 && col > 0){
			this.numRow = row;
			this.numCol = col;
		}else{
			this.numRow = 6;
			this.numCol = 7;
		}
		this.lastMove = -1;
		this.tokenDrop = -1;
		b1= new Board(this.numRow, this.numCol);
	}
	
	//used to notify your AI player of the other players last move
	public void lastMove(int c) {
		c = this.lastMove;
	}
	
	//returns column of where to play a token
	public int playToken(){
		
		this.tokenDrop = IO.readInt();
		while( b1.play(this.player, this.tokenDrop) == false){
			this.tokenDrop= IO.readInt();
		}
		this.lastMove = this.tokenDrop;
		b1.printBoard();
		return tokenDrop;
		
	}
	
	//get this player's id
	public int getPlayerID(){
		return this.player;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
		b1.reset();
	}
	public static void main(String [] args){
		HumanPlayer h1 = new HumanPlayer(1,6,7);
		h1.playToken();
	}
	
}