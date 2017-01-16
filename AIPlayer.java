public class AIPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	private int player;
	private int numRow;
	private int numCol;
	private int lastMove;
	private int tokenDrop;
	Board b1;
	
	
	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public AIPlayer(int playerID, int row, int col){
		if(playerID ==1 || playerID == 2){
			this.player = playerID;
		}
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
		
		this.tokenDrop = (int) (7*(Math.random()));
		this.lastMove = this.tokenDrop;
		return tokenDrop;
	}
	
	//get this player's id
	public int getPlayerID(){
		return this.player;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
		b1= new Board(this.numRow, this.numCol);
	}
	public static void main(String [] args){
		
	}
	
}