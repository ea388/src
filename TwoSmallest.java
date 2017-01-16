public class TwoSmallest {

	public static void main(String[] args) {
		
		double secondSmallest = Integer.MAX_VALUE;
		double smallest = Integer.MAX_VALUE;
		boolean isEquals = false;
				
		System.out.println("Enter your first number(terminating value): ");
		double terminatingNum = IO.readDouble();
		
		System.out.println("Enter your second number: ");
		double testingNum = IO.readDouble();
		
		while(testingNum == terminatingNum){ //checks for error immediately
			System.out.println("Enter your number again");
			IO.reportBadInput();
			testingNum = IO.readDouble();
			if(testingNum != terminatingNum) break;			
		}		
		smallest = testingNum; // automatically assigns the first input to the smallest value
		secondSmallest = testingNum; //since we have only one number right now, smallest and second smallest should be the same				
		
		while(isEquals == false){
			System.out.println("Enter more numbers: ");
			testingNum = IO.readDouble();
			
			if(testingNum == terminatingNum ){ //checks for termination
				System.out.println("Terminating value.");
				isEquals = true;
			}			
			//searching and assigning
			if((testingNum > smallest && testingNum<secondSmallest) && testingNum != terminatingNum){
				testingNum = secondSmallest;
			}
			else if(testingNum <smallest && testingNum != terminatingNum){
				secondSmallest = smallest; //take secondSmallest, assign to value of smallest
				smallest = testingNum;
				//move stuff down 
			}
		}			
		
		System.out.println("Smallest value is: ");
		IO.outputDoubleAnswer(smallest);
		
		System.out.println("Second smallest value is: ");
		IO.outputDoubleAnswer(secondSmallest);
		
	}

}
