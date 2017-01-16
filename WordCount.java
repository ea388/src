
public class WordCount {

	public static void main(String[] args) {
		System.out.print("Please enter your sentence: ");
		String input = IO.readString();
		System.out.print("Please enter your number: ");
		int num = IO.readInt();
		IO.outputIntAnswer(countWords(input, num));
		
	}
	public static int countWords (String original, int minLength){
		int count = 0;
		int wordSize = 0;
		for(int i = 0; i<original.length(); i++){
			if(original.charAt(i) == ' ' || i == original.length() -1){
				if(wordSize >= minLength) count++;
				wordSize = 0;
			}
			else if(original.charAt(i) != ' '){
				if(Character.isLetter(original.charAt(i))){
					wordSize++;
				}
			}
		}
		return count;
	}
}