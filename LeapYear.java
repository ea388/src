public class LeapYear {

	public static void main(String[] args) {
		System.out.print("Enter the year: ");
		int year = IO.readInt();
		boolean leapYr;
		if(year < 0){
			IO.reportBadInput();
		}
		if (year %4 == 0 && year%100 != 0 || year %400 ==0){
			leapYr = true;
		}
		else{
			leapYr = false;
		}
		if(leapYr == true){
			System.out.println("You have a leap year!");
		}
		else{
			System.out.println("You do not have a leap year.");
		}
	}

}
