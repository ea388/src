public class EvenOdd {

	public static void main(String[] args) {
		
		int numbers;
	
		for(int i=0; i<5; i++){
			System.out.println("Enter the numbers.");
			numbers = IO.readInt();
			if(numbers % 2 == 0){
				System.out.println("Even number");
			}
			else{
				System.out.println("Odd number");
			}
			System.out.println("Count Tracking: i = " + i);
			
		}
	}
}
