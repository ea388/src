public class LuckyNines {
	
	public static int countLuckyNines(int lowerEnd, int upperEnd) {
		int count = 0;
		
		if(upperEnd <= lowerEnd){
			IO.reportBadInput();
			return -1;
		}
		
		for(int i =lowerEnd; i<=upperEnd; i++){
			System.out.println(i);
			if(i ==9){
				count++;
			}
			else if(i%10==9 || i/10 ==9){
				count++;
				if(i%10==9 && i/10 ==9) count++;
			}
			else if(i%100==9 || i/100 ==9){
				count++;
				if(i%100==9 && i/100 ==9) count++;
			}
			else if(i%1000==9 || i/1000 ==9){
				count++;
				if(i%1000==9 && i/1000 ==9) count++;
			}
		}
		System.out.println("Amount of '9' appears: ");
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		int lowerRange = IO.readInt();
		
		System.out.println("Enter second number");
		int upperRange = IO.readInt();
		
		IO.outputIntAnswer(countLuckyNines(lowerRange, upperRange));
		
			}

}
