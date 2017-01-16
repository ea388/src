
public class Change {

	public static void main(String[] args) {
		System.out.print("How much: ");
		double price = IO.readDouble();
		
		System.out.print("How much cash tendered? ");
		double payment = IO.readDouble();
		
		int bill20, bill10, bill5, bill1, q, d, n, p;
		
		if(price < 0 || payment < 0){
			IO.reportBadInput();
		}
		double change = payment - price;
		if(change < 0){
			System.out.println("Not enough money.");
			IO.reportBadInput();
		}
		do{
			if(change/20 > 0){
				bill20 = (int)change/20;
				System.out.println("$20 Bills: " + bill20);
				change -= (20*bill20);
				
				if(change/10 > 0){
					bill10 = (int)change/10;
					System.out.println("$10 Bills: " + bill10);
					change -= (10*bill10);
					
					if(change/5 > 0){
						bill5 = (int)change/5;
						System.out.println("$5 Bills: " + bill5);
						change -= (5*bill5);
						
						if (change/1 > 0){
							bill1 = (int)change/1;
							System.out.println("$1 Bills: " + bill1);
							change -= (1*bill1);
							
							if(change/0.25 > 0){
								q = (int) (change/0.25);
								System.out.println("Quarters: " + q);
								change -= (0.25 * q);
								
								if(change/ 0.10 > 0){
									d = (int) (change/0.10);
									System.out.println("Dimes: " + d);
									change -= (0.10 * d);
									
									if(change / 0.05 > 0){
										n = (int) (change/0.05);
										System.out.println("Nickels: " + n);
										change -= (0.05 * n);
										
										if(change / 0.01 > 0){
											p = (int) (change/0.01);
											System.out.println("Pennies (ick): " + p);
											change -= (0.01 * p);
										}
									}
										
								}
							}
						}
					}
				}
			}
		}while(change > 0); 
	}

}
