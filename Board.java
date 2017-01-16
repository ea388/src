// May use System.out.print(ln)
// to make testing code easier.

public class Board {
	private char [][] board;
	private char player1;
	private char player2;
	private int numRows;
	private int numCols;
	private int p1WinCount;
	private int p2WinCount;
	private int overallTurnCount;
	
	public Board (){
		this.p1WinCount = 0; //to be used for isFinished
		this.p2WinCount =0;
		this.overallTurnCount =0;
		board = new char [6][7];
		for(int i = 0; i< board.length; i++){
			for(int j = 0; j< board[i].length; j++){
				board[i][j] = ' ';
			}
		}
	}
	public Board(int row, int col){
		this.overallTurnCount =0;
		this.p1WinCount = 0;
		this.p2WinCount =0;
		if(row > 0 && col > 0){
			this.numRows = row;
			this.numCols = col;
			board = new char[this.numRows][this.numCols];
			for(int i = 0; i< board.length; i++){
				for(int j = 0; j< board[i].length; j++){
					board[i][j] = ' ';
				}
			}
		}else{
			this.numRows = 6;
			this.numCols = 7;
			board = new char[this.numRows][this.numCols];
			for(int i = 0; i< this.board.length; i++){
				for(int j = 0; j< this.board[0].length; j++){
					board[i][j] = ' ';
				}
			}
		}
	}
	
	public int getNumRows(){
		return this.board.length;
	}
	public int getNumCols(){
		return this.board[0].length;
	}
	
	public void setPlayerOne(char o){//sets char representing player 1
		this.player1 = o;
	}
	public void setPlayerTwo(char t){ //sets char representing player 2
		this.player2 = t;
	}
	
	public char getPlayerOne(){ //returns char representing player 1
		return this.player1;
	}
	public char getPlayerTwo(){ //returns char representing player 2
		return this.player2;
	}
	
	public char getToken(int row, int col){ //return char representing token at 
											// (row,col); return '/0' if invalid
		if(row >=0 && row < this.board.length && col >=0 && col <this.board[0].length){
			return this.board[row][col];
		}
		return '\0';
	}
	
	public boolean canPlay(){ //returns true if a token 
							  //is still able to placed onto the board; otherwise false
		int count = 0;
		for(int j =0; j< board[0].length; j++){
				if(this.board[0][j] != ' '){
					count++;
					if(count == this.board[0].length) return false;
				}
			}
		
		return true;
	}
	
	public boolean play(int p, int c){ //c = col num
		if(p < 1|| p > 2 || c> this.board[0].length-1 || c < 0 || this.board[0][c]==this.player1 || this.board[0][c]== this.player2){
			System.out.println("Bad input");
			return false;
		}
		for(int i = board.length-1; i > -1; i--){
			if(this.board[i][c] == ' '){
				if(p == 1){
					this.board[i][c] = this.player1;
					this.overallTurnCount++;
					return true;
				}else if (p == 2){
					this.overallTurnCount++;
					this.board[i][c] = this.player2;
					return true;
				}
				
			}
		}
		return false; //NEVER supposed to happen!
	}
	
	public int isFinished(){ //returns 1 or if player 1 or 2 won
							 //returns 0 for tie, -1 for continue
		int count = 0;
		for(int j =0; j< this.board[0].length; j++){
			if(this.board[0][j] == this.player1 || this.board[0][j] == this.player2){
				count++;
				if(count == this.board[0].length) return 0;
			}
		}
		if(this.overallTurnCount >= 4 && this.canPlay() == true){
			for(int i=0; i< this.board.length; i++){
				for(int j=0; j< this.board[i].length; j++){
					//Horizontal
					if(this.board[i].length-1 -j >2){
						if(this.board[i][j] == this.player1 && this.board[i][j+1] == this.player1 
								&& this.board[i][j+2] == this.player1 && this.board[i][j+3] == this.player1){
							this.p1WinCount = 4;
							if(this.p1WinCount ==4) return 1;
						}else if(this.board[i][j] == this.player2 && this.board[i][j+1] == this.player2
								&& this.board[i][j+2] == this.player2 && this.board[i][j+3] == this.player2){
							this.p2WinCount = 4;
							if(this.p2WinCount ==4) return 2;
						}
					}
					//Vertical
					if(this.board.length-1 - i > 2){
						if(this.board[i][j] == this.player1 && this.board[i+1][j] == this.player1 &&
								this.board[i+2][j] == this.player1 && this.board[i+3][j] == this.player1){
							this.p1WinCount= 4;
							if(p1WinCount ==4)return 1;	
						}
						else if (this.board[i][j] == this.player2 && this.board[i+1][j] == this.player2 &&
								this.board[i+2][j] == this.player2 && this.board[i+3][j] == this.player2){
							this.p2WinCount = 4;
							if(p2WinCount== 4)return 2;
						}
					}
					//Diagonal
					if(this.board[i].length-1 -j >2){
						if(this.board[i][j] == this.player1 && this.board[i][j+1] == this.player1 
								&& this.board[i][j+2] == this.player1 && this.board[i][j+3] == this.player1){
							this.p1WinCount = 4;
							if(this.p1WinCount ==4) return 1;
						}else if(this.board[i][j] == this.player2 && this.board[i][j+1] == this.player2
								&& this.board[i][j+2] == this.player2 && this.board[i][j+3] == this.player2){
							this.p2WinCount = 4;
							if(this.p2WinCount ==4) return 2;
						}
					}
				}
			}
		}				
		return -1;
	}
	
	public void printBoard(){
		for(int i =0; i< this.board.length; i++){
			for(int j =0; j<board[i].length; j++){
				System.out.print(this.board[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void reset(){
		for(int i =0; i< this.board.length; i++){
			for(int j = 0; j< board[i].length; j++){
				if(this.board[i][j] == this.player1 || this.board[i][j] == this.player2) this.board[i][j] = ' ';
			}
		}
	}
	
	public static void main(String[] args) {
		Board b1 = new Board();
		b1.setPlayerOne('r');
		b1.setPlayerTwo('t');
		
		for(int i=0; i< 3; i++)b1.play(1,i);
		for(int i=0; i< 3; i++)b1.play(2,i);
		System.out.println(b1.getNumRows());
		System.out.println(b1.getNumCols());
		System.out.println(b1.getToken(0,2));
		System.out.println(b1.isFinished());
		b1.printBoard();
	}
}

	/*DIAGONAL
	 * if(this.board.length-1 -i >2 || this.board[0].length-1 -j >2){
						if(this.board[i][j] == this.player1 && this.board[i+1][j+1] == this.player1 && 
								this.board[i+2][j+2] == this.player1
								&& this.board[i+3][j+3] == this.player1){
							return 1;
						}
						else if (this.board[i][j] == this.player2 && this.board[i+1][j+1] == this.player2 && 
								this.board[i+2][j+2] == this.player2
								&& this.board[i+3][j+3] == this.player2){
							return 2;
						}
					}
					
	VERTICAL				
	    if(this.board.length-1 - i > 2){ 
						if(this.board[i][j] == this.player1 && this.board[i+1][j] == this.player1 &&
								this.board[i+2][j] == this.player1 && this.board[i+3][j] == this.player1){
							this.p1WinCount= 4;
							if(p1WinCount ==4)return 1;	
						}
						else if (this.board[i][j] == this.player2 && this.board[i+1][j] == this.player2 &&
								this.board[i+2][j] == this.player2 && this.board[i+3][j] == this.player2){
							this.p2WinCount = 4;
							if(p2WinCount== 4)return 2;
						}
					}
	DIAGONAL
			if(this.board[i].length-1 -j >2){
						if(this.board[i][j] == this.player1 && this.board[i][j+1] == this.player1 
								&& this.board[i][j+2] == this.player1 && this.board[i][j+3] == this.player1){
							this.p1WinCount = 4;
							if(this.p1WinCount ==4) return 1;
						}else if(this.board[i][j] == this.player2 && this.board[i][j+1] == this.player2
								&& this.board[i][j+2] == this.player2 && this.board[i][j+3] == this.player2){
							this.p2WinCount = 4;
							if(this.p2WinCount ==4) return 2;
						}
					}
					
		
					//Diagonal
					if(i>2 && this.board[0].length-1 -j >2){
						if(this.board[0].length-1 -j >2){
							if(this.board[i][j] == this.player1 && this.board[i+1][j+1] == this.player1 && 
									this.board[i+2][j+2] == this.player1
									&& this.board[i+3][j+3] == this.player1){
								return 1;
							}
							else if (this.board[i][j] == this.player2 && this.board[i+1][j+1] == this.player2 && 
									this.board[i+2][j+2] == this.player2
									&& this.board[i+3][j+3] == this.player2){
								return 2;
							}
						}
					}
		
	 */

