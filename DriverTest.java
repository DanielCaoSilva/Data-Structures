
// Daniel Silva
// CS1400, section 01
// Project 6 – Driver License Exam
// 10/30/2018

import java.util.Scanner;

public class DriverTest {

	public static final int numCorrect = 20;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numCorrect;
		int numIncorrect;
		char[] correct = { 'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C', 'C', 'D', 'D', 'D',
				'D', 'D' };
//	char[] studentTest = {'A','A','A','A','A','B','B','B','B','B','C','C','C','C','C','D','D','D','D','d'};
//	System.out.print(gradeExam(correct,studentTest));
		char[] student = new char[20];
		System.out.println("Enter your answers to the exam questions.");
		for (int i = 0; i < 20; i++) {
			System.out.print("Question " + (i + 1) + ": ");
			student[i] = kb.next().toUpperCase().charAt(0);
		}
		numCorrect = gradeExam(correct, student);
		numIncorrect = 20-numCorrect;
		System.out.println("**Correct Answers: " + numCorrect+"\n**Incorrect Answers: "+numIncorrect);
		if(numCorrect>=15)
			System.out.println("**You passed the exam.");
		else
			System.out.println("**You failed the exam.");
		System.out.println("You missed the following questions:");
		int[] missedArray = makeMissedArray(correct,student,numIncorrect);
		for(int j = 0; j<numIncorrect;j++)
		{
			System.out.print(missedArray[j]+" ");
		}
	}

	public static int gradeExam(char[] correct, char[] student) {
		int numCorrect = 0;
		for (int i = 0; i < 20; i++) {
			if (student[i] == correct[i])
				numCorrect++;
		}
		return numCorrect;
	}

	public static int[] makeMissedArray(char[] correct, char[] student, int numIncorrect) {
		int[] missedArray = new int[numIncorrect];
//		int j=0;
		for(int i = 0,j=0;i<20;i++)
		{
			if(correct[i]!=student[i])
			{
				missedArray[j]=(i+1);
				j++;
			}
		}
		return missedArray;
	}
}
