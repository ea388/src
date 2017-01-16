
public class StringRec {

	public static void main(String[] args) {
		String orig = IO.readString();
		System.out.println(decompress(orig));
	}
	public static String decompress(String compressedText){
		String newString = "";
		int index = -1;
		//int num = 0;
		if(compressedText.length() == 1) return newString +=compressedText.indexOf(index);
		
		return newString += decompress(compressedText.substring(index, compressedText.length()-1));
		//index++;
		//return newString;
		
		
		
	}
}
