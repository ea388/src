public class LuckySevens {
	
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		int num1 = IO.readInt();
		
		System.out.println("Enter second number");
		int num2 = IO.readInt();
		
		int count = 0;
		
		if(num2 <= num1){
			IO.reportBadInput();
			return;
		}
		
		for(int i =num1; i<=num2; i++){
			System.out.println(i);
			
			if(i ==7){
				count++;
			}
			else if(i%10==7 || i/10 ==7){
				count++;
				if(i%10==7 && i/10 ==7) count++;
			}
			else if(i%100==7 || i/100 ==7){
				count++;
				if(i%100==7 && i/100 ==7) count++;
			}
			else if(i%1000==7 || i/1000 ==7){
				count++;
				if(i%1000==7 && i/1000 ==7) count++;
			}
			else if(i%10000==7 || i/10000 ==7){
				count++;
				if(i%10000==7 && i/10000 ==7) count++;
			}
		
		}
		System.out.println("Amount of '7' appears ");
		IO.outputIntAnswer(count);
	}

}
