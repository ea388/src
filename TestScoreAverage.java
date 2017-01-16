
public class TestScoreAverage {
	public static void main (String[]args){
		System.out.print("Input number of exams: ");
		int numExams = IO.readInt();
		int x = 0;
		int examGrade;
		double totalGrade = 0;
		double testAverage = 0.0;
		if (numExams < 2){
			IO.reportBadInput();
		}
		while (x < numExams){
			
				System.out.print("Enter exam grade: ");
				examGrade = IO.readInt();
				if(examGrade < 0){
					IO.reportBadInput();
				}
				totalGrade += examGrade;
				IO.outputDoubleAnswer(totalGrade);
				x++;
			}
		
		testAverage = totalGrade/numExams;
		System.out.print("Your Average is: ");
		IO.outputDoubleAnswer(testAverage);
	}
}
