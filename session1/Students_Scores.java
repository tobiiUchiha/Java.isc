package ir.isc.training1;

public class FirstSession {

	public static void main(String[] args) {
		
		int[] scores = {90,50,30,80,15,43,100};
		char[] grades = new char[scores.length];
		
		
		gradeCalculate(scores, grades);

		
		for (int i = 0; i < scores.length; i++) {
			 System.out.println("Student " + i + " score is " + scores[i] + " and grade is "+ grades[i] );
		}
		
		int maxScore = max(scores);
		System.out.println("The best score is " + maxScore );
		
	}
	

	public static void gradeCalculate(int[] scores, char[] grades) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90)
				grades[i] = 'A';
			else if (scores[i] >= 80)
				grades[i] = 'B';
			else if (scores[i] >= 70)
				grades[i] = 'C';
			else if (scores[i] >= 60)
				grades[i] = 'D';
			else
				grades[i] = 'F';
		
		}	
	}
	
	public static int max(int[] scores) {
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= maxScore)
				maxScore = scores[i];
		}
		return maxScore;
		
	}
}
