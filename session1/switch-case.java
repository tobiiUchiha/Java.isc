package ir.isc.training1;

import java.util.Iterator;
import java.math.*;

public class FirstSession {

	public static void main(String[] args) {
		int score = 90;
		char gradeName;
		switch ((score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F') {
		case 'A':
			gradeName = 'A';
			System.out.println(gradeName);
			break;
		case 'B':
			gradeName = 'B';
			System.out.println(gradeName);
			break;
		case 'C':
			gradeName = 'C';
			System.out.println(gradeName);
			break;
		case 'D':
			gradeName = 'D';
			System.out.println(gradeName);
			break;
		default:
			gradeName = 'F';
			System.out.println(gradeName);
			break;
		}
	}
}
