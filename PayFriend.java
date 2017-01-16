
public class PayFriend {

	public static void main(String[] args) {
		System.out.print("How much would you like to transfer: ");
		double payment = IO.readDouble();
		if (payment <= 0){
			IO.reportBadInput();
		}
		double fee;
		if(payment > 0 && payment <= 100){
			fee = 5.0;
			System.out.print("Your fee is: ");
			IO.outputDoubleAnswer(fee);
		}
		else if (payment > 100 && payment < 1000){
			fee = payment * 0.03;
			if (fee < 6.0){
				fee = 6.0;
				System.out.print("Your fee is: ");
						IO.outputDoubleAnswer(fee);
			}
			else {
				System.out.print("Your fee is: ");
				IO.outputDoubleAnswer(fee);
			}
		}
		else if (payment >= 1000 && payment < 10000){
			fee = payment * 0.01;
			if (fee < 15.0){
				fee = 15.0;
				System.out.print("Your fee is: ");
						IO.outputDoubleAnswer(fee);
			}
			else {
				System.out.print("Your fee is: ");
				IO.outputDoubleAnswer(fee);
			}
		}
		else if (payment >= 10000){
			if (payment == 10000){
				fee = payment * 0.01;
				System.out.print("Your fee is: ");
				IO.outputDoubleAnswer(fee);
				}
			else if (payment > 10000 && payment <=15000){ //if money more than 10G's but only up to 15G's, then 100 + payment minus 10G's time 2%
				fee = 100 + ((payment - 10000)*0.02);
				System.out.print("Your fee is: ");
				IO.outputDoubleAnswer(fee);
			}
			else if(payment > 15000){
				fee = 200 + ((payment - 15000)*0.03);
				System.out.print("Your fee is: ");
				IO.outputDoubleAnswer(fee);
			}
		}
	}

}


