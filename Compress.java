public class Compress {

	public static void main(String[] args) {
		System.out.print("Enter your String: ");
		String input = IO.readString();
		System.out.print("Your token is: ");
		IO.outputStringAnswer(compress(input));
	}
	
	public static String compress(String original){
		String temp = "";
		String token = "";
		boolean stop = false;
		int count = 1;
		int i,j;
		for(i= 0; i<original.length(); i++){
			j = i+1;
			if(i == original.length()-1 || original.charAt(i) != original.charAt(j)){
				if(count == 1){
					temp = original.charAt(i) + "";
				}else if(count != 1)temp = Integer.toString(count) + original.charAt(i);
				if(i == original.length()-1) stop = true;
				if(stop == true){
					if(count == 1)temp = original.charAt(i) + "";
					else if (count != 1)temp = Integer.toString(count) + original.charAt(i);
				}
				token += temp;
				count =1;
			}else{
				count++;
			}
		}		
		System.out.println(token);
		return token;	
	}
}
