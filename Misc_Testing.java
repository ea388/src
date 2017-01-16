public class Misc_Testing {

	public static void main(String[] args) {
		int x = IO.readInt();
		triangle(x);
	}
	public static int factorial(int n){
		if(n ==1) return 1;
		return n * factorial(n-1);
	}
	public static void triangle (int n) {
		 if (n == 1) {
		 printNStars(1);
		} else {
		 triangle(n-1);
		 printNStars(n);
		}
	}
	public static void printNStars (int n) {
		System.out.println(nTimesChar(n, '*'));
	}
	public static String nTimesChar (int n, char c) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result = result + c;
		}
		return result;
	}
}


