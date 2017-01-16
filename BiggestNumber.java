public class BiggestNumber{
	public static void main(String[] args){

		int numbers = IO.readInt();
		while(numbers <= 0){
			IO.reportBadInput();
			numbers = IO.readInt();
		}

		int biggest = IO.readInt();
		for(int i = 1; i < numbers; i++){
			int num = IO.readInt();
			if(num > biggest){
				biggest = num;
			}
		}

		System.out.println(biggest);
	}
}