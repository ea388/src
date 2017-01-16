public class Palindrome{

	public static void main(String[] args){

		System.out.println(palindrome("racecar"));
		System.out.println(palindrome("palindrome"));
		System.out.println(palindrome2("RaceCar"));
		System.out.println(palindrome3("no lemon no melon"));
	}

	public static boolean palindrome(String s) {

		int len = s.length();

		for(int i = 0; i < len/2; i++) {

			if(s.charAt(i) != s.charAt(len-1-i)) {
				return false;
			}
		}

		return true;
	}

	public static boolean palindrome2(String s) {

		int len = s.length();
		String s2 = s.toLowerCase();

		for(int i = 0; i < len/2; i++) {

			if(s2.charAt(i) != s2.charAt(len-1-i)) {
				return false;
			}
		}

		return true;
	}


	public static boolean palindrome3(String s) {

		int len = s.length();
		String s2 = s.toLowerCase();
		String s3 = "";

		int prevIndex = -1;
		int currIndex = s2.indexOf(' ');

		while(currIndex != -1){

			s3 += s2.substring(prevIndex+1, currIndex);
			prevIndex = currIndex;
			currIndex = s2.indexOf(' ', currIndex+1);
		}

		if(prevIndex != len-1){
			s3 += s2.substring(prevIndex+1);
		}

		int len2 = s3.length();

		for(int i = 0; i < len2/2; i++) {

			if(s3.charAt(i) != s3.charAt(len2-1-i)) {
				return false;
			}
		}

		return true;
	}
}
