
public class CellPhoneBill {

	public static void main(String[] args) {
		System.out.print("How much is the base fee?"); //39.99
		double baseFee = IO.readDouble();
		
		System.out.print("How many minutes included?"); //100
		int freeMin = IO.readInt();
		
		System.out.print("How many minutes used?"); //100, 99, 101, 200
		int usedMin = IO.readInt();
		
		System.out.print("How much is the rate?"); // 0.10
		double rate = IO.readDouble();
		
		int overageMin = 0;
		double bill = 0.0;
		
		if(usedMin <0 || baseFee < 1 || freeMin<0  || rate < 0){
			IO.reportBadInput();
		}
		if(usedMin > freeMin){
			overageMin = usedMin - freeMin;
			bill = (overageMin * rate) + baseFee;
			System.out.print("You Owe: ");
			IO.outputDoubleAnswer(bill);
		}
		else{
			System.out.print("You Owe: ");
			IO.outputDoubleAnswer(baseFee);
		}

	}

}
