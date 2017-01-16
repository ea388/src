public class Party {

	public static void main(String[] args) {
		System.out.print("Enter people attending Party: ");
		int ppl = IO.readInt(); //ppl for people in attendance
		
		System.out.print("Enter how many slices will be eaten: ");
		int eat = IO.readInt(); //eat for slices eaten
		
		System.out.print("Enter how much soda each person will drink: ");
		int drink = IO.readInt(); //drink for soda drank
		
		System.out.print("Enter cost of one pie: ");
		double costPizza = IO.readDouble(); //costPizza for cost of pizza
		
		System.out.print("Enter number of slices in one pie: ");
		int slices = IO.readInt(); // slices for slices
		
		System.out.print("Enter cost of case of soda: ");
		double costCase = IO.readDouble(); // costCase for cost per case
		
		System.out.print("Enter cans of soda per case: ");
		int cans = IO.readInt(); //cans per case
		
		int pies = (ppl*eat)/slices;
		if((ppl*eat)%slices != 0){
			pies++;
		}
		int cases = (ppl*drink)/cans;
		if ((ppl*drink)%cans != 0){
			cases++;
		}
		
		double pizzaCost = pies*costPizza;
		double sodaCost =  cases*costCase;
		
		double partyCost = pizzaCost + sodaCost;
		IO.outputDoubleAnswer(partyCost);
		
		

	}

}
