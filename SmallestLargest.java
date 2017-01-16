
public class SmallestLargest {

	public static void main(String[] args) {
		double largest = Integer.MIN_VALUE;
		double smallest = Integer.MAX_VALUE;
		boolean isEquals = false;		
		
		System.out.println("Enter your first number(terminating value): ");
		double terminatingNum = IO.readDouble();
		
		System.out.println("Enter your second number: ");
		double testingNum = IO.readDouble();
				
		if(testingNum == terminatingNum){ //checks for error immediately			
			IO.reportBadInput();
			return;		
		}				
		largest = testingNum;
		smallest = testingNum;

		while(isEquals == false){
			System.out.println("Enter more numbers: ");
			testingNum = IO.readDouble();			
			
			if(testingNum == terminatingNum){
				System.out.println("Terminating value.");
				isEquals = true;
			}			
			if(testingNum>largest && testingNum != terminatingNum){
				largest = testingNum;
			}		
			if(testingNum<smallest && testingNum != terminatingNum){
				smallest = testingNum;
			}						
			
		}
		IO.outputDoubleAnswer(largest);
		IO.outputDoubleAnswer(smallest);
		
	}

}
