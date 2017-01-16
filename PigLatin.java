
public class PigLatin {

	public static void main(String[] args) {
		System.out.print("Enter your word: ");
		String word = IO.readString();
		System.out.print("The translation is: ");
		IO.outputStringAnswer(translate(word));

	}
	
	public static String translate(String english){
		String pigLatin="";
		if(english.charAt(0)== 'A' ||english.charAt(0)=='E' 
				||english.charAt(0)== 'I' ||english.charAt(0)== 'O' ||english.charAt(0)== 'U'){
			pigLatin = english + "way";
		}else if (english.charAt(0)== 'a' ||english.charAt(0)=='e' 
				||english.charAt(0)== 'i' ||english.charAt(0)== 'o' ||english.charAt(0)== 'u'){
			pigLatin = english + "way";
		}else{
			pigLatin = english.substring(1) + english.substring(0,1)+"ay";
		}
		return pigLatin;
	}
}
